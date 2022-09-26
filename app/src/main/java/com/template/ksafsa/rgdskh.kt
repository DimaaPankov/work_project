package com.template.ksafsa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.template.R
import com.template.databinding.FragmentInfonBinding
import com.template.ekhfe.dksgkds.kfdfk
import com.template.ekhfe.dksgkds.dkndgkn


class rgdskh : Fragment(),dkndgkn {
lateinit var sikdh: FragmentInfonBinding
 val dvgsdl  = kfdfk()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sikdh = FragmentInfonBinding.inflate(layoutInflater)
        dvgsdl.init(this)
        }


    override fun gd() {
        sikdh.Bok.setOnClickListener {
            (requireActivity() as MainActivity).navController.navigate(R.id
                .action_infoFragment_to_mainFragment)
    }
    }

    override fun onDestroy() {
        super.onDestroy()
        dvgsdl.dnakd()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return sikdh.root
    }
}