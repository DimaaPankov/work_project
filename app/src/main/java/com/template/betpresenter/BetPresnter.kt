package com.template.betpresenter

import com.template.mainpresenter.DataApi
import com.template.mainpresenter.MainViewApi

class BetPresnter (val data: DataApi) {
    var countBet = ""
    private var context: BetViewApi? = null
    fun init(_view: BetViewApi) {
        context = _view
     //   data.setBet("")
        context!!.clickListner()

    }
    fun click0(){countBet+=0}
    fun click1(){countBet+=1}
    fun click2(){countBet+=2}
    fun click3(){countBet+=3}
    fun click4(){countBet+=4}
    fun click5(){countBet+=5}
    fun click6(){countBet+=6}
    fun click7(){countBet+=7}
    fun click8(){countBet+=8}
    fun click9(){countBet+=9}
    fun clickEquels(){data.setBet(countBet)}

    fun distroy() {
        context = null
    }
}