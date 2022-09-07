package com.wvhhvwaaaaa.rjibvhf

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.wvhhvwaaaaa.R
import com.wvhhvwaaaaa.werihvh.AdapterLots
import com.wvhhvwaaaaa.databinding.FragmentShopiiiBinding


class ShopFragmentoo : Fragment() {


    val eubuer by lazy{ FragmentShopiiiBinding.inflate(layoutInflater)}
    val eiboeb = listOf(R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.foure,R.drawable.five,
        R.drawable.six,R.drawable.seven2,R.drawable.eight,R.drawable.nine)
    val egvie9bv = listOf(499,499,799,999,999,999,1999,1999,1999)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        eubuer.RVmain.adapter = AdapterLots(object : AdapterLots.OnUserClickListener {
            override fun onClick(img: Int,buy:Int) {
                val directions = ShopFragmentooDirections.actionShopFragmentToDeteilFragment(img,buy)
                findNavController().navigate(directions)
            }
        }, eiboeb,egvie9bv)

       MainActivity.eueububeo = {findNavController().
        navigate(ShopFragmentooDirections.actionShopFragmentToMainFragment())}

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return eubuer.root
    }


}