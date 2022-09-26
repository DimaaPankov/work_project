package com.template.ksafsa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.template.R
import com.template.databinding.FragmentMainnBinding
import com.template.ekhfe.kfhaskf.dhifd
import com.template.ekhfe.kfhaskf.egohksd


class hdlfhs : Fragment(),egohksd {

    lateinit var eifjdj: FragmentMainnBinding
    val wgjfk = dhifd(codg)
    private var srhgslk:Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        eifjdj = FragmentMainnBinding.inflate(layoutInflater)
        wgjfk.init(this)

        (requireContext() as MainActivity).goBack = {dgkhsdo()}
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return eifjdj.root

    }

    override fun onDestroy() {
        super.onDestroy()
        wgjfk.sakfa()
    }

    override fun aefod() {
        eifjdj.TVcoins.text = wgjfk.asfjas().toString()
    }

    override fun weopfhd() {
        eifjdj.Bplay.setOnClickListener {
            (requireActivity() as MainActivity).navController.navigate(R.id.action_mainFragment_to_gameFragment)
        }
    }

    override fun wjfdjhf() {
        eifjdj.TVinfo.setOnClickListener {
            (requireActivity() as MainActivity).navController.navigate(R.id.action_mainFragment_to_infoFragment)
        }
    }

    private fun dgkhsdo(){  if (srhgslk+2000 > System.currentTimeMillis()) {
        (requireContext() as MainActivity).onBackPressed()
    } else {
        Toast.makeText(requireContext(), "Press the back button twice to exit", Toast.LENGTH_SHORT).show();
    }
        srhgslk = System.currentTimeMillis()
    }
}