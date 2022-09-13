package com.test.luckydrum.e3jhivh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.test.luckydrum.R
import com.test.luckydrum.databinding.FragmentBonusqasdBinding

class BonusFragmentqasd : Fragment() {

    val binding by lazy {
        FragmentBonusqasdBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.Bbonusqasd.setOnClickListener{
            findNavController().navigate(R.id.action_bonusFragment_to_firstFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }


}