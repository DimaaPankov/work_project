package com.template.presenter.NewCoinsPresenter

import android.content.Context
import com.template.model.DataApi
import com.template.view.DataBasePreferences

class NewCoinsPresenter (val data: DataApi) {

    private var context: NewCoinsViewApi? = null
    fun init(_view: NewCoinsViewApi?){
        context = _view
        context!!.clickNewCoins()
    }
    fun setMainCount(context: Context){
        data.setMainCount(1000)
    }

    fun setBalansInDataBase(_context:Context,count:Int){
       DataBasePreferences(_context).setBalans(count)
    }

    fun distroy(){
        context = null

    }



}