package com.sekvenie.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.fragment.app.Fragment
import com.sekvenie.App
import com.sekvenie.R
import com.sekvenie.databinding.FragmentSplashBinding

import com.sekvenie.sklafknf.dlhfjsdhhf
import com.sekvenie.sklafknf.kldhlkds

class SplashFragment : Fragment(), kldhlkds {

    lateinit var jdbfj : FragmentSplashBinding
    private val jedkjf by lazy { dlhfjsdhhf() }


    override fun onCreate(savedInstanceState: Bundle?) {
        jdbfj = FragmentSplashBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        jedkjf.jhsdfjfd(this)
        jedkjf.motion()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return jdbfj.root
    }

    override fun onDestroy() {
        jedkjf.kleahf()
        super.onDestroy()
    }

    override fun jsfdgj(){
        jdbfj.motionLayout.addTransitionListener(object : MotionLayout.TransitionListener {
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
                App.dsisdjhv?.navigate(R.id.action_splashFragment_to_mainFragment)
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