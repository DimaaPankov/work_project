package com.template.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.template.R

class MainActivity : AppCompatActivity() {

    lateinit var iokfh:NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iokfh = Navigation.findNavController(this, R.id.nav_host_fragment)
//
        sdngklds.jdah(jmdgjd(this).klhf())


    }

    var iokhf = {}

    override fun onBackPressed() {
            iokhf()
    }
}
