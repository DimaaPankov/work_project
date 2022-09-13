package com.test.luckydrum.e3jhivh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.test.luckydrum.databinding.FragmentInfoqasdBinding


class InfoFragmentqasd : Fragment() {

   val binding by lazy { FragmentInfoqasdBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     binding.buttonqasd.setOnClickListener {
        findNavController().navigate(InfoFragmentqasdDirections.actionInfoFragmentToFirstFragment())
     }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }


}