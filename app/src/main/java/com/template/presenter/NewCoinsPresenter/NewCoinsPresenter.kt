package com.template.presenter.NewCoinsPresenter

import com.template.presenter.mainpresenter.DataApi

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