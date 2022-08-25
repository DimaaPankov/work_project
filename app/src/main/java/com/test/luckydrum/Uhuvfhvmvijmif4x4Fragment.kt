package com.test.luckydrum

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.test.luckydrum.databinding.Uhuvfhvmvijmif4x4FragmentBinding


class Uhuvfhvmvijmif4x4Fragment : Fragment() {
    val anim = Gewihf(IndexFargment.FRAGMENT4X4)

     lateinit var binding: Uhuvfhvmvijmif4x4FragmentBinding
    private val args: RehguirghFragmentArgs by navArgs()
    private var textG = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Uhuvfhvmvijmif4x4FragmentBinding.inflate(layoutInflater)
        anim.init(requireContext())

        textG.add(args.list.get(0))
        textG.add(args.list.get(1))
        textG.add(args.list.get(2))
        textG.add(args.list.get(3))
        textG.add(args.list.get(4))
        textG.add(args.list.get(5))
        textG.add(args.list.get(6))
        textG.add(args.list.get(7))
        textG.add(args.list.get(0))
        textG.add(args.list.get(1))
        textG.add(args.list.get(2))
        textG.add(args.list.get(3))
        textG.add(args.list.get(4))
        textG.add(args.list.get(5))
        textG.add(args.list.get(6))
        textG.add(args.list.get(7))

        textG = ramdommCollections(textG.toTypedArray()).toMutableList()


        Handler(Looper.getMainLooper()).postDelayed({
            timer.start()
        },3000)

        binding.TVslot1.text = textG.get(0)
        binding.TVslot2.text = textG.get(1)
        binding.TVslot3.text = textG.get(2)
        binding.TVslot4.text = textG.get(3)
        binding.TVslot5.text = textG.get(4)
        binding.TVslot6.text = textG.get(5)
        binding.TVslot7.text = textG.get(6)
        binding.TVslot8.text = textG.get(7)
        binding.TVslot9.text = textG.get(8)
        binding.TVslot10.text = textG.get(9)
        binding.TVslot11.text = textG.get(10)
        binding.TVslot12.text = textG.get(11)
        binding.TVslot13.text = textG.get(12)
        binding.TVslot14.text = textG.get(13)
        binding.TVslot15.text = textG.get(14)
        binding.TVslot16.text = textG.get(15)

