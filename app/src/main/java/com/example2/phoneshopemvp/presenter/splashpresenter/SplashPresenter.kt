package com.example2.phoneshopemvp.presenter.splashpresenter

class SplashPresenter {
                         private var view: SplashViewApi? = null
    fun init(_view: SplashViewApi){
        view = _view
    }
    fun destroy(){
        view = null
    }

    fun motion(){
        view?.startMotion()
}}