package com.template.view

import android.content.Context
import android.content.SharedPreferences
import com.template.model.DataApi
import com.template.R



object Model: DataApi {
    private var minus = true
    private val listSlots = mutableListOf(0,0,0,0,0,0,0,0,0)
    private var BET:Int = 5
    private var MAINcount:Int = 1000



    val slots = listOf(
        R.drawable.v,R.drawable.v,R.drawable.v,
        R.drawable.vi,R.drawable.vi,
        R.drawable.vii,
        R.drawable.orange,R.drawable.orange
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

class DataBasePreferences(val _context: Context) {
    private var prefs: SharedPreferences
    private val prefsSetting = _context.getSharedPreferences("databaseInfo", Context.MODE_PRIVATE)
    private var editor: SharedPreferences.Editor
    private val editorSettings = prefsSetting.edit()
    init {
        prefs = _context.getSharedPreferences(getBalans().toString(), Context.MODE_PRIVATE)
        editor = prefs.edit()
    }

    fun getBalans(): Int {
        return prefsSetting.getInt("size",0)
    }

    fun setBalans(i:Int) {
        editorSettings.putInt("size",i).apply()
    }
}



