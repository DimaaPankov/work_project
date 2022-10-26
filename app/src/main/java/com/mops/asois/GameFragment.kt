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
    val list  = mutableListOf<Int>()
    var ramdom = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindidng.TVbalans.text = "${balance}"
        (requireContext() as MainActivity).binding.xBetCount.isVisible = false
        (requireContext() as MainActivity).binding.Bstop.isVisible = false
             for(i in 0..159){
            list.add(i)
        }
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
            ramdom = list.random()
            (requireContext() as MainActivity).go()
            Handler(Looper.getMainLooper()).postDelayed({
               (requireContext() as MainActivity).binding.CVresult.isVisible = true

                bindidng.TVbet.isVisible = false
                (requireContext() as MainActivity).binding.xBetCount.isVisible = false
                (requireContext() as MainActivity).aimationWinResult(
                    (requireContext() as MainActivity).binding.CVresult,
                )
                (requireContext() as MainActivity).binding.Bstop.isVisible = false

            },5000)
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

    fun aimationWinResult(view:View, xBet: TextView) {
        var time = 500
        val animator = ObjectAnimator.ofFloat(view, View.Y, 400F)
        animator.duration = 500
        animator.start()
        val animator2 = ObjectAnimator.ofFloat(view, View.ALPHA, 1F)
        animator2.duration = 500
        animator2.start()
        var plusResult = 0F
        repeat(100){
            time += 20
            Handler(Looper.getMainLooper()).postDelayed({
                if(it == 19){
                }
            }, time.toLong())
        }
    }
}