package com.sekvenie.model.network.dataimpl

import com.sekvenie.model.network.service.DataEvent
import com.sekvenie.mainpresemter.DataApi
import com.sekvenie.model.network.service.Data
import com.sekvenie.R


object DataImpl : DataApi<Data> {
    override var data = listOf(
        Data(R.drawable.logo_10,R.string.d1_01_11,DataEvent.ONE,R.string.place_1,R.string.price_1,R.string.description_1),
        Data(R.drawable.logo_14,R.string.d2_01_11,DataEvent.ONE,R.string.place_2,R.string.price_2,R.string.description_2),
        Data(R.drawable.logo_10,R.string.d3_01_11,DataEvent.ONE,R.string.place_3,R.string.price_3,R.string.description_3),
        Data(R.drawable.logo_20,R.string.d4_02_11,DataEvent.TWO,R.string.place_4,R.string.price_4,R.string.description_4),
        Data(R.drawable.logo_10,R.string.d5_02_11,DataEvent.TWO,R.string.place_5,R.string.price_5,R.string.description_5),
        Data(R.drawable.logo_22,R.string.d6_03_11,DataEvent.THREE,R.string.place_6,R.string.price_6,R.string.description_6),
        Data(R.drawable.logo_18,R.string.d7_03_11,DataEvent.THREE,R.string.place_7,R.string.price_7,R.string.description_7),
        Data(R.drawable.logo_10,R.string.d8_03_11,DataEvent.THREE,R.string.place_8,R.string.price_8,R.string.description_8),
        Data(R.drawable.logo_24,R.string.d9_04_11,DataEvent.FOURE,R.string.place_9,R.string.price_9,R.string.description_9),
        Data(R.drawable.logo_10,R.string.d9_04_11,DataEvent.FOURE,R.string.place_10,R.string.price_10,R.string.description_10),
        Data(R.drawable.logo_24,R.string.d10_04_11,DataEvent.FOURE,R.string.place_11,R.string.price_11,R.string.description_11),
        Data(R.drawable.logo_19,R.string.d11_04_11,DataEvent.FOURE,R.string.place_12,R.string.price_12,R.string.description_12),
        Data(R.drawable.logo_14,R.string.d12_04_11,DataEvent.FOURE,R.string.place_13,R.string.price_13,R.string.description_13),
        Data(R.drawable.logo_24,R.string.d13_05_11,DataEvent.FIVE,R.string.place_14,R.string.price_14,R.string.description_14),
        Data(R.drawable.logo_24,R.string.d14_06_11,DataEvent.SIX,R.string.place_15,R.string.price_15,R.string.description_15),
        Data(R.drawable.logo_10,R.string.d15_07_11,DataEvent.SEVEN,R.string.place_16,R.string.price_16,R.string.description_16),
        Data(R.drawable.logo_18,R.string.d16_07_11,DataEvent.SEVEN,R.string.place_17,R.string.price_17,R.string.description_17),
        Data(R.drawable.logo_19,R.string.d17_08_11,DataEvent.EIGHT,R.string.place_18,R.string.price_18,R.string.description_18),
        Data(R.drawable.logo_20,R.string.d18_09_11,DataEvent.NINE,R.string.place_19,R.string.price_19,R.string.description_19),
        Data(R.drawable.logo_19,R.string.d19_09_11,DataEvent.NINE,R.string.place_20,R.string.price_20,R.string.description_2),
        Data(R.drawable.logo_22,R.string.d20_10_11,DataEvent.TEN,R.string.place_21,R.string.price_21,R.string.description_21),
        Data(R.drawable.logo_20,R.string.d21_10_11,DataEvent.TEN,R.string.place_22,R.string.price_22,R.string.description_22),
        Data(R.drawable.logo_24,R.string.d22_10_11,DataEvent.TEN,R.string.place_23,R.string.price_23,R.string.description_23),
        Data(R.drawable.logo_24,R.string.d23_10_11,DataEvent.TEN,R.string.place_24,R.string.price_24,R.string.description_23),

        )

}