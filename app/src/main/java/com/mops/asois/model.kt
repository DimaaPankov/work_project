package com.template.view

import android.content.Context
import android.content.SharedPreferences




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


var balance = 1000F
var bet = 34.5F
var x = 3.5
var winBat = 0F
var winOrFalse = true
var noLouding = false

