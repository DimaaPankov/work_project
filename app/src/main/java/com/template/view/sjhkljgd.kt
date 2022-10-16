package com.template.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.template.presenter.NewCoinsPresenter.ishfg
import com.template.presenter.NewCoinsPresenter.sfh
import com.template.R
import com.template.databinding.FragmentNewCoinsBinding


class sjhkljgd : Fragment(),sfh {
    val dogjds = ishfg(sdngklds)
    lateinit var jhfso: FragmentNewCoinsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      jhfso = FragmentNewCoinsBinding.inflate(layoutInflater)
       dogjds.sfhfs(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return jhfso.root
    }

    override fun onDestroy() {
        super.onDestroy()
        dogjds.okfh()
    }


    override fun jmhfsklsjf() {
        jhfso.BreverdCoins.setOnClickListener {
            dogjds.ksljf(requireContext())
            (requireActivity() as MainActivity).iokfh.navigate(R.id.action_newCoinsFragment_to_gameFragment)
           // DataBasePreferences(requireContext()).setBalans(1000)
            dogjds.ikslhf(requireContext(),1000)
        }
    }
}