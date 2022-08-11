package com.example2.phoneshopemvp.network.repository



interface DataApi {
     suspend fun <T> getData():T
}