package com.template.ksafsa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.template.R
import com.template.ekhfe.afafk.dghk
import com.template.ekhfe.afafk.adogjd
import com.template.databinding.FragmentBetnBinding

class rhbvu : Fragment(), adogjd {

    lateinit var bcdh: FragmentBetnBinding
    val dfnsdjl = dghk(codg)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bcdh = FragmentBetnBinding.inflate(layoutInflater)
        dfnsdjl.hh(this)
        (requireContext() as MainActivity).goBack = {findNavController().navigate(R.id.action_betFragment_to_gameFragment)}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return bcdh.root
    }

    override fun onDestroy() {
        super.onDestroy()
        dfnsdjl.jkugg()
    }
    override fun adgodgj() {
        bcdh.Button0.setOnClickListener {
            dfnsdjl.fjds()
            bcdh.Input.text = dfnsdjl.igk
        }

        bcdh.Button1.setOnClickListener {
            dfnsdjl.sjfn()
            bcdh.Input.text = dfnsdjl.igk
        }
        bcdh.Button2.setOnClickListener {
            dfnsdjl.sivn()
            bcdh.Input.text = dfnsdjl.igk
        }
        bcdh.Button3.setOnClickListener {
            dfnsdjl.asifvdj()
            bcdh.Input.text = dfnsdjl.igk
        }
        bcdh.Button4.setOnClickListener {
            dfnsdjl.aodfjd()
            bcdh.Input.text = dfnsdjl.igk
        }
        bcdh.Button5.setOnClickListener {
            dfnsdjl.fjhvnfl()
            bcdh.Input.text = dfnsdjl.igk
        }
        bcdh.Button6.setOnClickListener {
            dfnsdjl.cg()
            bcdh.Input.text = dfnsdjl.igk
        }
        bcdh.Button7.setOnClickListener {
            dfnsdjl.hf()
            bcdh.Input.text = dfnsdjl.igk
        }
        bcdh.Button8.setOnClickListener {
            dfnsdjl.jhjh()
            bcdh.Input.text = dfnsdjl.igk
        }
        bcdh.Button9.setOnClickListener {
            dfnsdjl.click9()
            bcdh.Input.text = dfnsdjl.igk
        }
        bcdh.ButtonEquals.setOnClickListener {
            dfnsdjl.hjkh()
            (requireActivity() as MainActivity).navController.navigate(R.id.action_betFragment_to_gameFragment)

        }
    }}