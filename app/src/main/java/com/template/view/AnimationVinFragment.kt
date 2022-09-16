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
        binding.TVslot4.setImageResource(listSlots[3])
        binding.TVslot5.setImageResource(listSlots[4])
        binding.TVslot6.setImageResource(listSlots[5])
        binding.TVslot7.setImageResource(listSlots[6])
        binding.TVslot8.setImageResource(listSlots[7])
        binding.TVslot9.setImageResource(listSlots[8])
        binding.TVxxx.text = args.xBet.toString()+"X BET "
        binding.betCount.text = args.win.toString()
    }

    override fun startAnimation() {
        if(args.winLine[0]){
            presenter.animationVin( binding.TVslot1, binding.TVslot11, binding.TVslot2,
                binding.TVslot22, binding.TVslot3, binding.TVslot33,binding.VTopHorisontal,binding.betCount,
                binding.betCountSmile,binding.TVvin,binding.TVxxx
            )}
        if(args.winLine[1]){
            presenter.animationVin( binding.TVslot4, binding.TVslot44, binding.TVslot5,
                binding.TVslot55, binding.TVslot6, binding.TVslot66,binding.VCenterHorisontal,
                binding.betCount, binding.betCountSmile,binding.TVvin,binding.TVxxx)}
        if(args.winLine[2]){
            presenter.animationVin( binding.TVslot7, binding.TVslot77, binding.TVslot8,
                binding.TVslot88, binding.TVslot9, binding.TVslot99,binding.VBottomHorisontal,
                binding.betCount, binding.betCountSmile,binding.TVvin,binding.TVxxx)}


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



