package com.mops.asois

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mops.asois.databinding.FragmentGameBinding
import com.template.view.balance


class GameFragment : Fragment() {
    val bindidng by lazy { FragmentGameBinding.inflate(layoutInflater) }
    var ramdomList = listOf(
        1000L,1000L,1000L,1000L,1000L,
        1200L,1200L,1200L,1200L,1200L,
        1400L,1400L,1400L,1400L,1400L,
        1600L,1600L,1600L,1600L,1600L,
        1800L,1800L,1800L,1800L,1800L,
        2000L,2000L,2000L,2000L,2000L,
        2200L,2200L,2200L,2200L,2200L,
        2400L,2400L,2400L,2400L,2400L,
        2600L,2600L,2600L,2600L,2600L,
        2800L,2800L,2800L,2800L,2800L,
        3000L,3000L,3000L,3000L,3000L,
        3200L,3200L,3200L,3200L,3200L,
        3400L,3400L,3400L,3400L,3400L,
        3600L,3600L,3600L,3600L,3600L,
        3800L,3800L,3800L,3800L,3800L,
        4000L,4000L,4000L,4000L,4000L,
        4200L,4200L,4200L,4200L,4200L,
        4400L,4400L,4400L,4400L,4400L,
        4600L,4600L,4600L,4600L,4600L,
        4800L,4800L,
        5000L,5000L,
        5200L,5200L,
        5400L,5400L,
        5600L,5600L,
        5800L,5800L,
        6000L,6000L,
        6200L,6200L,
        6400L,6400L,
        6600L,6600L,
        6800L,6800L,
        7000L,7000L,
        7200L,
        7400L,
        7600L,
        7800L,
        8000L,
        8200L,
        8400L,
        8600L,
        8800L,
        9000L,
        9200L,
        9400L,
        9600L,
        9800L,
        10000L,
        10200L,
        10400L,
        10600L,
        10800L,
        11000L,
        11200L,
        11400L,
        11600L,
        11800L,
        12000L,
        12200L,
        12400L,
        12600L,
        12800L,
        13000L,
        13200L,
        13400L,
        13600L,
        13800L,
        14000L,
        14200L,
        14400L,
        14600L,
        14800L,
        15000L,
        15200L,
        15400L,
        15600L,
        15800L,
        16000L,
        16200L,
        16400L,
        16600L,
        16800L,
        17000L,
        17200L,
        17400L,
        17600L,
        17800L,
        18000L,
        18200L,
        18400L,
        18600L,
        18800L,
        19000L,
        19200L,
        19400L,
        19600L,
        19800L,
        20000L
        )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindidng.TVbalans.text = "${balance}"
        (requireContext() as MainActivity).binding.xBetCount.isVisible = false
        (requireContext() as MainActivity).binding.Bstop.isVisible = false

        (requireContext() as MainActivity).binding.CVresult.isVisible = false
        (requireContext() as MainActivity).nuvController = {
            (requireContext() as MainActivity).binding.CVresult.isVisible = false
            bindidng.TVbalans.text = balance.toString()
            balance = balance - 10
            findNavController().navigate(R.id.action_gameFragment_to_winFragment)
        }
        (requireContext() as MainActivity).clickStop = {
            var i1 = true
            (requireContext() as MainActivity).binding.CVresult.isVisible = false
            val i = Intent(requireContext(), WinActivity::class.java)
            startActivity(i)
}
        bindidng.Bplay.setOnClickListener {
            (requireContext() as MainActivity).go()
            Handler(Looper.getMainLooper()).postDelayed({
               (requireContext() as MainActivity).binding.CVresult.isVisible = true
                bindidng.TVbet.isVisible = false
                (requireContext() as MainActivity).binding.xBetCount.isVisible = false
                (requireContext() as MainActivity).aimationWinResult(
                    (requireContext() as MainActivity).binding.CVresult,
                )
                (requireContext() as MainActivity).binding.Bstop.isVisible = false
            },ramdomList.random())//seconds fail
            bindidng.motionScene.transitionToEnd()
            Handler(Looper.getMainLooper()).postDelayed({
               (requireContext() as MainActivity).binding.xBetCount.isVisible = true
            },500)

            }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return bindidng.root

    }

}