package com.test.luckydrum.view

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.app.Application
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.test.luckydrum.MainActivity
import com.test.luckydrum.R
import com.test.luckydrum.Utils.BET
import com.test.luckydrum.Utils.BETsum

import com.test.luckydrum.databinding.FragmentFirstBinding

data class CountDrum(var i:Int,var color:Int)


class FirstFragment : Fragment() {
    companion object {
        val RED = 0
        val BLACK = 1
        val GREEN = 2
    }
    var rote = 0
    var roteIndex = 0
    var lastRote = 0
    var indexList = 0

    val binding by lazy { FragmentFirstBinding.inflate(layoutInflater) }
    lateinit var animator1:ObjectAnimator


  var indexRot = listOf(0,14,17,25,9,8,23,11,23,4,8,40,50,23,12,33,29,26, 11,33,1,20,21,20,14,27,35,
      0,14,17,25,9,8,23,11,23,4,8,40,50,23,12,33,29,26,11,33,1,20,21,20,14,27,35)

    val listCount = listOf(
        CountDrum(12,RED),
        CountDrum(19,RED),
        CountDrum(4,BLACK),
        CountDrum(31,BLACK),
        CountDrum(2,BLACK),
        CountDrum(31,BLACK),
        CountDrum(11,BLACK),
        CountDrum(22,BLACK),
        CountDrum(8,BLACK),
        CountDrum(25,RED),
        CountDrum(9,RED),
        CountDrum(23,RED),
        CountDrum(14,RED),
        CountDrum(36,RED),
        CountDrum(14,RED),
        CountDrum(29,BLACK),
        CountDrum(2,BLACK),
        CountDrum(31, BLACK),
        CountDrum(15,BLACK),
        CountDrum(25,RED),
        CountDrum(4,BLACK),
        CountDrum(26,RED),
        CountDrum(18,RED),
        CountDrum(20,BLACK),
        CountDrum(7,RED),
        CountDrum(27,RED),
        CountDrum(13, BLACK),
        CountDrum(27, RED),
        CountDrum(10,BLACK),
        CountDrum(5,RED),
        CountDrum(4,BLACK),
        CountDrum(16,RED),
        CountDrum(4, BLACK),
        CountDrum(29,BLACK),
        CountDrum(2,BLACK),
        CountDrum(28,BLACK),
        CountDrum(1,RED),
        CountDrum(21,RED),
        CountDrum(12,RED),
        CountDrum(19,RED),
        CountDrum(4,BLACK),
        CountDrum(31,BLACK),
        CountDrum(2,BLACK),
        CountDrum(31,BLACK),
        CountDrum(11,BLACK),
        CountDrum(22,BLACK),
        CountDrum(8,BLACK),
        CountDrum(25,RED),
        CountDrum(9,RED),
        CountDrum(23,RED),
        CountDrum(14,RED),
        CountDrum(36,RED),
        CountDrum(14,RED),
        CountDrum(29,BLACK),
        CountDrum(2,BLACK),
        CountDrum(31, BLACK),
        CountDrum(15,BLACK),
        CountDrum(25,RED),
        CountDrum(4,BLACK),
        CountDrum(26,RED),
        CountDrum(18,RED),
        CountDrum(20,BLACK),
        CountDrum(7,RED),
        CountDrum(27,RED),
        CountDrum(13, BLACK),
        CountDrum(27, RED),
        CountDrum(10,BLACK),
        CountDrum(5,RED),
        CountDrum(4,BLACK),
        CountDrum(16,RED),
        CountDrum(4, BLACK),
        CountDrum(29,BLACK),
        CountDrum(2,BLACK),
        CountDrum(28,BLACK),
        CountDrum(1,RED),
        CountDrum(21,RED),


        )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MainActivity.goBack = {}

        binding.TVinfo.setOnClickListener {
            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToInfoFragment())
        }

        if(BET.color == RED){
            binding.VbetColor.setBackgroundColor(resources.getColor(R.color.red))
        }else{
            binding.VbetColor.setBackgroundColor(resources.getColor(R.color.black))
        }
        binding.TVbetMain.text = BET.i.toString()


        binding.Bbet.setOnClickListener{
            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToBetFragment())
        }

            binding.bPlay.setOnClickListener{
                Log.d("rrrrrrrrrrrrrr",roteIndex.toString())
                binding.TVbalans.text = ((binding.TVbalans.text.toString().toInt()) - BETsum).toString()
                rote  = rote()
                animationDrum()

                Handler(Looper.getMainLooper()).postDelayed({

                        if (BET.color == listCount[indexList].color) {
                            binding.TVbalans.text = ((binding.TVbalans.text.toString()
                                .toInt()) + (BETsum * 2)).toString()

                    }else if(BET.i == listCount[indexList].color) {
                            binding.TVbalans.text = ((binding.TVbalans.text.toString()
                                .toInt()) + (BETsum * 2)).toString()
                        }
                    ++indexList
                },3000)


        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root

    }
//rrrr
    private fun animationDrum(){
        animator1 = ObjectAnimator.ofFloat(binding.imageView, View.ROTATION, rote().toFloat())
        animator1.duration = 4000
        animator1.start()
    }

    fun rote():Int {
        //roteIndex = (0..35).random()
        roteIndex = indexRot[indexList]
        // lastRote+=1805+roteIndex*10
        lastRote+=1805+indexRot[indexList]*10

        return lastRote
        // fun rote():Int {
        //
        //        return indexRot[indexList]
        //    }
    }

}