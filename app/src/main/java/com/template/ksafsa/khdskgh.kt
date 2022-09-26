package com.template.ksafsa

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible

import androidx.navigation.fragment.findNavController
import com.template.R
import com.template.databinding.FragmentGamenBinding
import com.template.ekhfe.gksdgkd.dogdsj
import com.template.ekhfe.gksdgkd.GameViewApi


class khdskgh : Fragment(), GameViewApi {
    val sjfa = dogdsj(codg)
    val dofjdfad by lazy { FragmentGamenBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (requireContext() as MainActivity).goBack = {
            findNavController().navigate(R.id.action_gameFragment_to_mainFragment)
        }

        sjfa.dkaga(this)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return dofjdfad.root

    }

    override fun onDestroy() {
        super.onDestroy()
        sjfa.distroy()
    }


    override fun clickSpin() {

        dofjdfad.Bspin.setOnClickListener {
            sjfa.fsn()
            dofjdfad.Bspin.isClickable = false
            dofjdfad.IVback.isClickable = false
            dofjdfad.Vline.isVisible = false

                if ((sjfa.fjfa() >= sjfa.sdgjd())
                ) {
                    val heidht = dofjdfad.TVslot1.height.toFloat()
                    val heidhtConteiner = dofjdfad.constraintLayout .height.toFloat()
            sjfa.djgdagld(dofjdfad.TVslot58q,dofjdfad.TVslot1, dofjdfad.LLline1,
                sjfa.djgaaf,heidht,heidhtConteiner,0)
            sjfa.djgdagld(dofjdfad.TVslot59q,dofjdfad.TVslot2,dofjdfad.LLline2,
                sjfa.jdgda,heidht,heidhtConteiner,1000)
            sjfa.djgdagld(dofjdfad.TVslot60q,dofjdfad.TVslot3,dofjdfad.LLline3,
                sjfa.sflad,heidht,heidhtConteiner,2000)
            sjfa.dgkhd(sjfa.sdgjd(), false)
            dofjdfad.TVbalans.text = sjfa.fjfa().toString()
            sjfa.sfjakj( dofjdfad.TVslot1, dofjdfad.TVslot2, dofjdfad.TVslot3,dofjdfad.betCount,
                                     dofjdfad.betCountSmile,dofjdfad.TVvin,dofjdfad.TVxxx,dofjdfad.Vline,
                                                                   dofjdfad.CVresult,dofjdfad.TVbalans)
                } else {
                    (requireActivity() as MainActivity).navController.navigate(R.id.action_gameFragment_to_newCoinsFragment)
                    sjfa.dagj = true
                }
            Handler(Looper.getMainLooper()).postDelayed({
                dofjdfad.Bspin.isClickable = true
                dofjdfad.IVback.isClickable = true },5000)
        }
    }

            override fun dfks() {
                dofjdfad.IVback.setOnClickListener {
                    (requireActivity() as MainActivity).navController.navigate(R.id.action_gameFragment_to_mainFragment)
                }
            }

