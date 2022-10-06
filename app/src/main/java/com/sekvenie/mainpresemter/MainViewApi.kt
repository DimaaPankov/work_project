package com.sekvenie.mainpresemter
import com.sekvenie.model.network.service.Data

interface MainViewApi {

    fun showFilms(films: List<Data>)

    fun showCategory(categories: Set<String>)

}