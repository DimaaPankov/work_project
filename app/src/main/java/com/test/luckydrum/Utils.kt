package com.test.luckydrum

import kotlinx.coroutines.*


var indexFragment = 0
var text = mutableListOf<String>()
var indexGo = 0

object timer {
    var second = 0
    var  i = GlobalScope.async(Dispatchers.Main, start = CoroutineStart.LAZY) {
        while (true) {
            delay(1000)
            second++
        }}

    fun start(){

i.start()

        }


    fun stop() {
        i.cancel()
        i = thing()
        second = 0
    }

    fun thing()= GlobalScope.async(Dispatchers.Main, start = CoroutineStart.LAZY) {
        while (true) {
            delay(1000)
            second++
        }}
}

fun ramdommCollections(list:Array<String>) : Array<String> {
    var index = 0
    var v = ""
    val _list = list

    for (l in 0.._list.size-1) {
        index = (0.._list.size-1).random()
        v = _list[l]
        _list[l] = _list[index]
        _list[index] = v
    }
    return _list
}




