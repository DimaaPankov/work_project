package com.template.view

import android.content.Context
import android.content.SharedPreferences
import com.template.model.wkegnk
import com.template.R



object sdngklds: wkegnk {
    private var dfhdf = true
    private val jdgkf = mutableListOf(0,0,0,0,0,0,0,0,0)
    private var khefs:Int = 5
    private var jkgsd:Int = 1000


    val jksgfj = listOf(
        R.drawable.v,R.drawable.v,R.drawable.v,
        R.drawable.vi,R.drawable.vi,
        R.drawable.vii,
        R.drawable.lil_2,R.drawable.lil_2
    )


    override fun jdah(dk: Int, jsfgj: Boolean) = if(jsfgj) jkgsd += dk
    else jkgsd -= dk

    override fun jdah(int: Int) {
        jkgsd = int
    }

    override fun dd() = jkgsd


    override fun dsjfk(string: String) {
       khefs = string.toInt()
    }

    override fun dsjfk(dmfdj: Int) {
        khefs = dmfdj
    }


    override fun hadkjfhds(): Int = khefs


    override fun ehdf() {
        for(i in 0..8)
        jdgkf[i] = jksgfj.random()
    }

    override fun jjdgf() = jdgkf

}

class jmdgjd(val jshf: Context) {
    private var kdhf: SharedPreferences
    private val klsfjkda = jshf.getSharedPreferences("databaseInfo", Context.MODE_PRIVATE)
    private var djkafh: SharedPreferences.Editor
    private val lhdfk = klsfjkda.edit()
    init {
        kdhf = jshf.getSharedPreferences(klhf().toString(), Context.MODE_PRIVATE)
        djkafh = kdhf.edit()
    }

    fun klhf(): Int {
        return klsfjkda.getInt("size",0)
    }

    fun klhskajf(ksaf:Int) {
        lhdfk.putInt("size",ksaf).apply()
    }
}



