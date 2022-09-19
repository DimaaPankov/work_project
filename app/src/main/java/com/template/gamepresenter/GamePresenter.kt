package com.template.gamepresenter

import android.animation.ObjectAnimator
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import com.template.mainpresenter.DataApi
import com.template.R

class GamePresenter (val data: DataApi) {
    var winBet = 0
    var winLine1 = false
    var winLine2 = false
    var winLine3 = false
    var minus = false
    var betCountXXX = 0
    var lastSlot1 = 0
    var lastSlot2 = 0
    var lastSlot3 = 0


    fun init(_view: GameViewApi){
        context = _view

       context!!.showData()
       context!!.clickBack()
       context!!.clickBet()
       context!!.clickSpin()
}

    fun animateSlotLine(viewImgStart: ImageView,viewImgFinish:ImageView, viewLine:View, res:Int, time:Long){

        viewImgFinish.setImageResource(res)
        viewLine.y = -12128F

        Handler(Looper.getMainLooper()).postDelayed({
            val animator333 = ObjectAnimator.ofFloat(viewLine, View.Y, 3F)
            animator333.duration = 3000
            animator333.start()

        }, time)
        Handler(Looper.getMainLooper()).postDelayed({
            viewImgStart.setImageResource(res)
        },time+500)
    }

fun setMainCount(bet:Int,minusOrPlus:Boolean){
data.setMainCount(bet,minusOrPlus)
}

fun getBet() = data.getBet()
fun getMainCont():Int = data.getMainCount()

fun setBet(int: Int) = data.setBet(int)
private var context: GameViewApi? = null


fun distroy(){
context = null
}
fun setSlots(){
data.setSlot()
    lastSlot1 = data.getSlot()[0]
    lastSlot2 = data.getSlot()[1]
    lastSlot3 = data.getSlot()[2]
}
fun getSlots() = data.getSlot()
fun win(win:() -> Unit) {
   winLine1 =  checkLine(data.getSlot()[0], data.getSlot()[1], data.getSlot()[2])


    if (checkLine(data.getSlot()[0], data.getSlot()[1], data.getSlot()[2])) { win() }
}

private fun checkLine(img1:Int, img2: Int, img3:Int):Boolean{
if(( img1 == img2) and (img2 == img3)) {
    when(img1 ) {
        R.drawable.kiwi -> {
            winBet = winBet+getBet()
            betCountXXX += 1
        }

        R.drawable.raspberry -> {
            winBet = winBet+getBet()*2
            betCountXXX += 2
        }
        R.drawable.seven2 -> {
            winBet = winBet+getBet()*5
            betCountXXX += 5
        }
        R.drawable.cherry -> {
            winBet = winBet+getBet()*10
            betCountXXX += 10
        }

    }
    setMainCount(winBet,true)
    setMainCount(data.getBet(),false)
}
return ( img1 ==  img2) and ( img2 ==  img3)
}
}