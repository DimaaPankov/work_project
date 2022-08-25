package com.test.luckydrum

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter

import androidx.navigation.fragment.findNavController
import com.test.luckydrum.databinding.RvberuibviuervmainFragmentBinding

class RvberuibviuervMainFragment : Fragment() {

    lateinit var binding: RvberuibviuervmainFragmentBinding
    val contries = listOf("2x2","4x4","6x6")
    var positioni = 0


   private val listArgs:Array<String> = arrayOf(
       "✨","\uD83C\uDF40","\uD83D\uDD25","\uD83C\uDFB0","\uD83D\uDCB8","\uD83D\uDCB5","\uD83D\uDCB4",
       "\uD83D\uDCB6","\uD83D\uDCB7","\uD83D\uDD79","\uD83E\uDE99","\uD83D\uDCB0","\uD83D\uDCB3",
       "\uD83D\uDCA5","\uD83D\uDD25","\uD83D\uDC51","\uD83D\uDC54","\uD83E\uDD2F",
       "\uD83E\uDD29","\uD83E\uDD11")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RvberuibviuervmainFragmentBinding.inflate(layoutInflater)
         val adapter = ArrayAdapter(requireActivity(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,contries)
             adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item)
        val adapterTheme = ArrayAdapter(requireActivity(), androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
            listOf("\uD83D\uDC36 animals","\uD83C\uDF4F fruite","\uD83E\uDDF3 items"))
            adapterTheme.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item)
        indexGo = 0



        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                positioni = position
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }



        binding.spinner.adapter = adapter


        binding.Bplay.setOnClickListener {
            indexGo = 1

            if(positioni == 0){
                findNavController().navigate(RvberuibviuervMainFragmentDirections.actionMainFragmentToGameFragment(
                      ramdommCollections(listArgs)
                ))
            }else if(positioni == 1){
                findNavController().navigate(RvberuibviuervMainFragmentDirections.actionMainFragmentToGameFragment4x4(
                    ramdommCollections(listArgs)
                ))
            }else if(positioni == 2){

                findNavController().navigate(RvberuibviuervMainFragmentDirections.actionMainFragmentToGameFragment6x6(
                    ramdommCollections(listArgs)
                ))

            }
        }


    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }
}

