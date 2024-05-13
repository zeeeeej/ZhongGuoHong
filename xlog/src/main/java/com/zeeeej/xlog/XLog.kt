package com.zeeeej.xlog

import kotlin.random.Random

object XLog {

    fun i(tag: String, msg: String) {
        println("[${tag}]$msg")
    }


    fun msg(): String {
        return "msg:${Random.nextInt()}"
    }


}