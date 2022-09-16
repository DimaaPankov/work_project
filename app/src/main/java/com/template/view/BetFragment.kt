package com.template.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.template.databinding.FragmentBetBinding

class BetFragment : Fragment() {

    lateinit var binding: FragmentBetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentBetBinding.inflate(layoutInflater)
        MainActivity.goBack = {
            findNavController().
            navigate(BetFragmentDirections.actionBetFragmentToGameFragment())
        }
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
    fun clickListner() {
        binding.Button0.setOnClickListener {}
        binding.Button1.setOnClickListener {}
        binding.Button2.setOnClickListener {}
        binding.Button3.setOnClickListener {}
        binding.Button4.setOnClickListener {}
        binding.Button5.setOnClickListener {}
        binding.Button6.setOnClickListener {}
        binding.Button7.setOnClickListener {}
        binding.Button8.setOnClickListener {}
        binding.Button9.setOnClickListener {}
        binding.ButtonEquals.setOnClickListener {}
    }}