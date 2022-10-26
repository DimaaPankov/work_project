package com.mops.asois

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.mops.asois.databinding.ActivityWinBinding
import com.template.view.*

class WinActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWinBinding.inflate(layoutInflater)
        setContentView(binding.root)

     binding.TVbalans.text = "your win + ${bet}"
        if(winOrFalse) {
            animation()
            balance = balance + bet
        }else{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            balance = balance - bet
        }

    }

    fun animation(){
        var i = true
        var sec = 0
        repeat(19){
            sec = sec + 500

            Handler(Looper.getMainLooper()).postDelayed({
            if(i){
                    binding.TVbalans.isVisible = true
                    i = false
            }else{
                    binding.TVbalans.isVisible = false
                    i = true
                }
            },sec.toLong())
            }
        Handler(Looper.getMainLooper()).postDelayed({
            val i = Intent(this, MainActivity::class.java)
                     startActivity(i)
        },3000L)
        }


    }

