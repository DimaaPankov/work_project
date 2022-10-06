package com.sekvenie.view

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment

import com.sekvenie.App
import com.sekvenie.R
import com.sekvenie.databinding.FragmentDetailBinding
import com.sekvenie.deteilpresentr.DeteilViewApi
import com.sekvenie.deteilpresentr.Deteilpresenter


class DetailFragment : Fragment(),DeteilViewApi {

    private val presenter by lazy { Deteilpresenter.getInstance() }
    private val binding: FragmentDetailBinding by lazy {
        FragmentDetailBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.init(this)
        binding.buttonBack.setOnClickListener{
            App.navController?.popBackStack()
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }

    override fun showDeteil() {
        val data = presenter.getChooseFilm()
        data?.let{

            val title = getString(data.title)
            val img = data.img
            val description = getString(data.description)

            binding.TVdata.text = "  date: ${data.dataEvent.data}"
            binding.IVdeteil.setImageResource(img)
            binding.TVtitle.text = title
            binding.TVdescription.text = description
        }
    }

//    private fun getFormatString(keyString: String, valueString: String): String {
//        return String.format("%s: %s", keyString, valueString)
   // }
}