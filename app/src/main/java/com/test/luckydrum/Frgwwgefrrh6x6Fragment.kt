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
import com.test.luckydrum.databinding.Frgwwgefrrh6x6FragmentBinding


class Frgwwgefrrh6x6Fragment : Fragment() {

    private val args: Frgwwgefrrh6x6FragmentArgs by navArgs()
    private var textG = mutableListOf<String>()
    lateinit var binding: Frgwwgefrrh6x6FragmentBinding
    val anim = Gewihf(IndexFargment.FRAGMENT6X6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Frgwwgefrrh6x6FragmentBinding.inflate(layoutInflater)
        anim.init(requireContext())

        textG.add(args.list.get(0))
        textG.add(args.list.get(1))
        textG.add(args.list.get(2))
        textG.add(args.list.get(3))
        textG.add(args.list.get(4))
        textG.add(args.list.get(5))
        textG.add(args.list.get(6))
        textG.add(args.list.get(7))
        textG.add(args.list.get(8))
        textG.add(args.list.get(9))
        textG.add(args.list.get(10))
        textG.add(args.list.get(11))
        textG.add(args.list.get(12))
        textG.add(args.list.get(13))
        textG.add(args.list.get(14))
        textG.add(args.list.get(15))
        textG.add(args.list.get(16))
        textG.add(args.list.get(17))

        textG.add(args.list.get(0))
        textG.add(args.list.get(1))
        textG.add(args.list.get(2))
        textG.add(args.list.get(3))
        textG.add(args.list.get(4))
        textG.add(args.list.get(5))
        textG.add(args.list.get(6))
        textG.add(args.list.get(7))
        textG.add(args.list.get(8))
        textG.add(args.list.get(9))
        textG.add(args.list.get(10))
        textG.add(args.list.get(11))
        textG.add(args.list.get(12))
        textG.add(args.list.get(13))
        textG.add(args.list.get(14))
        textG.add(args.list.get(15))
        textG.add(args.list.get(16))
        textG.add(args.list.get(17))

        textG = ramdommCollections(textG.toTypedArray()).toMutableList()

        binding.TVslot1.text = textG[0]
        binding.TVslot2.text = textG[1]
        binding.TVslot3.text = textG[2]
        binding.TVslot4.text = textG[3]
        binding.TVslot5.text = textG[5]
        binding.TVslot6.text = textG[12]
        binding.TVslot7.text = textG[6]
        binding.TVslot8.text = textG[7]
        binding.TVslot9.text = textG[8]
        binding.TVslot10.text = textG[9]
        binding.TVslot11.text = textG[10]
        binding.TVslot12.text = textG[11]
        binding.TVslot13.text = textG[13]
        binding.TVslot14.text = textG[15]
        binding.TVslot15.text = textG[14]
        binding.TVslot16.text = textG[16]
        binding.TVslot17.text = textG[4]
        binding.TVslot18.text = textG[17]
        binding.TVslot19.text = textG[18]
        binding.TVslot20.text = textG[19]
        binding.TVslot21.text = textG[20]
        binding.TVslot222.text = textG[21]
        binding.TVslot23.text = textG[22]
        binding.TVslot24.text = textG[23]
        binding.TVslot25.text = textG[24]
        binding.TVslot26.text = textG[25]
        binding.TVslot27.text = textG[26]
        binding.TVslot28.text = textG[27]
        binding.TVslot29.text = textG[28]
        binding.TVslot30.text = textG[29]
        binding.TVslot31.text = textG[30]
        binding.TVslot32.text = textG[31]
        binding.TVslot333.text = textG[32]
        binding.TVslot34.text = textG[33]
        binding.TVslot35.text = textG[34]
        binding.TVslot36.text = textG[35]
        init()
        anim.init(requireContext())

        Handler(Looper.getMainLooper()).postDelayed({
            timer.start()
        },3000)


        indexFragment = 2
        indexGo = 1
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    private fun init() {

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
            val animator16 =
                ObjectAnimator.ofFloat(binding.TVslot17, View.SCALE_Y, 0F);animator16.duration =
            200;animator16.start()
            val animator17 =
                ObjectAnimator.ofFloat(binding.TVslot18, View.SCALE_Y, 0F);animator17.duration =
            200;animator17.start()
            val animator18 =
                ObjectAnimator.ofFloat(binding.TVslot19, View.SCALE_Y, 0F);animator18.duration =
            200;animator18.start()
            val animator19 =
                ObjectAnimator.ofFloat(binding.TVslot20, View.SCALE_Y, 0F);animator19.duration =
            200;animator19.start()
            val animator20 =
                ObjectAnimator.ofFloat(binding.TVslot21, View.SCALE_Y, 0F);animator20.duration =
            200;animator20.start()
            val animator21 =
                ObjectAnimator.ofFloat(binding.TVslot222, View.SCALE_Y, 0F);animator21.duration =
            200;animator21.start()
            val animator22 =
                ObjectAnimator.ofFloat(binding.TVslot23, View.SCALE_Y, 0F);animator22.duration =
            200;animator22.start()
            val animator23 =
                ObjectAnimator.ofFloat(binding.TVslot24, View.SCALE_Y, 0F);animator23.duration =
            200;animator23.start()
            val animator24 =
                ObjectAnimator.ofFloat(binding.TVslot25, View.SCALE_Y, 0F);animator24.duration =
            200;animator24.start()
            val animator25 =
                ObjectAnimator.ofFloat(binding.TVslot26, View.SCALE_Y, 0F);animator25.duration =
            200;animator25.start()
            val animator26 =
                ObjectAnimator.ofFloat(binding.TVslot27, View.SCALE_Y, 0F);animator26.duration =
            200;animator26.start()
            val animator27 =
                ObjectAnimator.ofFloat(binding.TVslot28, View.SCALE_Y, 0F);animator27.duration =
            200;animator27.start()
            val animator28 =
                ObjectAnimator.ofFloat(binding.TVslot29, View.SCALE_Y, 0F);animator28.duration =
            200;animator28.start()
            val animator29 =
                ObjectAnimator.ofFloat(binding.TVslot30, View.SCALE_Y, 0F);animator29.duration =
            200;animator29.start()
            val animator30 =
                ObjectAnimator.ofFloat(binding.TVslot31, View.SCALE_Y, 0F);animator30.duration =
            200;animator30.start()
            val animator31 =
                ObjectAnimator.ofFloat(binding.TVslot32, View.SCALE_Y, 0F);animator31.duration =
            200;animator31.start()
            val animator32 =
                ObjectAnimator.ofFloat(binding.TVslot333, View.SCALE_Y, 0F);animator32.duration =
            200;animator32.start()
            val animator33 =
                ObjectAnimator.ofFloat(binding.TVslot34, View.SCALE_Y, 0F);animator33.duration =
            200;animator33.start()
            val animator34 =
                ObjectAnimator.ofFloat(binding.TVslot35, View.SCALE_Y, 0F);animator34.duration =
            200;animator34.start()
            val animator35 =
                ObjectAnimator.ofFloat(binding.TVslot36, View.SCALE_Y, 0F);animator35.duration =
            200;animator35.start()
        }, 3000)

