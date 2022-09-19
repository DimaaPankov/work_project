package com.template.view

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.navArgs
import com.template.R
import com.template.animationpresenter.AnimationPresenter
import com.template.animationpresenter.AnimationViewApi
import com.template.databinding.FragmentAnimationVinBinding

class AnimationVinFragment : Fragment(), AnimationViewApi {

    val presenter = AnimationPresenter()
    private val args: AnimationVinFragmentArgs by navArgs()
    lateinit var binding: FragmentAnimationVinBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = FragmentAnimationVinBinding.inflate(layoutInflater)
        presenter.init(this)

    }





   override fun setData(){
        val listSlots = args.arraySlots
        binding.TVslot1.setImageResource(listSlots[0])
        binding.TVslot2.setImageResource(listSlots[1])
        binding.TVslot3.setImageResource(listSlots[2])
/**     binding.TVslot4.text = listSlots[3]
        binding.TVslot5.text = listSlots[4]
        binding.TVslot6.text = listSlots[5]
        binding.TVslot7.text = listSlots[6]
        binding.TVslot8.text = listSlots[7]
        binding.TVslot9.text = listSlots[8]**/
        binding.TVxxx.text = args.xBet.toString()+"X BET "
        binding.betCount.text = args.win.toString()
    }

    override fun startAnimation() {

            presenter.animationVin( binding.TVslot1, binding.TVslot11, binding.TVslot2,
                binding.TVslot22, binding.TVslot3, binding.TVslot33,binding.betCount,
                binding.betCountSmile,binding.TVvin,binding.TVxxx)




        Handler(Looper.getMainLooper()).postDelayed({
            (requireActivity() as MainActivity).navController.navigate(
                R.id.action_animationVinFragment_to_gameFragment
            )
        }, 7000L)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.distroy()
    }



}

//class AnimationVinFragment : Fragment() {
//
//    private val args: AnimationVinFragmentArgs by navArgs()
//    lateinit var binding: FragmentAnimationVinBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//
//        super.onCreate(savedInstanceState)
//        binding = FragmentAnimationVinBinding.inflate(layoutInflater)
//
//        val listSlots = args.arraySlots
//        binding.TVslot1.text = listSlots[0]
//        binding.TVslot2.text = listSlots[1]
//        binding.TVslot3.text = listSlots[2]
//        binding.TVslot4.text = listSlots[3]
//        binding.TVslot5.text = listSlots[4]
//        binding.TVslot6.text = listSlots[5]
//        binding.TVslot7.text = listSlots[6]
//        binding.TVslot8.text = listSlots[7]
//        binding.TVslot9.text = listSlots[8]
//
//        binding.TVxxx.text = args.xBet.toString()+"X BET "
//        binding.betCount.text = args.win.toString()
//        if(args.winLine[0]){
//        animationVin( binding.TVslot1, binding.TVslot11, binding.TVslot2,
//            binding.TVslot22, binding.TVslot3, binding.TVslot33,binding.VTopHorisontal)}
//        if(args.winLine[1]){
//            animationVin( binding.TVslot4, binding.TVslot44, binding.TVslot5,
//                binding.TVslot55, binding.TVslot6, binding.TVslot66,binding.VCenterHorisontal)}
//        if(args.winLine[2]){
//            animationVin( binding.TVslot7, binding.TVslot77, binding.TVslot8,
//                binding.TVslot88, binding.TVslot9, binding.TVslot99,binding.VBottomHorisontal)}
//
//
//                                     Handler(Looper.getMainLooper()).postDelayed({
//                                         (requireActivity() as MainActivity).navController.navigate(
//                                             R.id.action_animationVinFragment_to_gameFragment
//                                         )
//                                     }, 7000L)
//
//    }
//
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//
//        return binding.root
//    }
//
//
//    private fun animationVin(view1: TextView,view11: TextView, view2: TextView,view22: TextView,
//                             view3: TextView, view33: TextView, viewLine:View){
//
//
//
//
//            animationSlot(view11, view1)
//            animationSlot(view22, view2)
//            animationSlot(view33, view3)
//            animationLine(viewLine)
//
//
//
//    }
//
//    private fun animationSlot(view1: TextView,view2: TextView) {
//        var timer = 0L
//
//
//        animationSmile()
//
//        val animator111 = ObjectAnimator.ofFloat(view2, View.SCALE_X, 0.7F)
//        animator111.duration = 500
//        animator111.start()
//        val animator222 = ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.7F)
//        animator222.duration = 500
//        animator222.start()
//
//
//        Handler(Looper.getMainLooper()).postDelayed({
//
//
//    repeat(10){
//
//        Handler(Looper.getMainLooper()).postDelayed({
//        view1.scaleY = 0.7F
//        val animator1 = ObjectAnimator.ofFloat(view2, View.SCALE_X, 0F)
//        animator1.duration = 100
//        animator1.start()
//        }, timer)
//
//  Handler(Looper.getMainLooper()).postDelayed({
//      val animator2 = ObjectAnimator.ofFloat(view1, View.SCALE_X, 0.7F)
//      animator2.duration = 100
//      animator2.start()
//  }, timer+100)
//    Handler(Looper.getMainLooper()).postDelayed({
//  val animator11 = ObjectAnimator.ofFloat(view1, View.SCALE_X, 0F)
//  animator11.duration = 100
//  animator11.start()
//  }, timer+200)
//  Handler(Looper.getMainLooper()).postDelayed({
//      val animator22 = ObjectAnimator.ofFloat(view2, View.SCALE_X, 0.7F)
//      animator22.duration = 100
//      animator22.start()
//  }, timer+300)/**/
//   timer+=400
//}
//},500)
//}
//
// fun animationLine(viewLine:View){
//var visibility = true
//var timer = 0L
//
//       binding.betCount.setTextColor(ContextCompat.getColor(requireContext(), R.color.red))
//
//   repeat(25) {
//       timer = timer + 500
//
//       Handler(Looper.getMainLooper()).postDelayed({
//           if (visibility) {
//               viewLine.visibility = View.VISIBLE
//               binding.TVxxx.visibility = View.VISIBLE
//               visibility = false
//
//           } else {
//               viewLine.visibility = View.INVISIBLE
//               binding.TVxxx.visibility = View.INVISIBLE
//               visibility = true
//           }
//       }, timer)
//
//   }
//}
//
//private fun animationSmile(){
//var visibility = true
//var timer = 0L
//
//binding.betCount.setTextColor(ContextCompat.getColor(requireContext(), R.color.red))
//
//repeat(29) {
//   timer = timer + 500
//
//   Handler(Looper.getMainLooper()).postDelayed({
//       if (visibility) {
//           binding.betCountSmile.visibility = View.VISIBLE
//           binding.betCount.visibility = View.VISIBLE
//           binding.TVvin.visibility = View.VISIBLE
//
//           visibility = false
//       } else {
//           binding.betCountSmile.visibility = View.INVISIBLE
//           binding.betCount.visibility = View.INVISIBLE
//           binding.TVvin.visibility = View.INVISIBLE
//           visibility = true
//
//
//       }
//   }, timer)
//
//}
//}
//
//}


