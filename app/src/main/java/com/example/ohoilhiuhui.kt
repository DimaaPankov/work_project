package com.example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.databinding.FragmentInfoBinding



class ohoilhiuhui : Fragment(), di90weuvc9ewuc {
lateinit var vikoweovw: FragmentInfoBinding
 val vi9viv  = viw9wvuewev()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vikoweovw = FragmentInfoBinding.inflate(layoutInflater)
        vi9viv.wvi9weuvuj(this)
        }


    override fun evw0vie() {
        vikoweovw.domBok.setOnClickListener {
            (requireActivity() as MainActivity).navController.navigate(R.id
                .action_infoFragment_to_mainFragment)
    }
    }

    override fun onDestroy() {
        super.onDestroy()
        vi9viv.weci9ewciew()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return vikoweovw.root
    }
}

class viw9wvuewev {
    private var vwi9vwuv: di90weuvc9ewuc? = null
    fun wvi9weuvuj(_view: di90weuvc9ewuc){
        vwi9vwuv = _view
        vwi9vwuv!!.evw0vie()
    }

    fun weci9ewciew(){
        vwi9vwuv = null
    }
}

interface di90weuvc9ewuc {
    fun evw0vie()
}