package com.example2.wallpapercars.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.navigation.fragment.findNavController
import com.example2.wallpapercars.MainActivity
import com.example2.wallpapercars.R
import com.example2.wallpapercars.adapter.AdapterLots
import com.example2.wallpapercars.databinding.FragmentMainBinding

class MainFragment : Fragment() {
val binding by lazy{FragmentMainBinding.inflate(layoutInflater)}
    val _img = listOf<Int>(R.drawable.eon,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,
        R.drawable.six,R.drawable.seven,R.drawable.eight,R.drawable.nine)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.RVmain.adapter = AdapterLots(object : AdapterLots.OnUserClickListener {
            override fun onClick(img: Int) {
                val directions = MainFragmentDirections.actionMainFragmentToDeteilFragment(img)
                findNavController().navigate(directions)
            }
        }, _img)

        binding.imageView2.setOnClickListener{
        findNavController().navigate(MainFragmentDirections.actionMainFragmentToQestionFragment())
        }

        MainActivity.goBack = {}

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }



}