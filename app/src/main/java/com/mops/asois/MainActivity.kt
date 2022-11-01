package com.mops.asois

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.navigation.findNavController

import com.mops.asois.databinding.ActivityMainBinding
import com.template.view.bet
import com.template.view.winBat
import com.template.view.winOrFalse
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    var winBetM = 0F

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    var nuvController:() -> Unit  = {}
    var clickStop:() -> Unit = {}
    var plusResult = 0F
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.Bok.setOnClickListener{
            winOrFalse = false
            val i = Intent(this, WinActivity::class.java)

            startActivity(i)
        }
        binding.Bstop.setOnClickListener{
            winOrFalse = true
            winBat = bet * winBetM
            clickStop()
            bet = 10 * plusResult
        }
    }

    fun go() {
        var time = 500
        val partResult = 0.05F
        Handler(Looper.getMainLooper()).postDelayed({
        binding.Bstop.isVisible = true
        },500)

        for(i in 0..159){
            time += 100
            Handler(Looper.getMainLooper()).postDelayed({
                plusResult += partResult
                winBetM = partResult
                binding.xBetCount.text = "X ${DecimalFormat("#0.00").format(plusResult)}"

            }, time.toLong())
        }
    }

    fun aimationWinResult(view: View,
    ) {
        var time = 500
        val animator = ObjectAnimator.ofFloat(view, View.Y, 400F)
        animator.duration = 500
        animator.start()
        val animator2 = ObjectAnimator.ofFloat(view, View.ALPHA, 1F)
        animator2.duration = 500
        animator2.start()
        repeat(100){
            time += 20
            Handler(Looper.getMainLooper()).postDelayed({
                if(it == 19){}
            }, time.toLong())
        }
    }
}