package com.mon.guide_poker.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.mon.guide_poker.*

import com.mon.guide_poker.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private lateinit var binding: FragmentSlideshowBinding



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        setContent()
        binding.Bhome.setOnClickListener {
            (requireContext() as Main2Activity).rjrvjwefcw.navigate(R.id.action_nav_slideshow_to_nav_home)
            (requireContext() as Main2Activity).rhig.drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
            (requireContext() as Main2Activity).rhig.appBarMain2.toolbar.isVisible = true
        }
        return binding.root
    }



    private fun setContent(){
        when(efjciwehf){
            1 -> {binding.IVZ.setImageResource(ejfjfeheheh[0].fueyfy)
                  binding.TVZ.setText(ejfjfeheheh[0].efue3)}
            2 -> {binding.IVZ.setImageResource(ejfjfeheheh[1].fueyfy)
                  binding.TVZ.setText(ejfjfeheheh[1].efue3)}
            3 -> {binding.IVZ.setImageResource(ejfjfeheheh[2].fueyfy)
                  binding.TVZ.setText(ejfjfeheheh[2].efue3)}
            4 -> {binding.IVZ.setImageResource(ejfjfeheheh[3].fueyfy)
                  binding.TVZ.setText(ejfjfeheheh[3].efue3)}
            5 -> {binding.IVZ.setImageResource(ejfjfeheheh[4].fueyfy)
                  binding.TVZ.setText(ejfjfeheheh[4].efue3)}
            6 -> {binding.IVZ.setImageResource(ejfjfeheheh[5].fueyfy)
                  binding.TVZ.setText(ejfjfeheheh[5].efue3)}
            7 -> {binding.IVZ.setImageResource(ejfjfeheheh[6].fueyfy)
                  binding.TVZ.setText(ejfjfeheheh[6].efue3)}
            8 -> {binding.IVZ.setImageResource(ejfjfeheheh[7].fueyfy)
                  binding.TVZ.setText(ejfjfeheheh[7].efue3)}

        }
    }
}