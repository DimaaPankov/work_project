package com.test.luckydrum.e3jhivh

import android.animation.ObjectAnimator

import android.os.Bundle
import android.os.Handler
import android.os.Looper

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.test.luckydrum.MainActivity
import com.test.luckydrum.R
import com.test.luckydrum.databinding.FragmentFirstqasdBinding
import com.test.luckydrum.eirhvei.rvjkh
import com.test.luckydrum.eirhvei.r3wovhj

import com.test.luckydrum.wghveiv.gerughvrgu

data class CountDrum(var i:Int,var color:Int)


class FirstFragment : Fragment() {
    var countBonus = 0
    var histr = mutableListOf<Boolean>(false,false,false,
                                       false,false,false,
                                       false,false,false,
                                       false)

    companion object {
        val RED = 0
        val BLACK = 1
    }
    var rote = 0
    var roteIndex = 0
    var lastRote = 0
    var indexList = 0

    val binding by lazy { FragmentFirstqasdBinding.inflate(layoutInflater) }
    lateinit var animator1:ObjectAnimator


  var indexRot = listOf(0,14,17,25,9,8,23,11,23,4,8,40,50,23,12,33,29,26, 11,33,1,20,21,20,14,27,35,
      0,14,17,25,9,8,23,11,23,4,8,40,50,23,12,33,29,26,11,33,1,20,21,20,14,27,35)

    val listCount = listOf(
        CountDrum(26, BLACK),
        CountDrum(2,BLACK),
        CountDrum(25, RED),
        CountDrum(18,RED),
        CountDrum(34,RED),
        CountDrum(18,RED),
        CountDrum(23,RED),
        CountDrum(7,RED),
        CountDrum(5,RED),
        CountDrum(6, BLACK),
        CountDrum(29, BLACK),
        CountDrum(16,RED),
        CountDrum(22, BLACK),
        CountDrum(8, BLACK),
        CountDrum(22, BLACK),
        CountDrum(12,RED),
        CountDrum(34, RED),
        CountDrum(18, RED),
        CountDrum(21,RED),
        CountDrum(6, BLACK),
        CountDrum(25,RED),
        CountDrum(15, BLACK),
        CountDrum(28,BLACK),
        CountDrum(9,RED),
        CountDrum(35, BLACK),
        CountDrum(11, BLACK),
        CountDrum(30, RED),
        CountDrum(11, BLACK),
        CountDrum(33,BLACK),
        CountDrum(1,RED),
        CountDrum(25,RED),
        CountDrum(14,RED),
        CountDrum(3,RED),
        CountDrum(31, BLACK),
        CountDrum(17,BLACK),
        CountDrum(26,BLACK),
        CountDrum(2, BLACK),
        CountDrum(28, BLACK),
        CountDrum(2, BLACK),
        CountDrum(27,RED),
        CountDrum(14,RED),
        CountDrum(25,RED),
        CountDrum(16,RED),



        )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         binding.TVbalansqasd.text = gerughvrgu(requireContext()).wevh().toString()

        binding.IVBonusqasd.setOnClickListener {
            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToBonusFragment())
        }

        MainActivity.goBack = {}

        binding.TVinfoqasd.setOnClickListener {
            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToInfoFragment())
        }

        if(rvjkh.color == RED){
            binding.VbetColorqasd.setBackgroundColor(resources.getColor(R.color.red))
        }else{
            binding.VbetColorqasd.setBackgroundColor(resources.getColor(R.color.black))
        }
        binding.TVbetMainqasd.text = rvjkh.i.toString()


        binding.Bbetqasd.setOnClickListener{
            findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToBetFragment())
        }

            binding.bPlayqasd.setOnClickListener{
                gerughvrgu(requireContext()).ewfh(gerughvrgu(requireContext()).wevh() - r3wovhj)
                binding.TVbalansqasd.text = (gerughvrgu(requireContext()).wevh()).toString()
                rote  = rote()
                animationDrum()

                Handler(Looper.getMainLooper()).postDelayed({

                        if (rvjkh.color == listCount[indexList].color) {
                            gerughvrgu(requireContext()).ewfh(gerughvrgu(requireContext()).wevh() + r3wovhj * 2)
                            binding.TVbalansqasd.text = (gerughvrgu(requireContext()).wevh()).toString()
                                 histr.add(true)
                    }else if(rvjkh.i == listCount[indexList].color) {
                            gerughvrgu(requireContext()).ewfh(gerughvrgu(requireContext()).wevh() + r3wovhj * 2)
                            binding.TVbalansqasd.text = (gerughvrgu(requireContext()).wevh()).toString()
                            histr.add(false)
                        }
                       var i = histr.size -1
                    if(histr[i] && histr[i-1] && histr[i-2]) {
                        countBonus = 100
                        openBonus()
                        binding.TVcountBonusqasd.text  = countBonus.toString()
                        histr = mutableListOf<Boolean>(
                            false,false,false,
                            false,false,false,
                            false,false,false,
                            false)
                    }else if(histr[i] && histr[i-1] && histr[i-2] && histr[i - 3] && histr[i-4]){
                        countBonus = 500
                        openBonus()
                        binding.TVcountBonusqasd.text = countBonus.toString()
                        histr = mutableListOf<Boolean>(
                            false,false,false,
                            false,false,false,
                            false,false,false,
                            false)
                    }else if(histr[i] && histr[i-1] && histr[i-2] && histr[i - 3] && histr[i-4] ||
                             histr[i-5] && histr[i-6] && histr[i-7] && histr[i - 8] && histr[i-9]){
                        countBonus = 500
                        openBonus()
                        binding.TVcountBonusqasd.text  =  countBonus.toString()
                        histr = mutableListOf<Boolean>(
                            false,false,false,
                            false,false,false,
                            false,false,false,
                            false)
                    }
                    ++indexList
                },4000)
}

        binding.Bbonusqasd.setOnClickListener{
            val animator5 = ObjectAnimator.ofFloat(binding.CVbonusqasd, View.ALPHA, 0F)
            animator5.duration = 1000
            animator5.start()

            val animator6 = ObjectAnimator.ofFloat(binding.CVbonusqasd, View.X, -130F)
            animator6.duration = 1500
            animator6.start()
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root


    }
    private fun animationDrum(){
        animator1 = ObjectAnimator.ofFloat(binding.imageViewqasd, View.ROTATION, rote().toFloat())
        animator1.duration = 4000
        animator1.start()
    }

    fun rote():Int {
        roteIndex = indexRot[indexList]
        lastRote+=1805+indexRot[indexList]*10

        return lastRote

    }

    private fun openBonus(){
        binding.TVcountBonusqasd.text = countBonus.toString()
       val animator5 = ObjectAnimator.ofFloat(binding.CVbonusqasd, View.ALPHA, 1F)
        animator5.duration = 1000
        animator5.start()

       val animator6 = ObjectAnimator.ofFloat(binding.CVbonusqasd, View.X, 130F)
        animator6.duration = 1500
        animator6.start()
    }

}