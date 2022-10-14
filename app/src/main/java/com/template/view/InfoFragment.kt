package com.template.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.template.R
import com.template.databinding.FragmentInfoBinding
import com.template.presenter.infopresenter.InfoPresenter
import com.template.presenter.infopresenter.InfoViewApi


class InfoFragment : Fragment(),InfoViewApi {
lateinit var binding: FragmentInfoBinding
 val presenter  = InfoPresenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentInfoBinding.inflate(layoutInflater)
        presenter.init(this)
        }


    override fun clickOk() {
        binding.Bok.setOnClickListener {
            (requireActivity() as MainActivity).navController.navigate(R.id
                .action_infoFragment_to_gameFragment)
    }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.distroy()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }
}