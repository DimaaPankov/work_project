package com.template.ksafsa

import com.template.ekhfe.kfhaskf.adigkhdg
import com.template.R



object codg: adigkhdg {
    private var goplsdg = true
    private val odagkhds = mutableListOf(0,0,0)
    private var olgejjda:Int = 5
    private var dlgsss:Int = 1000


    val slots = listOf(

        R.drawable.seven2,
        R.drawable.cherry,
        R.drawable.strawberry,R.drawable.strawberry,R.drawable.strawberry
    )


    override fun setMainCount( bet: Int, minusOrPlus: Boolean) = if(minusOrPlus) dlgsss += bet
    else dlgsss -= bet

    override fun setMainCount(int: Int) {
        dlgsss = int
    }

    override fun getMainCount() = dlgsss


    override fun setBet(string: String) {
       olgejjda = string.toInt()
    }

    override fun setBet(i: Int) {
        olgejjda = i
    }


    override fun getBet(): Int = olgejjda

    override fun setSlot() {
        for(i in 0..2)
        odagkhds[i] = slots.random()
    }

    override fun getSlot() = odagkhds

}





