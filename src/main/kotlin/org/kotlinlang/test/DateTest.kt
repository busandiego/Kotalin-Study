package org.kotlinlang.test

import java.time.LocalDate
import java.util.*

fun main() {
//
    val localDateNow = LocalDate.now()
    val localDateNowPlus1 = localDateNow.plusDays(1L)
    val nowInt = localDateNow.toString().replace("-", "").toInt()
    val nowPlus1Int = localDateNowPlus1.toString().replace("-", "").toInt()

    println(localDateNow)
    println(localDateNowPlus1)
    println(nowInt)
    println(nowPlus1Int)
    // println(localDateNow.atStartOfDay())

    val calendar = Calendar.getInstance()
    val maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH)
    val firstDay = calendar.getActualMinimum(Calendar.DAY_OF_MONTH)


    println(firstDay)
    println( localDateNow.monthValue)


    val res = "0,|1.86,1.33:1.34,1.10|1.86,1.33:1.34,1.10|1.86,1.33:1.34,1.10|1.86,1.33:1.34,1.10|1.86,1.33:1.34,1.10|1.86,1.33:1.34,1.10|1.86,1.33:1.34,1.10|1.86,1.33:1.34,1.10|1.86,1.33:1.34,1.10|1.86,1.33:1.34,1"

    val split = res.split("|").toMutableList()
     split.removeAt(0)
     println(split)
}