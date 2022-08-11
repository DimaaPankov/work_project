package com.example2.phoneshopemvp.network.service


import com.example2.phoneshopemvp.network.models.JsonData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


private const val BASE_URL = "https://run.mocky.io/"

val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()


interface ApiService {

    @GET("v3/654bd15e-b121-49ba-a588-960956b15175")
    suspend fun getPhotos(): JsonData
}
object retrofitApi {
    val retrofitService: ApiService by lazy { retrofit.create(ApiService::class.java)}
}