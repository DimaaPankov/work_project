package com.orewjgbioerbj.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.orewjgbioerbj.databinding.FragmentResultBinding
import com.orewjgbioerbj.wi0fuea9opf
import com.orewjgbioerbj.wufv9iud

class ResultFragmenteee : Fragment() {

    lateinit var weaif0ue: FragmentResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        weaif0ue = FragmentResultBinding.inflate(layoutInflater)

        weaif0ue.tvTruewqwqlok.text = "TRUE ${wufv9iud}"
        weaif0ue.tvFalsewqwqlok.text = "FALSE ${wi0fuea9opf}"

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return weaif0ue.root

    }

}