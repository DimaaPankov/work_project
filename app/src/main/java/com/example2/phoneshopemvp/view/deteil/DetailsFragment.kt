package com.example2.phoneshopemvp.view.deteil

import android.os.Bundle
import android.os.Handler
import android.os.Looper

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import coil.load
import com.example2.phoneshopemvp.R

import com.example2.phoneshopemvp.databinding.FragmentDetailsBinding
import com.example2.phoneshopemvp.presenter.deteilpresenter.DeteilPresenter
import com.example2.phoneshopemvp.presenter.deteilpresenter.DeteilViewApi

class DetailsFragment : Fragment(),DeteilViewApi {
    val binding by lazy { FragmentDetailsBinding.inflate(layoutInflater) }
    private val args: DetailsFragmentArgs by navArgs()
    private val presenter = DeteilPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter.init(this)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root


    }

    override fun setData() {
        binding.img.load(args.urlImage)
        binding.TVtitle.text = args.title
        binding.TVpricea.text = "${args.price}$"

    }

    override fun setClick() {

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_detailsFragment_to_mainFragment)
        }
        binding.cardView2 .setOnClickListener{

                binding.CVdone.visibility = View.VISIBLE
                binding.button.visibility = View.INVISIBLE
                binding.cardView.visibility = View.INVISIBLE
                binding.TVpricea.visibility = View.VISIBLE
                binding.cardView2.visibility = View.INVISIBLE
                binding.TVtitle.visibility = View.INVISIBLE

                Handler(Looper.getMainLooper()).postDelayed({
                        findNavController().navigate(R.id.action_detailsFragment_to_mainFragment)
                },3000)
            }
        }

    }

