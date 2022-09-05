package com.template.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.template.R
import com.template.betpresenter.BetPresnter
import com.template.betpresenter.BetViewApi
import com.template.databinding.FragmentBetBinding

class BetFragment : Fragment(), BetViewApi {

    lateinit var binding: FragmentBetBinding
    val presnter = BetPresnter(Model)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentBetBinding.inflate(layoutInflater)
        presnter.init(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        presnter.distroy()
    }
    override fun clickListner() {
        binding.Button0.setOnClickListener {
            presnter.click0()
            binding.Input.text = presnter.countBet
        }

        binding.Button1.setOnClickListener {
            presnter.click1()
            binding.Input.text = presnter.countBet
        }
        binding.Button2.setOnClickListener {
            presnter.click2()
            binding.Input.text = presnter.countBet
        }
        binding.Button3.setOnClickListener {
            presnter.click3()
            binding.Input.text = presnter.countBet
        }
        binding.Button4.setOnClickListener {
            presnter.click4()
            binding.Input.text = presnter.countBet
        }
        binding.Button5.setOnClickListener {
            presnter.click5()
            binding.Input.text = presnter.countBet
        }
        binding.Button6.setOnClickListener {
            presnter.click6()
            binding.Input.text = presnter.countBet
        }
        binding.Button7.setOnClickListener {
            presnter.click7()
            binding.Input.text = presnter.countBet
        }
        binding.Button8.setOnClickListener {
            presnter.click8()
            binding.Input.text = presnter.countBet
        }
        binding.Button9.setOnClickListener {
            presnter.click9()
            binding.Input.text = presnter.countBet
        }
        binding.ButtonEquals.setOnClickListener {
            presnter.clickEquels()
            (requireActivity() as MainActivity).navController.navigate(R.id.action_betFragment_to_gameFragment)

        }
    }}