        Handler(Looper.getMainLooper()).postDelayed({
            val animator0 =
                ObjectAnimator.ofFloat(binding.TVslot111, View.SCALE_Y, 1F);animator0.duration =
            200;animator0.start()
            val animator1 =
                ObjectAnimator.ofFloat(binding.TVslot22, View.SCALE_Y, 1F);animator1.duration =
            200;animator1.start()
            val animator2 =
                ObjectAnimator.ofFloat(binding.TVslot33, View.SCALE_Y, 1F);animator2.duration =
            200;animator2.start()
            val animator3 =
                ObjectAnimator.ofFloat(binding.TVslot44, View.SCALE_Y, 1F);animator3.duration =
            200;animator3.start()
            val animator4 =
                ObjectAnimator.ofFloat(binding.TVslot55, View.SCALE_Y, 1F);animator4.duration =
            200;animator4.start()
            val animator5 =
                ObjectAnimator.ofFloat(binding.TVslot66, View.SCALE_Y, 1F);animator5.duration =
            200;animator5.start()
            val animator6 =
                ObjectAnimator.ofFloat(binding.TVslot77, View.SCALE_Y, 1F);animator6.duration =
            200;animator6.start()
            val animator7 =
                ObjectAnimator.ofFloat(binding.TVslot88, View.SCALE_Y, 1F);animator7.duration =
            200;animator7.start()
            val animator8 =
                ObjectAnimator.ofFloat(binding.TVslot99, View.SCALE_Y, 1F);animator8.duration =
            200;animator8.start()
            val animator9 =
                ObjectAnimator.ofFloat(binding.TVslot1010, View.SCALE_Y, 1F);animator9.duration =
            200;animator9.start()
            val animator10 =
                ObjectAnimator.ofFloat(binding.TVslot1111, View.SCALE_Y, 1F);animator10.duration =
            200;animator10.start()
            val animator11 =
                ObjectAnimator.ofFloat(binding.TVslot1212, View.SCALE_Y, 1F);animator11.duration =
            200;animator11.start()
            val animator12 =
                ObjectAnimator.ofFloat(binding.TVslot1313, View.SCALE_Y, 1F);animator12.duration =
            200;animator12.start()
            val animator13 =
                ObjectAnimator.ofFloat(binding.TVslot1414, View.SCALE_Y, 1F);animator13.duration =
            200;animator13.start()
            val animator14 =
                ObjectAnimator.ofFloat(binding.TVslot1515, View.SCALE_Y, 1F);animator14.duration =
            200;animator14.start()
            val animator15 =
                ObjectAnimator.ofFloat(binding.TVslot1616, View.SCALE_Y, 1F);animator15.duration =
            200;animator15.start()
            val animator16 =
                ObjectAnimator.ofFloat(binding.TVslot1717, View.SCALE_Y, 1F);animator16.duration =
            200;animator16.start()
            val animator17 =
                ObjectAnimator.ofFloat(binding.TVslot1818, View.SCALE_Y, 1F);animator17.duration =
            200;animator17.start()
            val animator18 =
                ObjectAnimator.ofFloat(binding.TVslot1919, View.SCALE_Y, 1F);animator18.duration =
            200;animator18.start()
            val animator19 =
                ObjectAnimator.ofFloat(binding.TVslot2020, View.SCALE_Y, 1F);animator19.duration =
            200;animator19.start()
            val animator20 =
                ObjectAnimator.ofFloat(binding.TVslot2121, View.SCALE_Y, 1F);animator20.duration =
            200;animator20.start()
            val animator21 =
                ObjectAnimator.ofFloat(binding.TVslot2222, View.SCALE_Y, 1F);animator21.duration =
            200;animator21.start()
            val animator22 =
                ObjectAnimator.ofFloat(binding.TVslot2323, View.SCALE_Y, 1F);animator22.duration =
            200;animator22.start()
            val animator23 =
                ObjectAnimator.ofFloat(binding.TVslot2424, View.SCALE_Y, 1F);animator23.duration =
            200;animator23.start()
            val animator24 =
                ObjectAnimator.ofFloat(binding.TVslot2525, View.SCALE_Y, 1F);animator24.duration =
            200;animator24.start()
            val animator25 =
                ObjectAnimator.ofFloat(binding.TVslot2626, View.SCALE_Y, 1F);animator25.duration =
            200;animator25.start()
            val animator26 =
                ObjectAnimator.ofFloat(binding.TVslot2727, View.SCALE_Y, 1F);animator26.duration =
            200;animator26.start()
            val animator27 =
                ObjectAnimator.ofFloat(binding.TVslot2828, View.SCALE_Y, 1F);animator27.duration =
            200;animator27.start()
            val animator28 =
                ObjectAnimator.ofFloat(binding.TVslot2929, View.SCALE_Y, 1F);animator28.duration =
            200;animator28.start()
            val animator29 =
                ObjectAnimator.ofFloat(binding.TVslot3030, View.SCALE_Y, 1F);animator29.duration =
            200;animator29.start()
            val animator30 =
                ObjectAnimator.ofFloat(binding.TVslot3131, View.SCALE_Y, 1F);animator30.duration =
            200;animator30.start()
            val animator31 =
                ObjectAnimator.ofFloat(binding.TVslot3232, View.SCALE_Y, 1F);animator31.duration =
            200;animator31.start()
            val animator32 =
                ObjectAnimator.ofFloat(binding.TVslot3333, View.SCALE_Y, 1F);animator32.duration =
            200;animator32.start()
            val animator33 =
                ObjectAnimator.ofFloat(binding.TVslot3434, View.SCALE_Y, 1F);animator33.duration =
            200;animator33.start()
            val animator34 =
                ObjectAnimator.ofFloat(binding.TVslot3535, View.SCALE_Y, 1F);animator34.duration =
            200;animator34.start()
            val animator35 =
                ObjectAnimator.ofFloat(binding.TVslot3636, View.SCALE_Y, 1F);animator35.duration =
            200;animator35.start()
        }, 3200)



