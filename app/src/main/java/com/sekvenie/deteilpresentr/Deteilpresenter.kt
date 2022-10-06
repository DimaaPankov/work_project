package com.sekvenie.deteilpresentr

import androidx.lifecycle.ViewModel
import com.sekvenie.model.network.service.Data

class Deteilpresenter: ViewModel() {
    private var view:DeteilViewApi? = null
    private var chooseFilm: Data? = null

    companion object{
        private var presenter: Deteilpresenter? = null

        fun getInstance(): Deteilpresenter{
            if(presenter == null) {
                presenter = Deteilpresenter()
                return presenter as Deteilpresenter
            }
            else {
                return presenter as Deteilpresenter
            }
        }
    }

    fun getChooseFilm() = chooseFilm

    fun setChooseFilm(data: Data){
        chooseFilm = data
    }

    fun init(_view: DeteilViewApi){
        view = _view
        view?.showDeteil()
    }
    fun destroy(){
        view = null
    }


}