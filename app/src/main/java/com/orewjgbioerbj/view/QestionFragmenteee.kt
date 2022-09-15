package com.orewjgbioerbj.view

import android.os.Bundle
import android.os.CountDownTimer
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.orewjgbioerbj.R
import com.orewjgbioerbj.databinding.FragmentQestionBinding
import com.orewjgbioerbj.wi0fuea9opf
import com.orewjgbioerbj.models.Model
import com.orewjgbioerbj.wufv9iud

class QestionFragment : Fragment() {
     val wfjgiehgoiehj by lazy {FragmentQestionBinding.inflate(layoutInflater)}
    var efiheihei = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        eiaugf9ueg9()
        egu9ueopgv()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return wfjgiehgoiehj.root
    }
    private fun eiaugf9ueg9(){
        wfjgiehgoiehj.tvQestionwqwqlok.setText(eu9gfur9v.ewau9fuw90().udsh)
        wfjgiehgoiehj.imageQestionwqwqlok.setImageResource(eu9gfur9v.ewau9fuw90().avjhhdiv)
        wfjgiehgoiehj.btnTruewqwqlok.isVisible = true
}


     private fun egu9ueopgv(){
        wfjgiehgoiehj.btnTruewqwqlok.setOnClickListener {
            efi0euf9()
        }

        wfjgiehgoiehj.btnFalsewqwqlok.setOnClickListener {
            eif9ue9()
        }
    }


    private fun efi0euf9() {
        eu9gfur9v.uefiue9io()
        wfjgiehgoiehj.imageQestionwqwqlok.setImageResource(eu9gfur9v.ewau9fuw90().avjhhdiv)
        wfjgiehgoiehj.tvQestionwqwqlok.setText(eu9gfur9v.ewau9fuw90().udsh)

        if (eu9gfur9v.oevjeioffuf()) {
            wufv9iud++
            wfjgiehgoiehj.imageQestionwqwqlok.isVisible = false
            wfjgiehgoiehj.frameLayoutwqwqlok.setBackgroundColor(resources.getColor(R.color.teal_200))
            wfjgiehgoiehj.tvQestionwqwqlok.isVisible = false
            wfjgiehgoiehj.background.setBackgroundColor(resources.getColor(R.color.teal_200))
            wfjgiehgoiehj.btnTruewqwqlok.isVisible = false
            wfjgiehgoiehj.btnFalsewqwqlok.isVisible = false
            wfjgiehgoiehj.textViewTRUEwqwqlok.isVisible = true
            wfjgiehgoiehj.pdfToolbarwqwqlok.isVisible = false


        } else {
            wi0fuea9opf++
            wfjgiehgoiehj.imageQestionwqwqlok.isVisible = false
            wfjgiehgoiehj.frameLayoutwqwqlok.setBackgroundColor(resources.getColor(R.color.red))
            wfjgiehgoiehj.tvQestionwqwqlok.isVisible = false
            wfjgiehgoiehj.background.setBackgroundColor(resources.getColor(R.color.red))
            wfjgiehgoiehj.btnTruewqwqlok.isVisible = false
            wfjgiehgoiehj.btnFalsewqwqlok.isVisible = false
            wfjgiehgoiehj.textViewFALSEwqwqlok.isVisible = true
            wfjgiehgoiehj.pdfToolbarwqwqlok.isVisible = false

        }

        wfouewivo(1000L)

    }



    private fun eif9ue9() {


        eu9gfur9v.uefiue9io()

        wfjgiehgoiehj.imageQestionwqwqlok.setImageResource(eu9gfur9v.ewau9fuw90().avjhhdiv)
        wfjgiehgoiehj.tvQestionwqwqlok.setText(eu9gfur9v.ewau9fuw90().udsh)

        if (!eu9gfur9v.oevjeioffuf()) {
            wufv9iud++
            wfjgiehgoiehj.imageQestionwqwqlok.isVisible = false
            wfjgiehgoiehj.frameLayoutwqwqlok.setBackgroundColor(resources.getColor(R.color.teal_200))
            wfjgiehgoiehj.tvQestionwqwqlok.isVisible =  false
            wfjgiehgoiehj.background.setBackgroundColor(resources.getColor(R.color.teal_200))
            wfjgiehgoiehj.btnTruewqwqlok.isVisible = false
            wfjgiehgoiehj.btnFalsewqwqlok.isVisible = false
            wfjgiehgoiehj.textViewTRUEwqwqlok.isVisible = true
            wfjgiehgoiehj.pdfToolbarwqwqlok.isVisible = false

        } else {
            wi0fuea9opf++
            wfjgiehgoiehj.imageQestionwqwqlok.isVisible = false
            wfjgiehgoiehj.frameLayoutwqwqlok.setBackgroundColor(resources.getColor(R.color.red))
            wfjgiehgoiehj.tvQestionwqwqlok.isVisible =  false
            wfjgiehgoiehj.background.setBackgroundColor(resources.getColor(R.color.red))
            wfjgiehgoiehj.btnTruewqwqlok.isVisible = false
            wfjgiehgoiehj.btnFalsewqwqlok.isVisible = false
            wfjgiehgoiehj.textViewFALSEwqwqlok.isVisible = true
            wfjgiehgoiehj.pdfToolbarwqwqlok.isVisible = false

        }
        wfouewivo(1000L)

    }

    private fun wfouewivo(aefwu9euaf:Long ){

        object : CountDownTimer(aefwu9euaf, 1000) {
            override fun onTick(millisUntilFinished: Long) {}

            override fun onFinish() {
                if(efiheihei) {
                    findNavController().navigate(R.id.action_qestionFragment_to_resultFragment)
                } else {
                    wfjgiehgoiehj.imageQestionwqwqlok.isVisible = true
                    wfjgiehgoiehj.frameLayoutwqwqlok.setBackgroundColor(resources.getColor(R.color.black))
                    wfjgiehgoiehj.tvQestionwqwqlok.isVisible = true
                    wfjgiehgoiehj.background.setBackgroundColor(resources.getColor(R.color.black))
                    wfjgiehgoiehj.btnTruewqwqlok.isVisible = true
                    wfjgiehgoiehj.btnFalsewqwqlok.isVisible = true
                    wfjgiehgoiehj.textViewTRUEwqwqlok.isVisible = false
                    wfjgiehgoiehj.textViewFALSEwqwqlok.isVisible = false
                    wfjgiehgoiehj.pdfToolbarwqwqlok.isVisible = true

                }


                if(eu9gfur9v.ueaf9uef9 == 11) {
                    efiheihei = true
                }



            }
        }.start()

        if(efiheihei){
            object : CountDownTimer(5000, 1000) {
                override fun onTick(millisUntilFinished: Long) {}

                override fun onFinish() {
                    findNavController().navigate(R.id.action_resultFragment_to_qestionFragment)
                    wufv9iud = 0
                    wi0fuea9opf = 0
                }
            }.start()
        }

    }
}


   object eu9gfur9v{
   var ueaf9uef9  = 0
val aeuwf9ue = listOf(
    Model(R.string.XXI, R.drawable.xvi, false),
    Model(R.string.Americans, R.drawable.amerecans_pokers, true),
    Model(R.string.difrient_game, R.drawable.difrent_game, true),
    Model(R.string.people, R.drawable.people, true),
    Model(R.string.five_mastchi, R.drawable.five_mastchi, false),
    Model(R.string.sochial_status, R.drawable.pokers_social_status, true),
    Model(R.string.seven, R.drawable.one, true),
    Model(R.string.eight, R.drawable.two, true),
    Model(R.string.nine, R.drawable.three, true),
    Model(R.string.ten, R.drawable.foure, true),
    Model(R.string.eleven, R.drawable.five, true),
    Model(R.string.twelwe, R.drawable.six, true),
)


fun ewau9fuw90(): Model {
    return aeuwf9ue[ueaf9uef9]
}
fun uefiue9io(){
    if(ueaf9uef9<aeuwf9ue.size-1){
        ueaf9uef9++
    }else{
        ueaf9uef9 = 0
    }
}

fun oevjeioffuf() = if(ueaf9uef9!=0)aeuwf9ue[ueaf9uef9-1].dsjf else aeuwf9ue[ueaf9uef9].dsjf
}