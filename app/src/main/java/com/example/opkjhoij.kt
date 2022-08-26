package com.example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.databinding.FragmentBetBinding
import com.example.view.vwi9wovd

class opkjhoij : Fragment(), vjje.revoer {

    lateinit var weuvjuewv: FragmentBetBinding
    val ewcjiwecwec = vjje(vwi9wovd)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        weuvjuewv = FragmentBetBinding.inflate(layoutInflater)
        ewcjiwecwec.rvkeikvorekkrevoprev(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return weuvjuewv.root
    }

    override fun onDestroy() {
        super.onDestroy()
        ewcjiwecwec.distroy()
    }
    override fun clickListner() {
        weuvjuewv.domButton0.setOnClickListener {
            ewcjiwecwec.jcwojvwvkpkpk()
            weuvjuewv.domInput.text = ewcjiwecwec.iououiiu
        }

        weuvjuewv.domButton1.setOnClickListener {
            ewcjiwecwec.vi0ofivo()
            weuvjuewv.domInput.text = ewcjiwecwec.iououiiu
        }
        weuvjuewv.domButton2.setOnClickListener {
            ewcjiwecwec.hjokljiojopjuop()
            weuvjuewv.domInput.text = ewcjiwecwec.iououiiu
        }
        weuvjuewv.domButton3.setOnClickListener {
            ewcjiwecwec.uj9vcueiorv()
            weuvjuewv.domInput.text = ewcjiwecwec.iououiiu
        }
        weuvjuewv.domButton4.setOnClickListener {
            ewcjiwecwec.iofvhioer()
            weuvjuewv.domInput.text = ewcjiwecwec.iououiiu
        }
        weuvjuewv.domButton5.setOnClickListener {
            ewcjiwecwec.vjfrojuerov()
            weuvjuewv.domInput.text = ewcjiwecwec.iououiiu
        }
        weuvjuewv.domButton6.setOnClickListener {
            ewcjiwecwec.vrioev()
            weuvjuewv.domInput.text = ewcjiwecwec.iououiiu
        }
        weuvjuewv.domButton7.setOnClickListener {
            ewcjiwecwec.vujeropvero()
            weuvjuewv.domInput.text = ewcjiwecwec.iououiiu
        }
        weuvjuewv.domButton8.setOnClickListener {
            ewcjiwecwec.voperovp()
            weuvjuewv.domInput.text = ewcjiwecwec.iououiiu
        }
        weuvjuewv.domButton9.setOnClickListener {
            ewcjiwecwec.vkrojeruve()
            weuvjuewv.domInput.text = ewcjiwecwec.iououiiu
        }
        weuvjuewv.domButtonEquals.setOnClickListener {
            ewcjiwecwec.kvopei()
            (requireActivity() as MainActivity).navController.navigate(R.id.action_betFragment_to_gameFragment)

        }
    }}


class vjje (val data: ceikweihewohoe) {
    var iououiiu = ""
    private var vjrejrvijoioi: revoer? = null
    fun rvkeikvorekkrevoprev(iipoipko: revoer) {
        vjrejrvijoioi = iipoipko
        vjrejrvijoioi!!.clickListner()

    }
    fun jcwojvwvkpkpk(){iououiiu+=0}
    fun vi0ofivo(){iououiiu+=1}
    fun hjokljiojopjuop(){iououiiu+=2}
    fun uj9vcueiorv(){iououiiu+=3}
    fun iofvhioer(){iououiiu+=4}
    fun vjfrojuerov(){iououiiu+=5}
    fun vrioev(){iououiiu+=6}
    fun vujeropvero(){iououiiu+=7}
    fun voperovp(){iououiiu+=8}
    fun vkrojeruve(){iououiiu+=9}
    fun kvopei(){data.ewowjw(iououiiu)}

    fun distroy() {
        vjrejrvijoioi = null
    }

    interface revoer {
        fun clickListner()
    }

}