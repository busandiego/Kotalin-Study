package org.kotlinlang.play.collections


// Map
// A map is a collection of key/value pairs, where each key is unique and is used to retrieve the corresponding value.
// For creating maps, there are functions mapOf() and mutableMapOf()
// Using the to infix functions makes initialization less noisy.




const val POINT_X_PASS: Int = 15

// to infix function의 역할
// 1 to 100 --> key:1 value: 100으로 설정함
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatePointsCredit(accoundId: Int) {

    // key가 존재하는지 true or false
    if (EZPassAccounts.containsKey(accoundId)) {
        println("Updating $accoundId")

        // Reads the corresponding value and increments it with a constant value
        EZPassAccounts[accoundId] = EZPassAccounts.getValue(accoundId) + POINT_X_PASS
    } else {
        println("Error: Trying to update a non-existing account (id: $accoundId)")
    }
}

// Iterates immutable Map and prints key/value pairs.
fun accountsReport() {
    println("EZ-pass report:")
    EZPassReport.forEach { k, v ->
        println("ID $k: credit $v")
    }
}

fun main() {
    accountsReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountsReport()

}