        indexFragment = 1
        indexGo = 1
        animationStart()
         timer.start()


    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

private fun animationStart(){
        Handler(Looper.getMainLooper()).postDelayed({
            val animator0 =
                ObjectAnimator.ofFloat(binding.TVslot1, View.SCALE_Y, 0F);animator0.duration =
            200;animator0.start()
            val animator1 =
                ObjectAnimator.ofFloat(binding.TVslot2, View.SCALE_Y, 0F);animator1.duration =
            200;animator1.start()
            val animator2 =
                ObjectAnimator.ofFloat(binding.TVslot3, View.SCALE_Y, 0F);animator2.duration =
            200;animator2.start()
            val animator3 =
                ObjectAnimator.ofFloat(binding.TVslot4, View.SCALE_Y, 0F);animator3.duration =
            200;animator3.start()
            val animator4 =
                ObjectAnimator.ofFloat(binding.TVslot5, View.SCALE_Y, 0F);animator4.duration =
            200;animator4.start()
            val animator5 =
                ObjectAnimator.ofFloat(binding.TVslot6, View.SCALE_Y, 0F);animator5.duration =
            200;animator5.start()
            val animator6 =
                ObjectAnimator.ofFloat(binding.TVslot7, View.SCALE_Y, 0F);animator6.duration =
            200;animator6.start()
            val animator7 =
                ObjectAnimator.ofFloat(binding.TVslot8, View.SCALE_Y, 0F);animator7.duration =
            200;animator7.start()
            val animator8 =
                ObjectAnimator.ofFloat(binding.TVslot9, View.SCALE_Y, 0F);animator8.duration =
            200;animator8.start()
            val animator9 =
                ObjectAnimator.ofFloat(binding.TVslot10, View.SCALE_Y, 0F);animator9.duration =
            200;animator9.start()
            val animator10 =
                ObjectAnimator.ofFloat(binding.TVslot11, View.SCALE_Y, 0F);animator10.duration =
            200;animator10.start()
            val animator11 =
                ObjectAnimator.ofFloat(binding.TVslot12, View.SCALE_Y, 0F);animator11.duration =
            200;animator11.start()
            val animator12 =
                ObjectAnimator.ofFloat(binding.TVslot13, View.SCALE_Y, 0F);animator12.duration =
            200;animator12.start()
            val animator13 =
                ObjectAnimator.ofFloat(binding.TVslot14, View.SCALE_Y, 0F);animator13.duration =
            200;animator13.start()
            val animator14 =
                ObjectAnimator.ofFloat(binding.TVslot15, View.SCALE_Y, 0F);animator14.duration =
            200;animator14.start()
            val animator15 =
                ObjectAnimator.ofFloat(binding.TVslot16, View.SCALE_Y, 0F);animator15.duration =
            200;animator15.start()
        },3000)
        Handler(Looper.getMainLooper()).postDelayed({
            val animator02 = ObjectAnimator.ofFloat(binding.TVslot111, View.SCALE_Y, 1F);animator02.duration=200;animator02.start()
            val animator122 = ObjectAnimator.ofFloat(binding.TVslot22, View.SCALE_Y, 1F);animator122.duration = 200;animator122.start()
            val animator22 = ObjectAnimator.ofFloat(binding.TVslot33, View.SCALE_Y, 1F);animator22.duration = 200;animator22.start()
            val animator32 = ObjectAnimator.ofFloat(binding.TVslot44, View.SCALE_Y, 1F);animator32.duration = 200;animator32.start()
            val animator42 = ObjectAnimator.ofFloat(binding.TVslot55, View.SCALE_Y, 1F);animator42.duration = 200;animator42.start()
            val animator52 = ObjectAnimator.ofFloat(binding.TVslot66, View.SCALE_Y, 1F);animator52.duration = 200;animator52.start()
            val animator62 = ObjectAnimator.ofFloat(binding.TVslot77, View.SCALE_Y, 1F);animator62.duration = 200;animator62.start()
            val animator72 = ObjectAnimator.ofFloat(binding.TVslot88, View.SCALE_Y, 1F);animator72.duration = 200;animator72.start()
            val animator82 = ObjectAnimator.ofFloat(binding.TVslot99, View.SCALE_Y, 1F);animator82.duration = 200;animator82.start()
            val animator92 = ObjectAnimator.ofFloat(binding.TVslot1010, View.SCALE_Y, 1F);animator92.duration = 200;animator92.start()
            val animator102 = ObjectAnimator.ofFloat(binding.TVslot1111, View.SCALE_Y, 1F);animator102.duration = 200;animator102.start()
            val animator112 = ObjectAnimator.ofFloat(binding.TVslot1212, View.SCALE_Y, 1F);animator112.duration = 200;animator112.start()
            val animator1222 = ObjectAnimator.ofFloat(binding.TVslot1313, View.SCALE_Y, 1F);animator1222.duration = 200;animator1222.start()
            val animator132 = ObjectAnimator.ofFloat(binding.TVslot1414, View.SCALE_Y, 1F);animator132.duration = 200;animator132.start()
            val animator142 = ObjectAnimator.ofFloat(binding.TVslot1515, View.SCALE_Y, 1F);animator142.duration = 200;animator142.start()
            val animator152 = ObjectAnimator.ofFloat(binding.TVslot1616, View.SCALE_Y, 1F);animator152.duration = 200;animator152.start()
        },3200)



        binding.TVslot111.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot1,
                binding.TVslot111,
                8
            )
        }
        binding.TVslot22.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot2,
                binding.TVslot22,
                8
            )
        }
        binding.TVslot33.setOnClickListener {
            anim. erhfieeee(
                binding.TVslot3,
                binding.TVslot33,
                8
            )
        }
        binding.TVslot44.setOnClickListener {
            anim. erhfieeee(
                binding.TVslot4,
                binding.TVslot44,
                8
            )
        }
        binding.TVslot55.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot5,
                binding.TVslot55,
                8
            )
        }
        binding.TVslot66.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot6,
                binding.TVslot66,
                8
            )
        }
        binding.TVslot77.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot7,
                binding.TVslot77,
                8
            )
        }
        binding.TVslot88.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot8,
                binding.TVslot88,
                8
            )
        }
        binding.TVslot99.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot9,
                binding.TVslot99,
                8
            )
        }
        binding.TVslot1010.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot10,
                binding.TVslot1010,
                8
            )
        }
        binding.TVslot1111.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot11,
                binding.TVslot1111,
                8
            )
        }
        binding.TVslot1212.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot12,
                binding.TVslot1212,
                8
            )
        }
        binding.TVslot1313.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot13,
                binding.TVslot1313,
                8
            )
        }
        binding.TVslot1414.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot14,
                binding.TVslot1414,
                8
            )
        }
        binding.TVslot1515.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot15,
                binding.TVslot1515,
                8
            )
        }
        binding.TVslot1616.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot16,
                binding.TVslot1616,
                8
            )
        }
}

  }

