package com.template.NewCoinsPresenter

import com.template.mainpresenter.DataApi
import com.template.mainpresenter.MainViewApi

class NewCoinsPresenter (val data: DataApi) {

    private var context: NewCoinsViewApi? = null
    fun init(_view: NewCoinsViewApi?){
        context = _view
        context!!.clickNewCoins()
    }
    fun setMainCount(){
        data.setMainCount(1000)
    }



    fun distroy(){
        context = null

    }



}