package com.template.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.template.R
import com.template.databinding.FragmentMainBinding
import com.template.mainpresenter.MainPresenter
import com.template.mainpresenter.MainViewApi


class MainFragment : Fragment(),MainViewApi {

    lateinit var binding: FragmentMainBinding
    val presenter = MainPresenter(Model)
    private var countMiliSecond:Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentMainBinding.inflate(layoutInflater)
        presenter.init(this)

        (requireContext() as MainActivity).goBack = {exitAppPlusToast()}
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

    override fun showCoins() {
        binding.TVcoins.text = presenter.getCoins().toString()
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
    }

    private fun exitAppPlusToast(){  if (countMiliSecond+2000 > System.currentTimeMillis()) {
        (requireContext() as MainActivity).onBackPressed()
    } else {
        Toast.makeText(requireContext(), "Press the back button twice to exit", Toast.LENGTH_SHORT).show();
    }
        countMiliSecond = System.currentTimeMillis()
    }
}