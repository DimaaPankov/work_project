package com.template.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.template.R

class MainActivity : AppCompatActivity() {
    lateinit var navController:NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        Model.setMainCount(DataBasePreferences(this).getBalans())
        }


    companion object {
        var goBack = {}
    }


    override fun onBackPressed() {
        goBack()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}

