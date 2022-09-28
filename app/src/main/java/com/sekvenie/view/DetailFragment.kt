package com.sekvenie.view

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import coil.load
import com.sekvenie.App
import com.sekvenie.R
import com.sekvenie.databinding.FragmentDetailBinding
import com.sekvenie.deteilpresentr.DeteilViewApi
import com.sekvenie.deteilpresentr.Deteilpresenter
import java.text.DecimalFormat


class DetailFragment : Fragment(),DeteilViewApi {

    private val presenter by lazy { Deteilpresenter.getInstance() }
    private val binding: FragmentDetailBinding by lazy {
        FragmentDetailBinding.inflate(layoutInflater)
    }
    var text = ""
    var spinnerPositionCof = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.init(this)
        binding.buttonBack.setOnClickListener{
            App.navController?.popBackStack()
        }
        val adapter = ArrayAdapter(requireContext(),
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            arrayListOf("1:     ${presenter.getChooseFilm()?.c1}",
                        "2:     ${presenter.getChooseFilm()?.c2}",
                        "x:     ${presenter.getChooseFilm()?.c3}"))
        binding.spinner2.adapter = adapter
        binding.spinner2.setBackgroundColor(R.color.white)
        binding.spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                spinnerPositionCof =  when(position){
                    0 -> presenter.getChooseFilm()?.c1.toString()
                    1 -> presenter.getChooseFilm()?.c2.toString()
                    2 -> presenter.getChooseFilm()?.c3.toString()
                    else -> presenter.getChooseFilm()?.c1.toString()
                }

            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                spinnerPositionCof = presenter.getChooseFilm()?.c1.toString()
            }
        }


        binding.mB0.setOnClickListener {
            text +="0"
            binding.TVresult.text = text
        }
        binding.mB1.setOnClickListener {
            text +="1"
            binding.TVresult.text = text
        }
        binding.mB2.setOnClickListener {
            text +="2"
            binding.TVresult.text = text
        }
        binding.mB3.setOnClickListener {
            text +="3"
            binding.TVresult.text = text
        }
        binding.mB4.setOnClickListener {
            text +="4"
            binding.TVresult.text = text
        }
        binding.mB5.setOnClickListener {
            text +="5"
            binding.TVresult.text = text
        }
        binding.mB6.setOnClickListener {
            text +="6"
            binding.TVresult.text = text
        }
        binding.mB7.setOnClickListener {
            text +="7"
            binding.TVresult.text = text
        }
        binding.mB8.setOnClickListener {
            text +="8"
            binding.TVresult.text = text
        }
        binding.mB9.setOnClickListener {
            text +="9"
            binding.TVresult.text = text
        }
        binding.mBresult.setOnClickListener {
            binding.CVdone.visibility = View.VISIBLE
            binding.TVbin.text = "bet: ${text}р."
            binding.TVwin.text = "win: ${DecimalFormat("#0.00").format((text.toFloat()*(spinnerPositionCof).toFloat()))}р."

            ObjectAnimator
                .ofFloat(binding.CVdone, View.ALPHA, 1F)
                .setDuration(500).start()

            Handler(Looper.getMainLooper()).postDelayed({
                findNavController().navigate(R.id.action_detailFragment_to_mainFragment)
            },3000)

        }

        binding.Bdelete.setOnClickListener{
            text =""
            binding.TVresult.text = "${text}p."


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
        val film = presenter.getChooseFilm()
        film?.let{
            val localName = getFormatString(getString(R.string.pacific_rim), getString(film.title))
            val name = getFormatString(getString(R.string.name), getString(film.title))
            val year = getFormatString(getString(R.string.year), getString(film.title))
            val rating = getFormatString(getString(R.string.rating), getString(film.title))
            binding.TVlocalName.text = film.group.name
            binding.TVtitle.text = getString(film.title)
        }
    }

    private fun getFormatString(keyString: String, valueString: String): String {
        return String.format("%s: %s", keyString, valueString)
    }
}