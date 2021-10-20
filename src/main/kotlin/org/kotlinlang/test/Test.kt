package org.kotlinlang.test

    fun main() {

        val t1 =  "01"
        val t2 =  "02"
        val t3 =  "10"

      println("t1: ${t1.toInt()}")
      println("t2: ${t2.toInt()}")
      println("t3: ${t3.toInt()}")

        val aaa = "2021-10-11"
        val bbb= aaa.split("-")

        println(bbb[0].toInt())
        println(bbb[1].toInt())
        println(bbb[2].toInt())

    }

