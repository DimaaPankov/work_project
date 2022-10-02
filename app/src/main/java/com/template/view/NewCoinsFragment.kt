package com.template.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.template.presenter.NewCoinsPresenter.NewCoinsPresenter
import com.template.presenter.NewCoinsPresenter.NewCoinsViewApi
import com.template.R
import com.template.databinding.FragmentNewCoinsBinding


class NewCoinsFragment : Fragment(),NewCoinsViewApi {
    val presenter = NewCoinsPresenter(Model)
    lateinit var binding: FragmentNewCoinsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding = FragmentNewCoinsBinding.inflate(layoutInflater)
       presenter.init(this)
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
        presenter.distroy()
    }


    override fun clickNewCoins() {
        binding.BreverdCoins.setOnClickListener {
            presenter.setMainCount(requireContext())
            (requireActivity() as MainActivity).navController.navigate(R.id.action_newCoinsFragment_to_mainFragment)
           // DataBasePreferences(requireContext()).setBalans(1000)
            presenter.setBalansInDataBase(requireContext(),1000)
        }
    }
}