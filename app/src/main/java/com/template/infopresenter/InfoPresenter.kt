package com.template.infopresenter

import com.template.mainpresenter.MainViewApi

class InfoPresenter {
    private var context: InfoViewApi? = null
    fun init(_view: InfoViewApi){
        context = _view
        context!!.clickOk()
    }

    fun distroy(){
        context = null
    }
}