package com.template.view

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.template.R
import com.template.databinding.FragmentGameBinding



class GameFragment : Fragment() {

    val binding by lazy { FragmentGameBinding.inflate(layoutInflater) }
    var clicked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
        binding.Bspin.setOnClickListener {
            clickSpin()
        }

        MainActivity.goBack = {
            findNavController().navigate(GameFragmentDirections.actionGameFragmentToMainFragment())
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
    }

    fun init(){

        val img_one_to_two = Model.slots.random()
        binding.TVslot1.setImageResource(Model.slots.random())
        binding.TVslot2.setImageResource(Model.slots.random())
        binding.TVslot3.setImageResource(Model.slots.random())
        binding.TVslot4.setImageResource(Model.slots.random())
        binding.TVslot5.setImageResource(Model.slots.random())
        binding.TVslot6.setImageResource(Model.slots.random())
        binding.TVslot7.setImageResource(Model.slots.random())
        binding.TVslot8.setImageResource(Model.slots.random())
        binding.TVslot9.setImageResource(Model.slots.random())
        binding.TVslot10.setImageResource(Model.slots.random())
        binding.TVslot11.setImageResource(Model.slots.random())
        binding.TVslot12.setImageResource(Model.slots.random())
        binding.TVslot13.setImageResource(Model.slots.random())
        binding.TVslot14.setImageResource(Model.slots.random())
        binding.TVslot15.setImageResource(Model.slots.random())
        binding.TVslot16.setImageResource(Model.slots.random())
        binding.TVslot17.setImageResource(Model.slots.random())
        binding.TVslot18.setImageResource(Model.slots.random())
        binding.TVslot19.setImageResource(Model.slots.random())
        binding.TVslot20.setImageResource(Model.slots.random())
        binding.TVslot21.setImageResource(Model.slots.random())
        binding.TVslot22.setImageResource(Model.slots.random())
        binding.TVslot23.setImageResource(Model.slots.random())
        binding.TVslot24.setImageResource(Model.slots.random())
        binding.TVslot25.setImageResource(Model.slots.random())
        binding.TVslot26.setImageResource(Model.slots.random())
        binding.TVslot27.setImageResource(Model.slots.random())
        binding.TVslot28.setImageResource(Model.slots.random())
        binding.TVslot29.setImageResource(Model.slots.random())
        binding.TVslot30.setImageResource(Model.slots.random())
        binding.TVslot31.setImageResource(Model.slots.random())
        binding.TVslot32.setImageResource(Model.slots.random())
        binding.TVslot33.setImageResource(Model.slots.random())
        binding.TVslot34.setImageResource(Model.slots.random())
        binding.TVslot35.setImageResource(Model.slots.random())
        binding.TVslot36.setImageResource(Model.slots.random())
        binding.TVslot37.setImageResource(Model.slots.random())
        binding.TVslot38.setImageResource(Model.slots.random())
        binding.TVslot39.setImageResource(Model.slots.random())
        binding.TVslot40.setImageResource(Model.slots.random())
        binding.TVslot41.setImageResource(Model.slots.random())
        binding.TVslot42.setImageResource(Model.slots.random())
        binding.TVslot43.setImageResource(Model.slots.random())
        binding.TVslot44.setImageResource(Model.slots.random())
        binding.TVslot45.setImageResource(Model.slots.random())
        binding.TVslot46.setImageResource(Model.slots.random())
        binding.TVslot47.setImageResource(Model.slots.random())
        binding.TVslot48.setImageResource(Model.slots.random())
        binding.TVslot49.setImageResource(Model.slots.random())
        binding.TVslot50.setImageResource(Model.slots.random())
        binding.TVslot52.setImageResource(Model.slots.random())
        binding.TVslot53.setImageResource(Model.slots.random())
        binding.TVslot54.setImageResource(Model.slots.random())
        binding.TVslot55.setImageResource(Model.slots.random())
        binding.TVslot55.setImageResource(Model.slots.random())
        binding.TVslot56.setImageResource(Model.slots.random())
        binding.TVslot57.setImageResource(Model.slots.random())
        binding.TVslot58.setImageResource(Model.slots.random())
        binding.TVslot59.setImageResource(Model.slots.random())
        binding.TVslot1q.setImageResource(Model.slots.random())
        binding.TVslot2q.setImageResource(Model.slots.random())
        binding.TVslot3q.setImageResource(Model.slots.random())
        binding.TVslot4q.setImageResource(Model.slots.random())
        binding.TVslot5q.setImageResource(Model.slots.random())
        binding.TVslot6q.setImageResource(Model.slots.random())
        binding.TVslot7q.setImageResource(Model.slots.random())
        binding.TVslot8q.setImageResource(Model.slots.random())
        binding.TVslot9q.setImageResource(Model.slots.random())
        binding.TVslot10q.setImageResource(Model.slots.random())
        binding.TVslot11q.setImageResource(Model.slots.random())
        binding.TVslot12q.setImageResource(Model.slots.random())
        binding.TVslot13q.setImageResource(Model.slots.random())
        binding.TVslot14q.setImageResource(Model.slots.random())
        binding.TVslot15q.setImageResource(Model.slots.random())
        binding.TVslot16q.setImageResource(Model.slots.random())
        binding.TVslot17q.setImageResource(Model.slots.random())
        binding.TVslot18q.setImageResource(Model.slots.random())
        binding.TVslot19q.setImageResource(Model.slots.random())
        binding.TVslot20q.setImageResource(Model.slots.random())
        binding.TVslot21q.setImageResource(Model.slots.random())
        binding.TVslot22q.setImageResource(Model.slots.random())
        binding.TVslot23q.setImageResource(Model.slots.random())
        binding.TVslot24q.setImageResource(Model.slots.random())
        binding.TVslot25q.setImageResource(Model.slots.random())
        binding.TVslot26q.setImageResource(Model.slots.random())
        binding.TVslot27q.setImageResource(Model.slots.random())
        binding.TVslot28q.setImageResource(Model.slots.random())
        binding.TVslot29q.setImageResource(Model.slots.random())
        binding.TVslot30q.setImageResource(Model.slots.random())
        binding.TVslot31q.setImageResource(Model.slots.random())
        binding.TVslot32q.setImageResource(Model.slots.random())
        binding.TVslot33q.setImageResource(Model.slots.random())
        binding.TVslot34q.setImageResource(Model.slots.random())
        binding.TVslot35q.setImageResource(Model.slots.random())
        binding.TVslot36q.setImageResource(Model.slots.random())
        binding.TVslot37q.setImageResource(Model.slots.random())
        binding.TVslot38q.setImageResource(Model.slots.random())
        binding.TVslot39q.setImageResource(Model.slots.random())
        binding.TVslot40q.setImageResource(Model.slots.random())
        binding.TVslot41q.setImageResource(Model.slots.random())
        binding.TVslot42q.setImageResource(Model.slots.random())
        binding.TVslot43q.setImageResource(Model.slots.random())
        binding.TVslot44q.setImageResource(Model.slots.random())
        binding.TVslot45q.setImageResource(Model.slots.random())
        binding.TVslot46q.setImageResource(Model.slots.random())
        binding.TVslot47q.setImageResource(Model.slots.random())
        binding.TVslot48q.setImageResource(Model.slots.random())
        binding.TVslot49q.setImageResource(Model.slots.random())
        binding.TVslot50q.setImageResource(Model.slots.random())
        binding.TVslot52q.setImageResource(Model.slots.random())
        binding.TVslot53q.setImageResource(Model.slots.random())
        binding.TVslot54q.setImageResource(Model.slots.random())
        binding.TVslot55q.setImageResource(Model.slots.random())
        binding.TVslot55q.setImageResource(Model.slots.random())
        binding.TVslot56q.setImageResource(Model.slots.random())
        binding.TVslot57q.setImageResource(Model.slots.random())
        binding.TVslot58q.setImageResource(Model.slots.random())
        binding.TVslot59q.setImageResource(Model.slots.random())
        binding.TVslot60q.setImageResource(Model.slots.random())






    }

