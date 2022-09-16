package com.template.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.template.R
import com.template.databinding.FragmentMainBinding



class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentMainBinding.inflate(layoutInflater)
        clickInfo()
        clickPlay()

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root

    }

    override fun onDestroy() {
        super.onDestroy()
    }



    fun clickPlay() {
        binding.Bplay.setOnClickListener {
            (requireActivity() as MainActivity).navController.navigate(R.id.action_mainFragment_to_gameFragment)
        }
    }

     fun clickInfo() {
        binding.TVinfo.setOnClickListener {
            (requireActivity() as MainActivity).navController.navigate(R.id.action_mainFragment_to_infoFragment)
        }
    }
}