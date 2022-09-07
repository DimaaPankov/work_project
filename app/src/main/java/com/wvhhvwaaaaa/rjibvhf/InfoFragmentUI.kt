package com.wvhhvwaaaaa.rjibvhf

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.wvhhvwaaaaa.R
import com.wvhhvwaaaaa.databinding.FragmentInfoiiiBinding
import com.wvhhvwaaaaa.vjjwdvjr.wjgeuvberub
import com.wvhhvwaaaaa.vjjwdvjr.ighrvureg


class InfoFragmentUI : Fragment(),ighrvureg {
lateinit var eubgeub: FragmentInfoiiiBinding
 val ebgubu  = wjgeuvberub()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        eubgeub = FragmentInfoiiiBinding.inflate(layoutInflater)
        ebgubu.eugbrewubpo(this)

        MainActivity.eueububeo = {
            findNavController().
            navigate(InfoFragmentUIDirections.actionInfoFragmentToMainFragment())
        }
        }


    override fun eub9ru() {
        eubgeub.Bok.setOnClickListener {
            (requireActivity() as MainActivity).eubebueurb.navigate(R.id
                .action_infoFragment_to_mainFragment)
    }
    }

    override fun onDestroy() {
        super.onDestroy()
        ebgubu.eugbiryubio()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return eubgeub.root
    }
}