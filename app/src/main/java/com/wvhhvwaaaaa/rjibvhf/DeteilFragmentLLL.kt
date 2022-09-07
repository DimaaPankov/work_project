package com.wvhhvwaaaaa.rjibvhf

import android.app.WallpaperManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.wvhhvwaaaaa.databinding.FragmentDeteiiiBinding


class DeteilFragmentLLL : Fragment() {
    private val args: DeteilFragmentLLLArgs by navArgs()
    val gvuevg by lazy { FragmentDeteiiiBinding.inflate(layoutInflater)}
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)

         gvuevg.imageView3.setImageResource(args.img)
         gvuevg.textView.text = "$"+args.buy
         MainActivity.eueububeo =
             {
                 findNavController().navigate(
                     DeteilFragmentLLLDirections.actionDeteilFragmentToShopFragment()
                 )
             }

         gvuevg.bSet.setOnClickListener {
             if(euwvby.webghwireb() >= args.buy){
             Toast.makeText(
                 getActivity(), "set wallpaper",
                 Toast.LENGTH_LONG
             ).show()
             WallpaperManager.getInstance(this.context).setResource(args.img)
                 euwvby.ghwribg( args.buy, false)
         }else{
                 Toast.makeText(
                     getActivity(), "not enough money on the balance sheet",
                     Toast.LENGTH_LONG
                 ).show()
             }
             ewubvwerubipoerwb(requireContext()).eugbrub(euwvby.webghwireb())
     }
     }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return gvuevg.root
    }


}