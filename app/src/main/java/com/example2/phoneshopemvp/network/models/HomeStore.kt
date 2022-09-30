package com.example2.phoneshopemvp.network.models

data class HomeStore(
    val id: Int,
    val is_buy: Boolean,
    val is_new: Boolean,
    val picture: Int,
    val title: String,
    val price : Int,
    )