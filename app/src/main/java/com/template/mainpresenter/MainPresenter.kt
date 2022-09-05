package com.template.mainpresenter

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



}