package com.template.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.template.R
import com.template.databinding.FragmentInfoBinding
import com.template.presenter.infopresenter.fkhsf
import com.template.presenter.infopresenter.ssjfhf


class iofkhks : Fragment(),ssjfhf {
lateinit var ifhsj: FragmentInfoBinding
 val skhgdg  = fkhsf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ifhsj = FragmentInfoBinding.inflate(layoutInflater)
        skhgdg.init(this)
        }


    override fun fskhfs() {
        ifhsj.Bok.setOnClickListener {
            (requireActivity() as MainActivity).iokfh.navigate(R.id
                .action_infoFragment_to_gameFragment)
    }
    }

    override fun onDestroy() {
        super.onDestroy()
        skhgdg.khfsf()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return ifhsj.root
    }
}