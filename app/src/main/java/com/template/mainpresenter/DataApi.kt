package com.template.mainpresenter

interface DataApi {
   fun setMainCount(bet:Int,minusOrPlus:Boolean)
   fun setMainCount(int:Int)
   fun getMainCount():Int

   fun setBet(string:String)
   fun setBet(i:Int)
   fun getBet():Int

   fun setSlot()
   fun getSlot():MutableList<Int>

}