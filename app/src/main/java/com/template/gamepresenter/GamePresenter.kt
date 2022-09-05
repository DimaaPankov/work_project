package com.template.gamepresenter

import com.template.mainpresenter.DataApi

class GamePresenter (val data: DataApi) {
    var winBet = 0
    var winLine1 = false
    var winLine2 = false
    var winLine3 = false
    var minus = false
    var betCountXXX = 0
//gitrigvhrewdhttps://github.com/DimaaPankov/work_project.git4g3v34gh5g34fe

    fun init(_view: GameViewApi){
        context = _view
        setSlots()
context!!.showData()
context!!.clickBack()
context!!.clickBet()
context!!.clickSpin()
//erbhotrejbhitbgit
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

private fun checkLine(string1:String, string2: String, string3:String):Boolean{
if(( string1 == string2) and (string2 == string3)) {
    when(string1 ) {
        "\uD83C\uDF4C" -> {
            winBet = winBet+getBet()
            betCountXXX += 1

        }

        "\uD83C\uDF52" -> {
            winBet = winBet+getBet()*2
            betCountXXX += 2
        }
        "\uD83C\uDF53" -> {
            winBet = winBet+getBet()*5
            betCountXXX += 5
        }
        "\uD83E\uDD65" -> {
            winBet = winBet+getBet()*10
            betCountXXX += 10
        }
        "\uD83C\uDF4D" -> {
            winBet = winBet+getBet()*3
            betCountXXX += 3
        }
    }
    setMainCount(winBet,true)
    setMainCount(data.getBet(),false)

}
return ( string1 ==  string2) and ( string2 ==  string3)
}
}