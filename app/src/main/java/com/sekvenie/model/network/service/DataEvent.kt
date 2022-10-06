package com.sekvenie.model.network.service

enum class DataEvent(val data:String) {
    ONE("01.11"),TWO("02.11"),THREE("03.11"),FOURE("04.11"),FIVE("05.11"),
    SIX("06.11"),SEVEN("07.11"),EIGHT("08.11"),NINE("09.11"),TEN("10.11")
}

data class Data(
    val img:Int,
    val title:Int,
    val dataEvent: DataEvent,
    val place : Int,
    val price : Int,
    val description: Int
    )