package com.example2.phoneshopemvp.view.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example2.phoneshopemvp.R
import com.example2.phoneshopemvp.databinding.FragmentSplashBinding


import com.example2.phoneshopemvp.presenter.splashpresenter.SplashPresenter
import com.example2.phoneshopemvp.presenter.splashpresenter.SplashViewApi

class SplashFragment : Fragment(), SplashViewApi {

    lateinit var binding : FragmentSplashBinding
    private val presenter by lazy { SplashPresenter() }


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentSplashBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        presenter.init(this)
        presenter.motion()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onDestroy() {
        presenter.destroy()
        super.onDestroy()
    }

    override fun startMotion(){
        binding.motionLayout.addTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {

            }

            override fun onTransitionChange(
                motionLayout: MotionLayout?,
                startId: Int,
                endId: Int,
                progress: Float
            ) {

            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                findNavController().navigate(R.id.action_splashFragment_to_mainFragment)
            }

            override fun onTransitionTrigger(
                motionLayout: MotionLayout?,
                triggerId: Int,
                positive: Boolean,
                progress: Float
            ) {
            }


        })
    }

}