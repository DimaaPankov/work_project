package com.example2.phoneshopemvp.network.models

data class BestSeller(
    val discount_price: Int,
    val id: Int,
    val is_favorites: Boolean,
    val picture:Int,
    val price_without_discount: Int,
    val title: String
)