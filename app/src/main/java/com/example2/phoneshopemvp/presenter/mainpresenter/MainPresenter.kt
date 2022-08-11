package com.example2.phoneshopemvp.presenter.mainpresenter

import androidx.navigation.fragment.findNavController
import com.example2.phoneshopemvp.network.models.JsonData
import com.example2.phoneshopemvp.network.repository.DataApi

class MainPresenter(val model:DataApi) {
    var index  = 2
    var data:JsonData? = null
    private var context: MainViewApi? = null
    fun init(view:MainViewApi){
        context = view
        context?.setContent()
        context?.setClick()
    }
    fun distroy(){
        context = null
    }

    suspend fun setData(){data  =  model.getData<JsonData>()}

    fun setIndexHotSilers() =  if(index < 2) {
        ++index
    }else{
        index = 0
    }



}