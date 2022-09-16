package com.template.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.template.R
import com.template.databinding.FragmentMainBinding
import com.template.mainpresenter.MainPresenter
import com.template.mainpresenter.MainViewApi


class MainFragment : Fragment(),MainViewApi {

    lateinit var binding: FragmentMainBinding
    val presenter = MainPresenter(Model)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentMainBinding.inflate(layoutInflater)
        presenter.init(this)


    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root

    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.distroy()
    }



    override fun clickPlay() {
        binding.Bplay.setOnClickListener {
            (requireActivity() as MainActivity).navController.navigate(R.id.action_mainFragment_to_gameFragment)
        }
    }

    override fun clickInfo() {
        binding.TVinfo.setOnClickListener {
            (requireActivity() as MainActivity).navController.navigate(R.id.action_mainFragment_to_infoFragment)
        }
        binding.Ishope.setOnClickListener{
            (requireActivity() as MainActivity).navController.navigate(R.id.action_mainFragment_to_shopFragment)

        }
    }
}