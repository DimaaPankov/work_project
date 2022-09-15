package com.orewjgbioerbj.db

import android.content.Context
import android.content.SharedPreferences

class SheredPreference (val context: Context) {
    private var sheredPrefereces: SharedPreferences
    private val inctence = context.getSharedPreferences("databaseInfo", Context.MODE_PRIVATE)
    private var editor: SharedPreferences.Editor
    private val inc = inctence.edit()
    init {
        sheredPrefereces = context.getSharedPreferences(get().toString(), Context.MODE_PRIVATE)
        editor = sheredPrefereces.edit()
    }

    fun get(): Boolean {
        return inctence.getBoolean("size",true)
    }
    fun set(i:Boolean) {
        inc.putBoolean("size",i).apply()
    }
}