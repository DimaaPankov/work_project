package com.template.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.template.R
import com.template.databinding.FragmentInfoBinding



class InfoFragment : Fragment() {
lateinit var binding: FragmentInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentInfoBinding.inflate(layoutInflater)

        MainActivity.goBack = {
            findNavController().
            navigate(InfoFragmentDirections.actionInfoFragmentToMainFragment())
        }
        }


    fun clickOk() {
        binding.Bok.setOnClickListener {
            (requireActivity() as MainActivity).navController.navigate(R.id
                .action_infoFragment_to_mainFragment)
    }
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }
}