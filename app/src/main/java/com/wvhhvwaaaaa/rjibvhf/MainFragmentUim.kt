package com.wvhhvwaaaaa.rjibvhf

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wvhhvwaaaaa.R
import com.wvhhvwaaaaa.databinding.FragmentMainiiiBinding
import com.wvhhvwaaaaa.ju4vcueyrv.ewvjirjbvi90
import com.wvhhvwaaaaa.ju4vcueyrv.wejvbirwubv


class MainFragmentUim : Fragment(),wejvbirwubv {

    lateinit var eguebuibuei: FragmentMainiiiBinding
    val bjiorbeubr = ewvjirjbvi90(euwvby)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        eguebuibuei = FragmentMainiiiBinding.inflate(layoutInflater)
        bjiorbeubr.init(this)


    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return eguebuibuei.root

    }

    override fun onDestroy() {
        super.onDestroy()
        bjiorbeubr.ewbuirwuby()
    }



    override fun eu9wdbiywed() {
        eguebuibuei.Bplay.setOnClickListener {
            (requireActivity() as MainActivity).eubebueurb.navigate(R.id.action_mainFragment_to_gameFragment)
        }
    }

    override fun ewh8ibej() {
        eguebuibuei.TVinfo.setOnClickListener {
            (requireActivity() as MainActivity).eubebueurb.navigate(R.id.action_mainFragment_to_infoFragment)
        }
        eguebuibuei.Ishope.setOnClickListener{
            (requireActivity() as MainActivity).eubebueurb.navigate(R.id.action_mainFragment_to_shopFragment)

        }
    }
}