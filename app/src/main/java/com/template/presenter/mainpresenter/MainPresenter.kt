package com.template.presenter.mainpresenter

import android.content.Context
import com.template.view.DataBasePreferences

class MainPresenter(val data: DataApi) {

    private var context: MainViewApi? = null
    fun init(_view: MainViewApi){
        context = _view
        context!!.clickInfo()
        context!!.clickPlay()
        context!!.showCoins()
    }
    fun getCoins() = data.getMainCount()



    fun distroy(){
        context = null

    }

    fun getBalansInDataBase(_context:Context) = DataBasePreferences(_context).getBalans()

}