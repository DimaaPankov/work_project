package com.example2.phoneshopemvp.network.repository

import com.example2.phoneshopemvp.R
import com.example2.phoneshopemvp.network.models.BestSeller
import com.example2.phoneshopemvp.network.models.HomeStore
import com.example2.phoneshopemvp.network.models.JsonData
import com.example2.phoneshopemvp.network.service.retrofitApi.retrofitService
import kotlinx.coroutines.*



object DataImpl: DataApi {

     private val data = JsonData(listOf<BestSeller>(
        BestSeller(4999,1,true, R.drawable.i111,6599,"poker suitcase"),
        BestSeller(399,1,true, R.drawable.i222,499,"cup"),
        BestSeller(15999,1,true, R.drawable.i333,8999,"poker table"),
        BestSeller(399,1,true, R.drawable.i444,499,"cards"),
        ),


        listOf<HomeStore>(
        HomeStore(1,true,true,R.drawable.i777,"foure chips",499),
            HomeStore(1,true,true,R.drawable.i888,"poker set",6999),
            HomeStore(1,true,true,R.drawable.i10101,"chips set",1599),
            ))

    override fun <JsonData> getData():JsonData {
        return data!! as JsonData
    }


}