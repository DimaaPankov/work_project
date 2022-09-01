package com.example2.a1xbetproject.view

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example2.a1xbetproject.mainactivity.DataBasePreferences
import com.test.luckydrum.R
import com.test.luckydrum.databinding.FragmentDeteilBinding


import java.text.DecimalFormat

class DeteilFragment : Fragment() {
    private val args: DeteilFragmentArgs by navArgs()
    private val binding by lazy{ FragmentDeteilBinding.inflate(layoutInflater) }
    var text = ""
    var spinnerPositionCof = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
binding.TVtitle.text = args.title




        val adapter = ArrayAdapter(requireContext(),
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            arrayListOf("1:     ${args.ixbet}","x:     ${args.iixbet}","2:     ${args.iiixbet}"))
        binding.spinner2.adapter = adapter
       // binding.spinner2.setBackgroundColor(R.color.white)
        binding.spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
               spinnerPositionCof =  when(position){
                    0 -> args.ixbet
                    1 -> args.iixbet
                    2 -> args.iiixbet
                   else -> args.ixbet
                }

            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                spinnerPositionCof = args.ixbet
            }
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
         binding.CVdone.visibility = View.VISIBLE
            binding.TVbin.text = "ставка: ${text}"
            binding.TVwin.text = "выйгрышь: ${DecimalFormat("#0.00").format((text.toFloat()*(spinnerPositionCof).toFloat()))}"

            ObjectAnimator
                .ofFloat(binding.CVdone, View.ALPHA, 1F)
                .setDuration(500).start()

                Handler(Looper.getMainLooper()).postDelayed({

                findNavController().navigate(R.id.action_deteilFragment_to_mainFragment)

                },3000)

            DataBasePreferences(requireContext()).setBalans(binding.TVresult.text.toString().toFloat())

            }

        binding.Bdelete.setOnClickListener{
            text =""
            binding.TVresult.text = "${text}p."


        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return binding.root
    }

}