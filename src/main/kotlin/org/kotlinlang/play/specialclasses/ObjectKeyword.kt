package org.kotlinlang.play.specialclasses

import kotlin.random.Random

class LuckDispatcher{

    fun getNumber(){
        var objRandom = Random
        println(objRandom.nextInt(90))
    }
}

fun main() {
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()
}

