package com.sekvenie.view

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment

import com.sekvenie.App
import com.sekvenie.databinding.FragmentDetailBinding
import com.sekvenie.dkfhkd.soljgfda
import com.sekvenie.dkfhkd.ekhgfisd


class DetailFragment : Fragment(),soljgfda {

    private val kldhfl by lazy { ekhgfisd.sogfkd() }
    private val kdffl: FragmentDetailBinding by lazy {
        FragmentDetailBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        kldhfl.hdsasa(this)
        kdffl.buttonBack.setOnClickListener{
            App.dsisdjhv?.popBackStack()
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return kdffl.root
    }

    override fun onDestroy() {
        super.onDestroy()
        kldhfl.destroy()
    }

    override fun osljgf() {
        val data = kldhfl.sokhfl()
        data?.let{

            val khdflhdl = getString(data.bjgds)
            val klhdlgh = data.img
            val kdlfhdsk = getString(data.ddkg)

            kdffl.TVdata.text = "  date: ${data.djksf.eoglhfd}"
            kdffl.IVdeteil.setImageResource(klhdlgh)
            kdffl.TVtitle.text = khdflhdl
            kdffl.TVdescription.text = kdlfhdsk
        }
    }
}