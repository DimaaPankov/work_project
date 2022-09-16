package com.template.view

import android.app.WallpaperManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.template.databinding.FragmentDeteilBinding


class DeteilFragment : Fragment() {
    private val args: DeteilFragmentArgs by navArgs()
    val binding by lazy { FragmentDeteilBinding.inflate(layoutInflater)}
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)

         binding.imageView3.setImageResource(args.img)
         binding.textView.text = "$"+args.buy
         MainActivity.goBack =
             {
                 findNavController().navigate(
                     DeteilFragmentDirections.actionDeteilFragmentToShopFragment()
                 )
             }

         binding.bSet.setOnClickListener {
             if(Model.getMainCount() >= args.buy){
             Toast.makeText(
                 getActivity(), "set wallpaper",
                 Toast.LENGTH_LONG
             ).show()
             WallpaperManager.getInstance(this.context).setResource(args.img)
                 Model.setMainCount( args.buy, false)
         }else{
                 Toast.makeText(
                     getActivity(), "not enough money on the balance sheet",
                     Toast.LENGTH_LONG
                 ).show()
             }
             DataBasePreferences(requireContext()).setBalans(Model.getMainCount())
     }
     }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }


}