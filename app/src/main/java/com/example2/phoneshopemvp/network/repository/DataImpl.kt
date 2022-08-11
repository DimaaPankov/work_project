package com.example2.phoneshopemvp.network.repository

import com.example2.phoneshopemvp.network.models.JsonData
import com.example2.phoneshopemvp.network.service.retrofitApi.retrofitService
import kotlinx.coroutines.*



object DataImpl: DataApi {
    private var data: JsonData? = null


    override suspend fun <JsonData> getData():JsonData {
        coroutineScope{
            launch {
                try {
                    data = retrofitService.getPhotos()
                } catch (e: Exception) { }
            }
        }
        return data!! as JsonData
    }


}