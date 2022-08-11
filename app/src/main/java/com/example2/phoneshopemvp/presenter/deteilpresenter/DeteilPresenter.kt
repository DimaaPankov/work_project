package com.example2.phoneshopemvp.presenter.deteilpresenter

import com.example2.phoneshopemvp.presenter.mainpresenter.MainViewApi

class DeteilPresenter() {
    private var context: DeteilViewApi? = null
    fun init(view: DeteilViewApi) {
        context = view
        context?.setData()
        context?.setClick()
    }
}