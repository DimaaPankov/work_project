package com.example2.wallpapercars.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example2.wallpapercars.MainActivity
import com.example2.wallpapercars.R
import com.example2.wallpapercars.databinding.FragmentQestionBinding

class QestionFragment : Fragment() {

   val bibding by lazy {FragmentQestionBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MainActivity.goBack = {findNavController().
        navigate(QestionFragmentDirections.actionQestionFragmentToMainFragment())}

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return bibding.root
    }


}