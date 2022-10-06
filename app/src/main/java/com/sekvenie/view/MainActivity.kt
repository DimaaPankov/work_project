package com.sekvenie.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import com.sekvenie.App
import com.sekvenie.R
import com.sekvenie.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var dsjgj: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dsjgj = ActivityMainBinding.inflate(layoutInflater)
        setContentView(dsjgj.root)

        App.dsisdjhv = Navigation.findNavController(this, R.id.nav_host_fragment)
    }

    override fun onBackPressed() {
    }

}