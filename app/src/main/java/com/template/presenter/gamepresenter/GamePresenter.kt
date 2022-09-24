package com.template.presenter.gamepresenter

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Context
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import android.view.animation.LinearInterpolator
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.view.isVisible
import com.template.presenter.mainpresenter.DataApi
import com.template.R
import com.template.view.Model
import java.text.DecimalFormat


class GamePresenter (val data: DataApi) {
    var winBet = 0
    val SIZE_SLOTS_MAX = 1.1F
    val SIZE_SLOTS_MIN = 0.9F
    val SIZE_SLOTS_DEFUELT = 1F
    val REPLASE_CARD_Y = 0F
    var xBetCount = 0
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
       context!!.clickOk()
}

    fun animateSlotLine(viewImgStart: ImageView,viewImgFinish:ImageView, viewLine:View, res:Int,
                        height:Float, heightConteiner: Float,  time:Long){

        viewImgFinish.setImageResource(res)
        //viewLine.y = -12128F

        val animator333 = ObjectAnimator.ofFloat(viewLine, View.TRANSLATION_Y,
            - viewLine.height.toFloat() + height)// + ((heightConteiner - height)))
        animator333.duration = 0
        animator333.start()

        Handler(Looper.getMainLooper()).postDelayed({
            val animator333 = ObjectAnimator.ofFloat(viewLine, View.TRANSLATION_Y,0 //viewLine.height - (imgView.height*8)
                .toFloat())
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

//fun getSlots() = data.getSlot()


private fun checkLine(img1:Int, img2: Int, img3:Int):Boolean{
if(( img1 == img2) and (img2 == img3)) {
    when(img1 ) {
        R.drawable.kiwi -> {
            xBetCount = 1
            winBet = winBet+getBet()
            betCountXXX += xBetCount
        }
        R.drawable.raspberry -> {
            xBetCount = 2
            winBet = winBet+getBet()*2
            betCountXXX += xBetCount
        }
        R.drawable.seven2 -> {
            xBetCount = 5
            winBet = winBet+getBet()*5
            betCountXXX += xBetCount
        }
        R.drawable.cherry -> {
            xBetCount = 10
            winBet = winBet+getBet()*10
            betCountXXX += xBetCount
        }
    }
    setMainCount(winBet,true)
    setMainCount(data.getBet(),false)
}
          return ( img1 ==  img2) and ( img2 ==  img3)
}

    fun animationVin(view1:ImageView, view2:ImageView, view3:ImageView, betCount: TextView,
                     betCountSmile: TextView, TVvin: TextView, TVxxx: TextView, line:View
                     ,cardView:View,balans:TextView){
        if (checkLine(data.getSlot()[0], data.getSlot()[1], data.getSlot()[2])) {
            Handler(Looper.getMainLooper()).postDelayed({
                animationSlot( view1, betCount, betCountSmile, TVvin)
                animationSlot( view2, betCount, betCountSmile, TVvin)
                animationSlot( view3, betCount, betCountSmile, TVvin)
                animationLine( /*TVxxx,*/ line)
            }, 5000)
            Handler(Looper.getMainLooper()).postDelayed({
                aimationWinResult(cardView, betCount, balans, TVxxx)
            },7000)

        }
    }

    fun aimationWinResult(view:View,result:TextView,balans: TextView,xBet:TextView) {
        var time = 500
        xBet.text = "${xBetCount}X BET"
            val animator = ObjectAnimator.ofFloat(view, View.Y, 600F)
            animator.duration = 500
            animator.start()
            val animator2 = ObjectAnimator.ofFloat(view, View.ALPHA, 1F)
            animator2.duration = 500
            animator2.start()
         val partResult = (Model.getMainCount().toFloat()/100F)
         var plusResult = 0F
        repeat(100){
            time += 20
            Handler(Looper.getMainLooper()).postDelayed({
                plusResult += partResult
                result.text = DecimalFormat("#0.00").format(plusResult)
                if(it == 19){
                    balans.text = Model.getMainCount().toString()
                }
            }, time.toLong())
        }
    }

        private fun animationLine( /*TVxxx: TextView,*/ line: View) {
            var visibility = true
            var timer = 0L

            repeat(10) {
                timer = timer + 500

                Handler(Looper.getMainLooper()).postDelayed({
                    if (visibility) {
                        line.isVisible = true
                        visibility = false

                    } else {
                        line.isVisible = false
                        visibility = true
                    }
                }, timer)

            }
        }

    private fun animationSlot( view2: ImageView, betCount: TextView
                              , betCountSmile: TextView, TVvin: TextView) {
        var timer = 0L
        var visibility = true
        repeat(21) {
            timer = timer + 250
            Handler(Looper.getMainLooper()).postDelayed({
            if(visibility){
           //     animationSmile(betCount, betCountSmile, TVvin)
                val animator111 = ObjectAnimator.ofFloat(view2, View.SCALE_X, SIZE_SLOTS_MAX,)
                animator111.duration = 250
                animator111.start()
                val animator222 = ObjectAnimator.ofFloat(view2, View.SCALE_Y, SIZE_SLOTS_MAX)
                animator222.duration = 250
                animator222.start()
                visibility = false

            }else {
                if(it != 20){
          //      animationSmile(betCount, betCountSmile, TVvin)
                val animator111 = ObjectAnimator.ofFloat(view2, View.SCALE_X, SIZE_SLOTS_MIN,)
                animator111.duration = 250
                animator111.start()
                val animator222 = ObjectAnimator.ofFloat(view2, View.SCALE_Y, SIZE_SLOTS_MIN)
                animator222.duration = 250
                animator222.start()
                visibility = true
                } else {
           //         animationSmile(betCount, betCountSmile, TVvin)
                    val animator111 = ObjectAnimator.ofFloat(view2, View.SCALE_X, SIZE_SLOTS_DEFUELT)
                    animator111.duration = 250
                    animator111.start()
                    val animator222 = ObjectAnimator.ofFloat(view2, View.SCALE_Y, SIZE_SLOTS_DEFUELT)
                    animator222.duration = 250
                    animator222.start()
                }
            }
          },timer)

        }}

}
