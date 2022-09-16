package com.template.gamepresenter

import com.template.R
import com.template.mainpresenter.DataApi

class GamePresenter (val data: DataApi) {
    var winBet = 0
    var winLine1 = false
    var winLine2 = false
    var winLine3 = false
    var minus = false
    var betCountXXX = 0

    fun init(_view: GameViewApi){
        context = _view
        setSlots()
context!!.showData()
context!!.clickBack()
context!!.clickBet()
context!!.clickSpin()
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
}
fun getSlots() = data.getSlot()
fun win(win:() -> Unit) {
   winLine1 =  checkLine(data.getSlot()[0], data.getSlot()[1], data.getSlot()[2])
   winLine2 =  checkLine(data.getSlot()[3], data.getSlot()[4], data.getSlot()[5])
   winLine3 =  checkLine(data.getSlot()[6], data.getSlot()[7], data.getSlot()[8])

    if ((winLine1) or
        (winLine2) or
        (winLine3)) {
win()
    }
}


private fun checkLine(int1:Int, int2: Int, int3 : Int):Boolean{
if(( int1 == int2) and (int2 == int3)) {
    when(int1 ) {
        R.drawable.kiwi -> {
            winBet = winBet+getBet()
            betCountXXX += 1

        }

        R.drawable.raspberry -> {
            winBet = winBet+getBet()*2
            betCountXXX += 2
        }
        R.drawable.strawberry -> {
            winBet = winBet+getBet()*5
            betCountXXX += 5
        }
        R.drawable.seven2-> {
            winBet = winBet+getBet()*10
            betCountXXX += 10
        }
        R.drawable.cherry -> {
            winBet = winBet+getBet()*3
            betCountXXX += 3
        }
    }
    setMainCount(winBet,true)
    setMainCount(data.getBet(),false)

}
return ( int1 ==  int2) and ( int2 == int3  )
}
}