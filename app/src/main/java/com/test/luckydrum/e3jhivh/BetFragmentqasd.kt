package com.test.luckydrum.e3jhivh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.test.luckydrum.MainActivity
import com.test.luckydrum.eirhvei.rvjkh
import com.test.luckydrum.databinding.FragmentBetqasdBinding


class BetFragmentqasd : Fragment() {

    val binding by lazy{ FragmentBetqasdBinding.inflate(layoutInflater)}
    var text = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        MainActivity.goBack = {
            findNavController().navigate(BetFragmentqasdDirections.actionBetFragmentToFirstFragment())
        }

        binding.mB0qasd.setOnClickListener {
            text +="0"
            binding.TVresultqasd.text = "${text}"
        }
        binding.mB1qasd.setOnClickListener {
            text +="1"
            binding.TVresultqasd.text = "${text}"
        }
        binding.mB2qasd.setOnClickListener {
            text +="2"
            binding.TVresultqasd.text = "${text}"
        }
        binding.mB3qasd.setOnClickListener {
            text +="3"
            binding.TVresultqasd.text = "${text}"
        }
        binding.mB4qasd.setOnClickListener {
            text +="4"
            binding.TVresultqasd.text = "${text}"
        }
        binding.mB5qasd.setOnClickListener {
            text +="5"
            binding.TVresultqasd.text = "${text}"
        }
        binding.mB6qasd.setOnClickListener {
            text +="6"
            binding.TVresultqasd.text = "${text}"
        }
        binding.mB7qasd.setOnClickListener {
            text +="7"
            binding.TVresultqasd.text = "${text}"
        }
        binding.mB8qasd.setOnClickListener {
            text +="8"
            binding.TVresultqasd.text = "${text}"
        }
        binding.mB9qasd.setOnClickListener {
            text +="9"
            binding.TVresultqasd.text = "${text}"
        }

        binding.mBresultqasd.setOnClickListener {
            if(text != "") {
                rvjkh.i = text.toInt()
            }else{
                rvjkh.i = 15
            }
            findNavController().navigate(BetFragmentqasdDirections.actionBetFragmentToFirstFragment())
        }

        binding.view1qasd.setOnClickListener{
            binding.viewBlackqasd.visibility = View.VISIBLE
            binding.viewRedqasd.visibility = View.INVISIBLE
            rvjkh.color = FirstFragment.BLACK
        }

        binding.view2qasd.setOnClickListener{
            binding.viewBlackqasd.visibility = View.INVISIBLE
            binding.viewRedqasd.visibility = View.VISIBLE
            rvjkh.color = FirstFragment.RED
        }

        binding.Bdeleteqasd.setOnClickListener{
            text =""
            binding.TVresultqasd.text = "${text}"


        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }


}