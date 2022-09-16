package com.template.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.template.R
import com.template.databinding.FragmentNewCoinsBinding


class NewCoinsFragment : Fragment() {
    lateinit var binding: FragmentNewCoinsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding = FragmentNewCoinsBinding.inflate(layoutInflater)

        MainActivity.goBack = {findNavController().
        navigate(NewCoinsFragmentDirections.actionNewCoinsFragmentToMainFragment())}
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }



    override fun onDestroy() {
        super.onDestroy()
    }

   fun clickNewCoins() {
        binding.BreverdCoins.setOnClickListener {
            (requireActivity() as MainActivity).navController.navigate(R.id.action_newCoinsFragment_to_mainFragment)
            DataBasePreferences(requireContext()).setBalans(1000)

        }
    }
}