    var lastSlot1 = 0
    var lastSlot2 = 0
    var lastSlot3 = 0

    fun clickSpin() {
        binding.Bspin.setOnClickListener {

            lastSlot1 = Model.slots.random()
            lastSlot2 = Model.slots.random()
            lastSlot3 = Model.slots.random()

            binding.TVslot1.setImageResource(lastSlot1)
            binding.TVslot2.setImageResource(lastSlot2)
            binding.TVslot3.setImageResource(lastSlot3)

            binding.LLline1.y = -12068F
            binding.LLline2.y = -12068F
            binding.LLline3.y = -12068F


            val animator111 = ObjectAnimator.ofFloat(binding.LLline1, View.Y, 60F)
            animator111.duration = 3000
            animator111.start()
            Handler(Looper.getMainLooper()).postDelayed({
                val animator222 = ObjectAnimator.ofFloat(binding.LLline2, View.Y, 60F)
                animator222.duration = 3000
                animator222.start()
            }, 1000)
            Handler(Looper.getMainLooper()).postDelayed({
                val animator333 = ObjectAnimator.ofFloat(binding.LLline3, View.Y, 60F)
                animator333.duration = 3000
                animator333.start()

            }, 2000)

            Handler(Looper.getMainLooper()).postDelayed({
                binding.TVslot58q.setImageResource(lastSlot1)
                binding.TVslot59q.setImageResource(lastSlot2)
                binding.TVslot60q.setImageResource(lastSlot3)
            },1000)
        }
    }


        fun clickBack() {
        binding.IVback.setOnClickListener {
            (requireActivity() as MainActivity).navController.navigate(R.id.action_gameFragment_to_mainFragment)
        }

    }
}





