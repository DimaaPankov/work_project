package com.template.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.template.R
import com.template.databinding.FragmentInfoBinding
import com.template.jjsdjkg.jjagkjfgdsjf.jdkajvad
import com.template.jjsdjkg.jjagkjfgdsjf.jdkfhj


class InfoFragment : Fragment(),jdkfhj {
lateinit var binding: FragmentInfoBinding
 val presenter  = jdkajvad()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentInfoBinding.inflate(layoutInflater)
        presenter.kjsfj(this)
        }


    override fun kslhfk() {
        binding.Bok.setOnClickListener {
            (requireActivity() as MainActivity).navController.navigate(R.id
                .action_infoFragment_to_gameFragment)
    }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.kslf()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }
}