        binding.TVslot111.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot1,
                binding.TVslot111,
                18
            )
        }
        binding.TVslot22.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot2,
                binding.TVslot22,
                18
            )
        }
        binding.TVslot33.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot3,
                binding.TVslot33,
                18
            )
        }
        binding.TVslot44.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot4,
                binding.TVslot44,
                18
            )
        }
        binding.TVslot55.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot5,
                binding.TVslot55,
                18
            )
        }
        binding.TVslot66.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot6,
                binding.TVslot66,
                18
            )
        }
        binding.TVslot77.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot7,
                binding.TVslot77,
                18
            )
        }
        binding.TVslot88.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot8,
                binding.TVslot88,
                18
            )
        }
        binding.TVslot99.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot9,
                binding.TVslot99,
                18
            )
        }
        binding.TVslot1010.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot10,
                binding.TVslot1010,
                18
            )
        }
        binding.TVslot1111.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot11,
                binding.TVslot1111,
                18
            )
        }
        binding.TVslot1212.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot12,
                binding.TVslot1212,
                18
            )
        }
        binding.TVslot1313.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot13,
                binding.TVslot1313,
                18
            )
        }
        binding.TVslot1414.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot14,
                binding.TVslot1414,
                18
            )
        }
        binding.TVslot1515.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot15,
                binding.TVslot1515,
                18
            )
        }
        binding.TVslot1616.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot16,
                binding.TVslot1616,
                18
            )
        }
        binding.TVslot1717.setOnClickListener {
            anim. erhfieeee(
                binding.TVslot17,
                binding.TVslot1717,
                18
            )
        }
        binding.TVslot1818.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot18,
                binding.TVslot1818,
                18
            )
        }
        binding.TVslot1919.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot19,
                binding.TVslot1919,
                18
            )
        }
        binding.TVslot2020.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot20,
                binding.TVslot2020,
                18
            )
        }
        binding.TVslot2121.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot21,
                binding.TVslot2121,
                18
            )
        }
        binding.TVslot2222.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot222,
                binding.TVslot2222,
                18
            )
        }
        binding.TVslot2323.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot23,
                binding.TVslot2323,
                18
            )
        }
        binding.TVslot2424.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot24,
                binding.TVslot2424,
                18
            )
        }
        binding.TVslot2525.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot25,
                binding.TVslot2525,
                18
            )
        }
        binding.TVslot2626.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot26,
                binding.TVslot2626,
                18
            )
        }
        binding.TVslot2727.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot27,
                binding.TVslot2727,
                18
            )
        }
        binding.TVslot2828.setOnClickListener {
            anim. erhfieeee(
                binding.TVslot28,
                binding.TVslot2828,
                18
            )
        }
        binding.TVslot2929.setOnClickListener {
            anim. erhfieeee(
                binding.TVslot29,
                binding.TVslot2929,
                18
            )
        }
        binding.TVslot3030.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot30,
                binding.TVslot3030,
                18
            )
        }
        binding.TVslot3131.setOnClickListener {
            anim. erhfieeee(
                binding.TVslot31,
                binding.TVslot3131,
                18
            )
        }
        binding.TVslot3232.setOnClickListener {
            anim. erhfieeee(
                binding.TVslot32,
                binding.TVslot3232,
                18
            )
        }
        binding.TVslot3333.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot333,
                binding.TVslot3333,
                18
            )
        }
        binding.TVslot3434.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot34,
                binding.TVslot3434,
                18
            )
        }
        binding.TVslot3535.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot35,
                binding.TVslot3535,
                18
            )
        }
        binding.TVslot3636.setOnClickListener {
            anim.erhfieeee(
                binding.TVslot36,
                binding.TVslot3636,
                18
            )
        }
    }




    }
