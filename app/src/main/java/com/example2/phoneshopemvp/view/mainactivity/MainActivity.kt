package com.example2.phoneshopemvp.view.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example2.phoneshopemvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy{ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}