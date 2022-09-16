package com.template.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.template.R
import com.template.adapter.AdapterLots
import com.template.databinding.FragmentShopBinding


class ShopFragment : Fragment() {


    val binding by lazy{ FragmentShopBinding.inflate(layoutInflater)}
    val _img = listOf(R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.foure,R.drawable.five,
        R.drawable.six,R.drawable.seven2,R.drawable.eight,R.drawable.nine)
    val buy = listOf(499,499,799,999,999,999,1999,1999,1999)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.RVmain.adapter = AdapterLots(object : AdapterLots.OnUserClickListener {
            override fun onClick(img: Int,buy:Int) {
                val directions = ShopFragmentDirections.actionShopFragmentToDeteilFragment(img,buy)
                findNavController().navigate(directions)
            }
        }, _img,buy)

       MainActivity.goBack = {findNavController().
        navigate(ShopFragmentDirections.actionShopFragmentToMainFragment())}

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }


}