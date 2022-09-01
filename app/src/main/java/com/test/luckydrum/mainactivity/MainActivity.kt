package com.example2.a1xbetproject.mainactivity

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.luckydrum.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onBackPressed() {

    }


}


class DataBasePreferences(val _context: Context) {
    private var prefs: SharedPreferences
    private val prefsSetting = _context.getSharedPreferences("databaseInfo", Context.MODE_PRIVATE)
    private var editor: SharedPreferences.Editor
    private val editorSettings = prefsSetting.edit()



    init {
        prefs = _context.getSharedPreferences(getBalansFloate().toString(), Context.MODE_PRIVATE)
        editor = prefs.edit()
    }

    fun getBalansFloate(): Float {
        return prefsSetting.getFloat("size", 1000F)
    }

     fun setBalans(i:Float) {
        editorSettings.putFloat("size", getBalansFloate() - i).apply()
    }
}