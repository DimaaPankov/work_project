package com.test.luckydrum.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.test.luckydrum.R
import com.test.luckydrum.databinding.FragmentInfoBinding


class InfoFragment : Fragment() {

   val binding by lazy { FragmentInfoBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     binding.button.setOnClickListener {
        findNavController().navigate(InfoFragmentDirections.actionInfoFragmentToFirstFragment())
     }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }


}