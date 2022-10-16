package com.template.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.template.R
import com.template.presenter.betpresenter.dmhsjkfd
import com.template.presenter.betpresenter.BetViewApi
import com.template.databinding.FragmentBetBinding

class shffs : Fragment(), BetViewApi {

    lateinit var klfh: FragmentBetBinding
    val hdjosgjs = dmhsjkfd(sdngklds)
//ccgitdsgdsgadd
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        klfh = FragmentBetBinding.inflate(layoutInflater)
        hdjosgjs.init(this)
        (requireContext() as MainActivity).iokhf = {findNavController().navigate(R.id.action_betFragment_to_gameFragment)}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return klfh.root
    }

    override fun onDestroy() {
        super.onDestroy()
        hdjosgjs.dfdfdd()
    }
    override fun clickListner() {
        klfh.Button0.setOnClickListener {
            hdjosgjs.jfshj()
            klfh.Input.text = hdjosgjs.klhfshk
        }

        klfh.Button1.setOnClickListener {
            hdjosgjs.sofjyuf()
            klfh.Input.text = hdjosgjs.klhfshk
        }
        klfh.Button2.setOnClickListener {
            hdjosgjs.ufsg()
            klfh.Input.text = hdjosgjs.klhfshk
        }
        klfh.Button3.setOnClickListener {
            hdjosgjs.fsg()
            klfh.Input.text = hdjosgjs.klhfshk
        }
        klfh.Button4.setOnClickListener {
            hdjosgjs.ujeshfjdah()
            klfh.Input.text = hdjosgjs.klhfshk
        }
        klfh.Button5.setOnClickListener {
            hdjosgjs.sjkf()
            klfh.Input.text = hdjosgjs.klhfshk
        }
        klfh.Button6.setOnClickListener {
            hdjosgjs.tdssd()
            klfh.Input.text = hdjosgjs.klhfshk
        }
        klfh.Button7.setOnClickListener {
            hdjosgjs.sdsddg()
            klfh.Input.text = hdjosgjs.klhfshk
        }
        klfh.Button8.setOnClickListener {
            hdjosgjs.dggdsd()
            klfh.Input.text = hdjosgjs.klhfshk
        }
        klfh.Button9.setOnClickListener {
            hdjosgjs.rytdyr()
            klfh.Input.text = hdjosgjs.klhfshk
        }
        klfh.ButtonEquals.setOnClickListener {
            hdjosgjs.tfdhdfh()
            (requireActivity() as MainActivity).iokfh.navigate(R.id.action_betFragment_to_gameFragment)

        }
    }}