            override fun sfsjjj() {
                dofjdfad.Bbet.setOnClickListener {
                    sjfa.dsfj(0)//BET = 0
                    (requireActivity() as MainActivity).navController.navigate(R.id.action_gameFragment_to_betFragment)
                }
            }
            override fun adkfhakf() {
                dofjdfad.TVbalans.text = codg.getMainCount().toString()
                dofjdfad.betCountMinus.text = codg.getBet().toString()
                sjfa.fsn()
                dofjdfad.TVslot1.setImageResource(sjfa.djgaaf)
                dofjdfad.TVslot2.setImageResource(sjfa.jdgda)
                dofjdfad.TVslot3.setImageResource(sjfa.sflad)
                dofjdfad.TVslot4.setImageResource(codg.slots.random())
                dofjdfad.TVslot5.setImageResource(codg.slots.random())
                dofjdfad.TVslot6.setImageResource(codg.slots.random())
                dofjdfad.TVslot7.setImageResource(codg.slots.random())
                dofjdfad.TVslot8.setImageResource(codg.slots.random())
                dofjdfad.TVslot9.setImageResource(codg.slots.random())
                dofjdfad.TVslot10.setImageResource(codg.slots.random())
                dofjdfad.TVslot11.setImageResource(codg.slots.random())
                dofjdfad.TVslot12.setImageResource(codg.slots.random())
                dofjdfad.TVslot13.setImageResource(codg.slots.random())
                dofjdfad.TVslot14.setImageResource(codg.slots.random())
                dofjdfad.TVslot15.setImageResource(codg.slots.random())
                dofjdfad.TVslot16.setImageResource(codg.slots.random())
                dofjdfad.TVslot17.setImageResource(codg.slots.random())
                dofjdfad.TVslot18.setImageResource(codg.slots.random())
                dofjdfad.TVslot19.setImageResource(codg.slots.random())
                dofjdfad.TVslot20.setImageResource(codg.slots.random())
                dofjdfad.TVslot21.setImageResource(codg.slots.random())
                dofjdfad.TVslot22.setImageResource(codg.slots.random())
                dofjdfad.TVslot23.setImageResource(codg.slots.random())
                dofjdfad.TVslot24.setImageResource(codg.slots.random())
                dofjdfad.TVslot25.setImageResource(codg.slots.random())
                dofjdfad.TVslot26.setImageResource(codg.slots.random())
                dofjdfad.TVslot27.setImageResource(codg.slots.random())
                dofjdfad.TVslot28.setImageResource(codg.slots.random())
                dofjdfad.TVslot29.setImageResource(codg.slots.random())
                dofjdfad.TVslot30.setImageResource(codg.slots.random())
                dofjdfad.TVslot31.setImageResource(codg.slots.random())
                dofjdfad.TVslot32.setImageResource(codg.slots.random())
                dofjdfad.TVslot33.setImageResource(codg.slots.random())
                dofjdfad.TVslot34.setImageResource(codg.slots.random())
                dofjdfad.TVslot35.setImageResource(codg.slots.random())
                dofjdfad.TVslot36.setImageResource(codg.slots.random())
                dofjdfad.TVslot37.setImageResource(codg.slots.random())
                dofjdfad.TVslot38.setImageResource(codg.slots.random())
                dofjdfad.TVslot39.setImageResource(codg.slots.random())
                dofjdfad.TVslot40.setImageResource(codg.slots.random())
                dofjdfad.TVslot41.setImageResource(codg.slots.random())
                dofjdfad.TVslot42.setImageResource(codg.slots.random())
                dofjdfad.TVslot43.setImageResource(codg.slots.random())
                dofjdfad.TVslot44.setImageResource(codg.slots.random())
                dofjdfad.TVslot45.setImageResource(codg.slots.random())
                dofjdfad.TVslot46.setImageResource(codg.slots.random())
                dofjdfad.TVslot47.setImageResource(codg.slots.random())
                dofjdfad.TVslot48.setImageResource(codg.slots.random())
                dofjdfad.TVslot49.setImageResource(codg.slots.random())
                dofjdfad.TVslot50.setImageResource(codg.slots.random())
                dofjdfad.TVslot52.setImageResource(codg.slots.random())
                dofjdfad.TVslot53.setImageResource(codg.slots.random())
                dofjdfad.TVslot54.setImageResource(codg.slots.random())
                dofjdfad.TVslot55.setImageResource(codg.slots.random())
                dofjdfad.TVslot55.setImageResource(codg.slots.random())
                dofjdfad.TVslot56.setImageResource(codg.slots.random())
                dofjdfad.TVslot57.setImageResource(codg.slots.random())
                dofjdfad.TVslot58.setImageResource(codg.slots.random())
                dofjdfad.TVslot59.setImageResource(codg.slots.random())
                dofjdfad.TVslot1q.setImageResource(codg.slots.random())
                dofjdfad.TVslot2q.setImageResource(codg.slots.random())
                dofjdfad.TVslot3q.setImageResource(codg.slots.random())
                dofjdfad.TVslot4q.setImageResource(codg.slots.random())
                dofjdfad.TVslot5q.setImageResource(codg.slots.random())
                dofjdfad.TVslot6q.setImageResource(codg.slots.random())
                dofjdfad.TVslot7q.setImageResource(codg.slots.random())
                dofjdfad.TVslot8q.setImageResource(codg.slots.random())
                dofjdfad.TVslot9q.setImageResource(codg.slots.random())
                dofjdfad.TVslot10q.setImageResource(codg.slots.random())
                dofjdfad.TVslot11q.setImageResource(codg.slots.random())
                dofjdfad.TVslot12q.setImageResource(codg.slots.random())
                dofjdfad.TVslot13q.setImageResource(codg.slots.random())
                dofjdfad.TVslot14q.setImageResource(codg.slots.random())
                dofjdfad.TVslot15q.setImageResource(codg.slots.random())
                dofjdfad.TVslot16q.setImageResource(codg.slots.random())
                dofjdfad.TVslot17q.setImageResource(codg.slots.random())
                dofjdfad.TVslot18q.setImageResource(codg.slots.random())
                dofjdfad.TVslot19q.setImageResource(codg.slots.random())
                dofjdfad.TVslot20q.setImageResource(codg.slots.random())
                dofjdfad.TVslot21q.setImageResource(codg.slots.random())
                dofjdfad.TVslot22q.setImageResource(codg.slots.random())
                dofjdfad.TVslot23q.setImageResource(codg.slots.random())
                dofjdfad.TVslot24q.setImageResource(codg.slots.random())
                dofjdfad.TVslot25q.setImageResource(codg.slots.random())
                dofjdfad.TVslot26q.setImageResource(codg.slots.random())
                dofjdfad.TVslot27q.setImageResource(codg.slots.random())
                dofjdfad.TVslot28q.setImageResource(codg.slots.random())
                dofjdfad.TVslot29q.setImageResource(codg.slots.random())
                dofjdfad.TVslot30q.setImageResource(codg.slots.random())
                dofjdfad.TVslot31q.setImageResource(codg.slots.random())
                dofjdfad.TVslot32q.setImageResource(codg.slots.random())
                dofjdfad.TVslot33q.setImageResource(codg.slots.random())
                dofjdfad.TVslot34q.setImageResource(codg.slots.random())
                dofjdfad.TVslot35q.setImageResource(codg.slots.random())
                dofjdfad.TVslot36q.setImageResource(codg.slots.random())
                dofjdfad.TVslot37q.setImageResource(codg.slots.random())
                dofjdfad.TVslot38q.setImageResource(codg.slots.random())
                dofjdfad.TVslot39q.setImageResource(codg.slots.random())
                dofjdfad.TVslot40q.setImageResource(codg.slots.random())
                dofjdfad.TVslot41q.setImageResource(codg.slots.random())
                dofjdfad.TVslot42q.setImageResource(codg.slots.random())
                dofjdfad.TVslot43q.setImageResource(codg.slots.random())
                dofjdfad.TVslot44q.setImageResource(codg.slots.random())
                dofjdfad.TVslot45q.setImageResource(codg.slots.random())
                dofjdfad.TVslot46q.setImageResource(codg.slots.random())
                dofjdfad.TVslot47q.setImageResource(codg.slots.random())
                dofjdfad.TVslot48q.setImageResource(codg.slots.random())
                dofjdfad.TVslot49q.setImageResource(codg.slots.random())
                dofjdfad.TVslot50q.setImageResource(codg.slots.random())
                dofjdfad.TVslot52q.setImageResource(codg.slots.random())
                dofjdfad.TVslot53q.setImageResource(codg.slots.random())
                dofjdfad.TVslot54q.setImageResource(codg.slots.random())
                dofjdfad.TVslot55q.setImageResource(codg.slots.random())
                dofjdfad.TVslot55q.setImageResource(codg.slots.random())
                dofjdfad.TVslot56q.setImageResource(codg.slots.random())
                dofjdfad.TVslot57q.setImageResource(codg.slots.random())
                dofjdfad.TVslot58q.setImageResource(sjfa.djgaaf)
                dofjdfad.TVslot59q.setImageResource(sjfa.jdgda)
                dofjdfad.TVslot60q.setImageResource(sjfa.sflad)
            }

    override fun adkljjlj() {
        dofjdfad.Bok.setOnClickListener {
            dofjdfad.CVresult.alpha = 0F
            dofjdfad.CVresult.y = -600F
        }
    }
}






