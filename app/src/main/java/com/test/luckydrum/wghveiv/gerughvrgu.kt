package com.test.luckydrum.wghveiv

import android.content.Context
import android.content.SharedPreferences

class gerughvrgu (val wevj: Context) {
    private var wehf: SharedPreferences
    private val efew = wevj.getSharedPreferences("databaseInfo", Context.MODE_PRIVATE)
    private var ewh: SharedPreferences.Editor
    private val wregvhrwghv = efew.edit()
    init {
        wehf = wevj.getSharedPreferences(wevh().toString(), Context.MODE_PRIVATE)
        ewh = wehf.edit()
    }

    fun wevh(): Int {
        return efew.getInt("size",1000)
    }

    fun ewfh(i:Int) {
        wregvhrwghv.putInt("size",i).apply()
    }
}