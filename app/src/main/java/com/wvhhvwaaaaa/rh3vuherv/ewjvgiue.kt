package com.wvhhvwaaaaa.rh3vuherv

import com.wvhhvwaaaaa.R
import com.wvhhvwaaaaa.ju4vcueyrv.eqvjirwhbiv

class ewjvgiue (val wegbu9b: eqvjirwhbiv) {
    var ewguegbvu = 0
    var eguerwub = false
    var egbuwbe = false
    var brwb = false
    var ebieb = false
    var ebuewb = 0

    fun wrbwreb(werbvwerb: vjguirgv){
        eiwbewib = werbvwerb
        egvbjeb()
eiwbewib!!.ew9bur()
eiwbewib!!.ewewb()
eiwbewib!!.bvev()
eiwbewib!!.wrebwe()
}



fun setMainCount(bet:Int,minusOrPlus:Boolean){
wegbu9b.ghwribg(bet,minusOrPlus)
}

fun getBet() = wegbu9b.weugbuo()
fun getMainCont():Int = wegbu9b.webghwireb()

fun setBet(int: Int) = wegbu9b.weugoewdub(int)
private var eiwbewib: vjguirgv? = null


fun distroy(){
eiwbewib = null
}
fun egvbjeb(){
wegbu9b.eugbiwrb()
}
fun getSlots() = wegbu9b.bifdbhio()
fun win(win:() -> Unit) {
   eguerwub =  checkLine(wegbu9b.bifdbhio()[0], wegbu9b.bifdbhio()[1], wegbu9b.bifdbhio()[2])
   egbuwbe =  checkLine(wegbu9b.bifdbhio()[3], wegbu9b.bifdbhio()[4], wegbu9b.bifdbhio()[5])
   brwb =  checkLine(wegbu9b.bifdbhio()[6], wegbu9b.bifdbhio()[7], wegbu9b.bifdbhio()[8])

    if ((eguerwub) or
        (egbuwbe) or
        (brwb)) {
win()
    }
}


private fun checkLine(int1:Int, int2: Int, int3 : Int):Boolean{
if(( int1 == int2) and (int2 == int3)) {
    when(int1 ) {
        R.drawable.kiwi -> {
            ewguegbvu = ewguegbvu+getBet()
            ebuewb += 1

        }

        R.drawable.raspberry -> {
            ewguegbvu = ewguegbvu+getBet()*2
            ebuewb += 2
        }
        R.drawable.strawberry -> {
            ewguegbvu = ewguegbvu+getBet()*5
            ebuewb += 5
        }
        R.drawable.seven2-> {
            ewguegbvu = ewguegbvu+getBet()*10
            ebuewb += 10
        }
        R.drawable.cherry -> {
            ewguegbvu = ewguegbvu+getBet()*3
            ebuewb += 3
        }
    }
    setMainCount(ewguegbvu,true)
    setMainCount(wegbu9b.weugbuo(),false)

}
return ( int1 ==  int2) and ( int2 == int3  )
}
}