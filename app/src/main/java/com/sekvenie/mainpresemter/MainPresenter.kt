package com.sekvenie.mainpresemter

import androidx.lifecycle.ViewModel
import com.sekvenie.App
import com.sekvenie.model.network.service.Data
import com.sekvenie.model.network.service.DataEvent
import com.sekvenie.R


enum class ApiStatus{  LOADING,DONE,ERROR }

class MainPresenter(private val api: DataApi<Data>): ViewModel() {
    private var mainList: List<Data>? = null
    private var view: MainViewApi? = null
    private var sortedList: List<Data> = mutableListOf()
    private val categoryList = mutableSetOf<String>()

    private fun sortingFilmsFromABC(){
        mainList = mainList?.sortedWith(compareBy(Data::title))
    }

    fun getMainList() = mainList

    fun getSortedList() = sortedList

    private fun setCategory(){
        mainList?.forEach { data ->
                categoryList.add(data.dataEvent.data)
        }
    }

    fun init(view: MainViewApi) {
        this.view = view
        getFilms()
    }

    private fun getFilms() {
                    mainList = api.data
                    setCategory()
                    sortingFilmsFromABC()
                    view?.showFilms(mainList!!)
                    view?.showCategory(categoryList)


    }

    fun sortingFilmsFromCategory(chooseCategory: String?){
            val resultList = mutableListOf<Data>()
            mainList?.forEach { data ->
                    if(data.dataEvent.data == chooseCategory){
                        resultList.add(data)

                }
            }
            sortedList = resultList
    }

    fun destroy() {
        view = null
    }

    fun openFilm() {
        App.navController?.navigate(R.id.action_mainFragment_to_detailFragment)
    }

}