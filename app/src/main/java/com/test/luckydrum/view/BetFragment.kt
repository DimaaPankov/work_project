package com.test.luckydrum.view

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.test.luckydrum.MainActivity
import com.test.luckydrum.R
import com.test.luckydrum.Utils.BET
import com.test.luckydrum.databinding.FragmentBetBinding
import com.test.luckydrum.databinding.FragmentFirstBinding
import java.text.DecimalFormat


class BetFragment : Fragment() {

    val binding by lazy{FragmentBetBinding.inflate(layoutInflater)}
    var text = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        MainActivity.goBack = {
            findNavController().navigate(BetFragmentDirections.actionBetFragmentToFirstFragment())
        }

        binding.mB0.setOnClickListener {
            text +="0"
            binding.TVresult.text = "${text}"
        }
        binding.mB1.setOnClickListener {
            text +="1"
            binding.TVresult.text = "${text}"
        }
        binding.mB2.setOnClickListener {
            text +="2"
            binding.TVresult.text = "${text}"
        }
        binding.mB3.setOnClickListener {
            text +="3"
            binding.TVresult.text = "${text}"
        }
        binding.mB4.setOnClickListener {
            text +="4"
            binding.TVresult.text = "${text}"
        }
        binding.mB5.setOnClickListener {
            text +="5"
            binding.TVresult.text = "${text}"
        }
        binding.mB6.setOnClickListener {
            text +="6"
            binding.TVresult.text = "${text}"
        }
        binding.mB7.setOnClickListener {
            text +="7"
            binding.TVresult.text = "${text}"
        }
        binding.mB8.setOnClickListener {
            text +="8"
            binding.TVresult.text = "${text}"
        }
        binding.mB9.setOnClickListener {
            text +="9"
            binding.TVresult.text = "${text}"
        }

        binding.mBresult.setOnClickListener {
          BET.i = text.toInt()
            findNavController().navigate(BetFragmentDirections.actionBetFragmentToFirstFragment())
        }

        binding.view1.setOnClickListener{
            binding.viewBlack.visibility = View.VISIBLE
            binding.viewRed.visibility = View.INVISIBLE
            BET.color = FirstFragment.BLACK
        }

        binding.view2.setOnClickListener{
            binding.viewBlack.visibility = View.INVISIBLE
            binding.viewRed.visibility = View.VISIBLE
            BET.color = FirstFragment.RED
        }

        binding.Bdelete.setOnClickListener{
            text =""
            binding.TVresult.text = "${text}"


        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }


}