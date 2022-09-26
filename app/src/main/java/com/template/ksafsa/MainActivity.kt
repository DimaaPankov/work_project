package com.template.ksafsa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.template.R

class MainActivity : AppCompatActivity() {

    lateinit var navController:NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainn)
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
    }

    var goBack = {}

    override fun onBackPressed() {
            goBack()
    }
}