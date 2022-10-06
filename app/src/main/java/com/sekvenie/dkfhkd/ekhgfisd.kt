package com.sekvenie.dkfhkd

import androidx.lifecycle.ViewModel
import com.sekvenie.model.dksghdlslk.klfslks.egkhds

class ekhgfisd: ViewModel() {
    private var skfgh:soljgfda? = null
    private var ohfkds: egkhds? = null

    companion object{
        private var ekgfhds: ekhgfisd? = null

        fun sogfkd(): ekhgfisd{
            if(ekgfhds == null) {
                ekgfhds = ekhgfisd()
                return ekgfhds as ekhgfisd
            }
            else {
                return ekgfhds as ekhgfisd
            }
        }
    }

    fun sokhfl() = ohfkds

    fun sofkhd(oskhf: egkhds){
        ohfkds = oskhf
    }

    fun hdsasa(_view: soljgfda){
        skfgh = _view
        skfgh?.osljgf()
    }
    fun destroy(){
        skfgh = null
    }


}