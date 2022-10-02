package com.template.presenter.NewCoinsPresenter

import android.content.Context
import com.template.presenter.mainpresenter.DataApi

class NewCoinsPresenter (val data: DataApi) {

    private var context: NewCoinsViewApi? = null
    fun init(_view: NewCoinsViewApi?){
        context = _view
        context!!.clickNewCoins()
    }
    fun setMainCount(context: Context){
        data.setMainCount(1000)
    }



    fun distroy(){
        context = null

    }



}