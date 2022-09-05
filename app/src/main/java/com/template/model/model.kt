package com.template.view

import com.template.mainpresenter.DataApi



object Model: DataApi {
    private var minus = true
    private var betCountXXX = 0
    private var winCount = 0
    private var winLine = booleanArrayOf(false,false,false)
    private val listSlots = mutableListOf<String>("","","","","","","","","")
    private var BET:Int = 5
    private var MAINcount:Int = 1000


    var slots = listOf(
        //26% 🍒
        "\uD83C\uDF52","\uD83C\uDF52","\uD83C\uDF52","\uD83C\uDF52","\uD83C\uDF52",
        "\uD83C\uDF52","\uD83C\uDF52","\uD83C\uDF52","\uD83C\uDF52","\uD83C\uDF52",
        "\uD83C\uDF52","\uD83C\uDF52","\uD83C\uDF52",
        //14%🍓
        "\uD83C\uDF53","\uD83C\uDF53", "\uD83C\uDF53","\uD83C\uDF53", "\uD83C\uDF53",
        "\uD83C\uDF53","\uD83C\uDF53",
        //10% 🥥
        "\uD83E\uDD65","\uD83E\uDD65","\uD83E\uDD65","\uD83E\uDD65","\uD83E\uDD65",
        //30%🍌
        "\uD83C\uDF4C", "\uD83C\uDF4C","\uD83C\uDF4C","\uD83C\uDF4C","\uD83C\uDF4C",
        "\uD83C\uDF4C", "\uD83C\uDF4C","\uD83C\uDF4C","\uD83C\uDF4C","\uD83C\uDF4C",
        "\uD83C\uDF4C", "\uD83C\uDF4C","\uD83C\uDF4C","\uD83C\uDF4C","\uD83C\uDF4C",
        //20%🍍
        "\uD83C\uDF4D","\uD83C\uDF4D","\uD83C\uDF4D","\uD83C\uDF4D","\uD83C\uDF4D",
        "\uD83C\uDF4D","\uD83C\uDF4D","\uD83C\uDF4D","\uD83C\uDF4D","\uD83C\uDF4D"
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
        for(i in 0..8)
        listSlots[i] = slots.random()
    }

    override fun getSlot() = listSlots

}





