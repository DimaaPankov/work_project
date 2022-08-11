package com.example2.phoneshopemvp.network.models

import com.google.gson.annotations.SerializedName

data class JsonData(
    @SerializedName("best_seller")
    val bestSeller: List<BestSeller>,
    val home_store: List<HomeStore>
)