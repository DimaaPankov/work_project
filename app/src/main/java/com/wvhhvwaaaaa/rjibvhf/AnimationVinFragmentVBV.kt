package com.wvhhvwaaaaa.rjibvhf

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.wvhhvwaaaaa.R
import com.wvhhvwaaaaa.fuevhgefui.FjjscsPresenter
import com.wvhhvwaaaaa.fuevhgefui.eivghwerivhj
import com.wvhhvwaaaaa.databinding.FragmentAnimationViniiiBinding

class AnimationVinFragmentVBV : Fragment(), eivghwerivhj {

    val ewgirub = FjjscsPresenter()
    private val ewugeub: AnimationVinFragmentVBVArgs by navArgs()
    lateinit var eigbue: FragmentAnimationViniiiBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        eigbue = FragmentAnimationViniiiBinding.inflate(layoutInflater)
        ewgirub.init(this)
}

   override fun wgjj(){
        val listSlots = ewugeub.arraySlots
        eigbue.TVslot1.setImageResource(listSlots[0])
        eigbue.TVslot2.setImageResource(listSlots[1])
        eigbue.TVslot3.setImageResource(listSlots[2])
        eigbue.TVslot4.setImageResource(listSlots[3])
        eigbue.TVslot5.setImageResource(listSlots[4])
        eigbue.TVslot6.setImageResource(listSlots[5])
        eigbue.TVslot7.setImageResource(listSlots[6])
        eigbue.TVslot8.setImageResource(listSlots[7])
        eigbue.TVslot9.setImageResource(listSlots[8])
        eigbue.TVxxx.text = ewugeub.xBet.toString()+"X BET "
        eigbue.betCount.text = ewugeub.win.toString()
    }

    override fun whgwhr() {
        if(ewugeub.winLine[0]){
            ewgirub.gvidsjv( eigbue.TVslot1, eigbue.TVslot11, eigbue.TVslot2,
                eigbue.TVslot22, eigbue.TVslot3, eigbue.TVslot33,eigbue.VTopHorisontal,eigbue.betCount,
                eigbue.betCountSmile,eigbue.TVvin,eigbue.TVxxx
            )}
        if(ewugeub.winLine[1]){
            ewgirub.gvidsjv( eigbue.TVslot4, eigbue.TVslot44, eigbue.TVslot5,
                eigbue.TVslot55, eigbue.TVslot6, eigbue.TVslot66,eigbue.VCenterHorisontal,
                eigbue.betCount, eigbue.betCountSmile,eigbue.TVvin,eigbue.TVxxx)}
        if(ewugeub.winLine[2]){
            ewgirub.gvidsjv( eigbue.TVslot7, eigbue.TVslot77, eigbue.TVslot8,
                eigbue.TVslot88, eigbue.TVslot9, eigbue.TVslot99,eigbue.VBottomHorisontal,
                eigbue.betCount, eigbue.betCountSmile,eigbue.TVvin,eigbue.TVxxx)}


        Handler(Looper.getMainLooper()).postDelayed({
            (requireActivity() as MainActivity).eubebueurb.navigate(
                R.id.action_animationVinFragment_to_gameFragment
            )
        }, 7000L)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return eigbue.root
    }

    override fun onDestroy() {
        super.onDestroy()
        ewgirub.distroy()
    }



}



