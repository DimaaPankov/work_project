package com.template.ksafsa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.template.ekhfe.askfhs.ksfha
import com.template.ekhfe.askfhs.ofshakf
import com.template.R
import com.template.databinding.FragmentNewCoinsnBinding


class ighgkh : Fragment(),ofshakf {
    val kjgjkg = ksfha(codg)
    lateinit var lhjkh: FragmentNewCoinsnBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      lhjkh = FragmentNewCoinsnBinding.inflate(layoutInflater)
       kjgjkg.init(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return lhjkh.root
    }

    override fun onDestroy() {
        super.onDestroy()
        kjgjkg.distroy()
    }

    override fun dgkfhd() {
        lhjkh.BreverdCoins.setOnClickListener {
            kjgjkg.akhfska()
            (requireActivity() as MainActivity).navController.navigate(R.id.action_newCoinsFragment_to_mainFragment)

        }
    }
}