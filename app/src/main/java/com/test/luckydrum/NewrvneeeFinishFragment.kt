package com.test.luckydrum

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.test.luckydrum.databinding.NewrvneeefinishFragmentBinding


class NewrvneeeFinishFragment : Fragment() {
lateinit var binding: NewrvneeefinishFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     binding = NewrvneeefinishFragmentBinding.inflate(layoutInflater)
     indexGo = 2


        binding.button2.setOnClickListener {

            (requireContext() as MainActivity).navController.navigate(R.id.action_finishFragment_to_mainFragment)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.TVsecond.text = if(timer.second>60){
            (timer.second/60).toString() +"."+(timer.second % 60).toShort()+" min"

        }else{
            timer.second.toString()+" sec"
        }
        timer.stop()
       return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        timer.stop()
    }
    
}