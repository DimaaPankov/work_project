package com.example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.databinding.FragmentNewCoinsBinding
import com.example.view.vwi9wovd


class vejorjveorjvreotnbn : Fragment(), voi09evvj {
    val rvkre = NewCoinsPresenter(vwi9wovd)
    lateinit var rv0eriveirv0: FragmentNewCoinsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      rv0eriveirv0 = FragmentNewCoinsBinding.inflate(layoutInflater)
       rvkre.viw90vwii(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return rv0eriveirv0.root
    }

    override fun onDestroy() {
        super.onDestroy()
        rvkre.wevivw90uwv()
    }

    override fun vwciveujvikcadw() {
        rv0eriveirv0.domBreverdCoins.setOnClickListener {
            rvkre.viwe9vivwoiwvivw()
            (requireActivity() as MainActivity).navController.navigate(R.id.action_newCoinsFragment_to_mainFragment)

        }
    }
}

class NewCoinsPresenter (val vrei9vi: ceikweihewohoe) {

    private var voieriviri: voi09evvj? = null
    fun viw90vwii(_view: voi09evvj?){
        voieriviri = _view
        voieriviri!!.vwciveujvikcadw()
    }
    fun viwe9vivwoiwvivw(){
        vrei9vi.ec0uwe90wev(1000)
    }



    fun wevivw90uwv(){
        voieriviri = null

    }
}

interface voi09evvj {
    fun vwciveujvikcadw()
}