package org.kotlinlang.test

import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import java.util.concurrent.ThreadLocalRandom

fun main() {

    val t1 = "01"
    val t2 = "02"
    val t3 = "10"

    println("t1: ${t1.toInt()}")
    println("t2: ${t2.toInt()}")
    println("t3: ${t3.toInt()}")

    val aaa = "2021-10-11"
    val bbb = aaa.split("-")

    println(bbb[0].toInt())
    println(bbb[1].toInt())
    println(bbb[2].toInt())



    println(convertDataId(20211020))

   println(get48hoursIdData("202110200000"))

   // makeResponseData("202110200000")
}


fun convertDataId(dataId: Int): String {

    val string = dataId.toString()
    val formatter = DateTimeFormatter.ofPattern("yyyyMMdd")
    val date: LocalDate = LocalDate.parse(string, formatter)

    return date.toString().replace("-", ".")
}


fun get48hoursIdData(dataId: String): MutableList<String> {
    var returnList = mutableListOf<String>()

    val formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm")
    val date: LocalDateTime = LocalDateTime.parse(dataId, formatter)

    for (i in 0..95) {
        val str: String = date.plusMinutes(30L * i).toString().replace("-", "")
        returnList.add(str.substring(2, str.length).replace(":", "").replace("T", ""))
        println(str.substring(2, str.length).replace(":", "").replace("T", ""))

    }

    return returnList

}


fun makeResponseData(dataId: String) {

    val formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm")
    val date: LocalDateTime = LocalDateTime.parse(dataId, formatter)

    for (i in 0..95) {
        val str: String = date.plusMinutes(30L * i).toString().replace("-", "")
        val resultStr = str.substring(2, str.length).replace(":", "").replace("T", "")

        val ran1 = ThreadLocalRandom.current().nextDouble(1.0, 2.0)
        val ran2 = ThreadLocalRandom.current().nextDouble(1.0, 2.0)
        val ran3 = ThreadLocalRandom.current().nextDouble(1.0, 2.0)
        val ran4 = ThreadLocalRandom.current().nextDouble(1.0, 2.0)


        val ran1Format = String.format("%.2f", ran1)
        val ran2Format = String.format("%.2f", ran2)
        val ran3Format = String.format("%.2f", ran3)
        val ran4Format = String.format("%.2f", ran4)

        val fix1 = "1.01"


        val result = resultStr + "," + "|" + ran1Format + "," + ran2Format + ":" + ran3Format + "," + ran4Format +
       "|" + ran1Format + "," + ran2Format + ":" + ran3Format + "," + ran4Format +
       "|" + ran1Format + "," + ran2Format + ":" + ran3Format + "," + ran4Format +
       "|" + ran1Format + "," + ran2Format + ":" + ran3Format + "," + ran4Format +
       "|" + ran1Format + "," + ran2Format + ":" + ran3Format + "," + ran4Format +
       "|" + ran1Format + "," + ran2Format + ":" + ran3Format + "," + ran4Format +
       "|" + ran1Format + "," + ran2Format + ":" + ran3Format + "," + ran4Format +
       "|" + ran1Format + "," + ran2Format + ":" + ran3Format + "," + ran4Format +
       "|" + ran1Format + "," + ran2Format + ":" + ran3Format + "," + ran4Format +
       "|" + ran1Format + "," + ran2Format + ":" + ran3Format + "," + ran4Format


        println(result)
    }



    // 1. 랜덤 double값 네 개
    // 2. 처음에 날짜 세팅 필요
    // 랜덤한 데이터 갯수들 넣기


}