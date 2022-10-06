package com.sekvenie.view

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.sekvenie.jdshjlgdsl.eqohsgoids
import com.sekvenie.jkdbsjkfb.egiokr
import com.sekvenie.jkdbsjkfb.wrikghoi
import com.sekvenie.model.dksghdlslk.jkdbfkj.iwtkhd
import com.sekvenie.model.dksghdlslk.klfslks.egkhds
import com.sekvenie.R
import com.sekvenie.databinding.ButtonItemBinding
import com.sekvenie.databinding.FragmentMainBinding


class MainFragment : Fragment(), wrikghoi {

    private val djkfj by lazy { egiokr(iwtkhd)}
    private val kldhkd: FragmentMainBinding by lazy {
        FragmentMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        djkfj.dkhsg(this)
        kldhkd.options.visibility = View.INVISIBLE
        kldhkd.Btitle.setOnClickListener{
            if(kldhkd.options.visibility == View.INVISIBLE){
                kldhkd.options.visibility = View.VISIBLE
            } else {
                kldhkd.options.visibility = View.INVISIBLE
            }
        }
        }

    override fun eifkhdl(date: List<egkhds>) {
        kldhkd.recyclerView.adapter = eqohsgoids { djkfj.adgik() }
            .apply {
                clearList()
                setList(date)
            }
    }

    override fun idskh(categories: Set<String>) {
        val dishgl = kldhkd.constraintLayout
        val jdbgjkds = kldhkd.options
        var selectedButton: View? = null
        categories.forEach{ text ->
            val djsjdsdkhg = ButtonItemBinding.inflate(layoutInflater)
            djsjdsdkhg.buttonItem.text = text
            dishgl.addView(djsjdsdkhg.root)
            djsjdsdkhg.buttonItem.setOnClickListener{
                selectedButton?.setBackgroundColor(resources.getColor(R.color.black))
                if (selectedButton != it) {
                    selectedButton = it
                    it.setBackgroundColor(resources.getColor(R.color.orange))
                    djkfj.eidgkhdil(text)
                    eifkhdl(djkfj.fikhl())
                } else{
                    selectedButton = null
                    val mainList = djkfj.ejpigf()
                    if(!mainList.isNullOrEmpty()){
                        eifkhdl(mainList)
                    }
                }
                jdbgjkds.visibility = View.INVISIBLE
            }
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return kldhkd.root
    }

    override fun onDestroy() {
        super.onDestroy()
        djkfj.eofhe()
    }

}