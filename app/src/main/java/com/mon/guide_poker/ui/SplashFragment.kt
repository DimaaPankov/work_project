package com.mon.guide_poker.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mon.guide_poker.Main2Activity
import com.mon.guide_poker.R

class SplashFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Handler(Looper.getMainLooper()).postDelayed({
            (requireContext() as Main2Activity).rjrvjwefcw.navigate(R.id.action_splashFragment_to_nav_home)

        },4000)
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

}