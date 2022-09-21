package com.template.view

import com.template.presenter.mainpresenter.DataApi
import com.template.R



object Model: DataApi {
    private var minus = true
    private var betCountXXX = 0
    private var winCount = 0
    private var winLine = booleanArrayOf(false,false,false)
    private val listSlots = mutableListOf(0,0,0)
    private var BET:Int = 5
    private var MAINcount:Int = 1000


    val slots = listOf(
        R.drawable.kiwi,R.drawable.kiwi,R.drawable.kiwi,R.drawable.kiwi,R.drawable.kiwi,
        R.drawable.kiwi,R.drawable.kiwi,R.drawable.kiwi,R.drawable.kiwi,R.drawable.kiwi,
        R.drawable.kiwi,R.drawable.kiwi,R.drawable.kiwi, //13
        R.drawable.seven2,R.drawable.seven2,R.drawable.seven2,R.drawable.seven2,R.drawable.seven2,
        R.drawable.seven2,R.drawable.seven2,//7
        R.drawable.cherry,R.drawable.cherry,R.drawable.cherry,R.drawable.cherry,R.drawable.cherry,//5
        R.drawable.raspberry,R.drawable.raspberry,R.drawable.raspberry,R.drawable.raspberry,R.drawable.raspberry,
        R.drawable.raspberry,R.drawable.raspberry,R.drawable.raspberry,R.drawable.raspberry,R.drawable.raspberry,
        R.drawable.raspberry,R.drawable.raspberry,R.drawable.raspberry,R.drawable.raspberry,R.drawable.raspberry,//15
        R.drawable.strawberry,R.drawable.strawberry,R.drawable.strawberry,R.drawable.strawberry,R.drawable.strawberry,
        R.drawable.strawberry,R.drawable.strawberry,R.drawable.strawberry,R.drawable.strawberry,R.drawable.strawberry,//10

    )


    override fun setMainCount( bet: Int, minusOrPlus: Boolean) = if(minusOrPlus) MAINcount += bet
    else MAINcount -= bet

    override fun setMainCount(int: Int) {
        MAINcount = int
    }

    override fun getMainCount() = MAINcount


    override fun setBet(string: String) {
       BET = string.toInt()
    }

    override fun setBet(i: Int) {
        BET = i
    }


    override fun getBet(): Int = BET

    override fun setSlot() {
        for(i in 0..2)
        listSlots[i] = slots.random()
    }

    override fun getSlot() = listSlots

}





