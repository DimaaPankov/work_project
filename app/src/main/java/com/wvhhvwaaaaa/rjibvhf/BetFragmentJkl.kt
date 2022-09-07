package com.wvhhvwaaaaa.rjibvhf

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.wvhhvwaaaaa.R
import com.wvhhvwaaaaa.rjbuv8riyv.evjie
import com.wvhhvwaaaaa.rjbuv8riyv.wv9urewb
import com.wvhhvwaaaaa.databinding.FragmentBetiiiBinding

class BetFragmentJkl : Fragment(), wv9urewb {

    lateinit var rburb: FragmentBetiiiBinding
    val wehubuer = evjie(euwvby)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rburb = FragmentBetiiiBinding.inflate(layoutInflater)
        wehubuer.init(this)
        MainActivity.eueububeo = {
            findNavController().
            navigate(BetFragmentJklDirections.actionBetFragmentToGameFragment())
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return rburb.root
    }

    override fun onDestroy() {
        super.onDestroy()
        wehubuer.rebuureb()
    }
    override fun erbieru9() {
        rburb.Button0.setOnClickListener {
            wehubuer.euv()
            rburb.Input.text = wehubuer.eub
        }

        rburb.Button1.setOnClickListener {
            wehubuer.eguiebi()
            rburb.Input.text = wehubuer.eub
        }
        rburb.Button2.setOnClickListener {
            wehubuer.egbueub()
            rburb.Input.text = wehubuer.eub
        }
        rburb.Button3.setOnClickListener {
            wehubuer.eviev()
            rburb.Input.text = wehubuer.eub
        }
        rburb.Button4.setOnClickListener {
            wehubuer.vejuvu()
            rburb.Input.text = wehubuer.eub
        }
        rburb.Button5.setOnClickListener {
            wehubuer.ej()
            rburb.Input.text = wehubuer.eub
        }
        rburb.Button6.setOnClickListener {
            wehubuer.eibu()
            rburb.Input.text = wehubuer.eub
        }
        rburb.Button7.setOnClickListener {
            wehubuer.ejbueiwbv()
            rburb.Input.text = wehubuer.eub
        }
        rburb.Button8.setOnClickListener {
            wehubuer.ebueub()
            rburb.Input.text = wehubuer.eub
        }
        rburb.Button9.setOnClickListener {
            wehubuer.evjbejbvj()
            rburb.Input.text = wehubuer.eub
        }
        rburb.ButtonEquals.setOnClickListener {
            wehubuer.eubue()
            (requireActivity() as MainActivity).eubebueurb.navigate(R.id.action_betFragment_to_gameFragment)
        }
    }}