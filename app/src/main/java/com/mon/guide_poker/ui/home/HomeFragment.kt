package com.mon.guide_poker.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment

import com.mon.guide_poker.efjciwehf
import com.mon.guide_poker.Main2Activity
import com.mon.guide_poker.R
import com.mon.guide_poker.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
      binding.IV1.setOnClickListener {
        efjciwehf = 1
          (requireContext() as Main2Activity).rjrvjwefcw.navigate(R.id.action_nav_home_to_nav_slideshow)
          (requireContext() as Main2Activity).rhig.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
          (requireContext() as Main2Activity).rhig.appBarMain2.toolbar.isVisible = false
      }

    binding.IV2.setOnClickListener {
        efjciwehf = 2
        (requireContext() as Main2Activity).rjrvjwefcw.navigate(R.id.action_nav_home_to_nav_slideshow)
        (requireContext() as Main2Activity).rhig.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
        (requireContext() as Main2Activity).rhig.appBarMain2.toolbar.isVisible = false
    }
        binding.IV3.setOnClickListener {
            efjciwehf = 3
            (requireContext() as Main2Activity).rjrvjwefcw.navigate(R.id.action_nav_home_to_nav_slideshow)
            (requireContext() as Main2Activity).rhig.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
            (requireContext() as Main2Activity).rhig.appBarMain2.toolbar.isVisible = false
        }
        binding.IV4.setOnClickListener {
            efjciwehf = 4
            (requireContext() as Main2Activity).rjrvjwefcw.navigate(R.id.action_nav_home_to_nav_slideshow)
            (requireContext() as Main2Activity).rhig.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
            (requireContext() as Main2Activity).rhig.appBarMain2.toolbar.isVisible = false
        }
        binding.IV5.setOnClickListener {
            efjciwehf = 5
            (requireContext() as Main2Activity).rjrvjwefcw.navigate(R.id.action_nav_home_to_nav_slideshow)
            (requireContext() as Main2Activity).rhig.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
            (requireContext() as Main2Activity).rhig.appBarMain2.toolbar.isVisible = false
        }
        binding.IV6.setOnClickListener {
            efjciwehf = 6
            (requireContext() as Main2Activity).rjrvjwefcw.navigate(R.id.action_nav_home_to_nav_slideshow)
            (requireContext() as Main2Activity).rhig.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
            (requireContext() as Main2Activity).rhig.appBarMain2.toolbar.isVisible = false
        }
        binding.IV7.setOnClickListener {
            efjciwehf = 7
            (requireContext() as Main2Activity).rjrvjwefcw.navigate(R.id.action_nav_home_to_nav_slideshow)
            (requireContext() as Main2Activity).rhig.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
            (requireContext() as Main2Activity).rhig.appBarMain2.toolbar.isVisible = false
        }
        binding.IV8.setOnClickListener {
            efjciwehf = 8
            (requireContext() as Main2Activity).rjrvjwefcw.navigate(R.id.action_nav_home_to_nav_slideshow)
            (requireContext() as Main2Activity).rhig.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
            (requireContext() as Main2Activity).rhig.appBarMain2.toolbar.isVisible = false
        }




        return binding.root
    }

}