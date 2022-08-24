package com.example2.wallpapercars.view

import android.app.WallpaperManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example2.wallpapercars.MainActivity
import com.example2.wallpapercars.R
import com.example2.wallpapercars.databinding.FragmentDeteilBinding

class DeteilFragment : Fragment() {
    private val args: DeteilFragmentArgs by navArgs()
    val binding by lazy {FragmentDeteilBinding.inflate(layoutInflater)}
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)

         binding.imageView3.setImageResource(args.img)

         MainActivity.goBack =
             {
                 findNavController().navigate(
                     DeteilFragmentDirections
                         .actionDeteilFragmentToMainFragment()
                 )
             }


         binding.bSet.setOnClickListener {
             Toast.makeText(
                 getActivity(), "обои установлены",
                 Toast.LENGTH_LONG
             ).show()
             WallpaperManager.getInstance(this.context).setResource(args.img)

             AppCompatActivity().onBackPressed()
         }
     }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }


}