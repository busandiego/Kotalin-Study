package org.kotlinlang.play.collections

// count
// count functions returns either the total number of
// elements in a collection
// or the number of elements matching the given predicate


fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val totalCount = numbers.count()
    val eventCount = numbers.count{it % 2 == 0}

    println("Total number of elements: $totalCount")
    println("Number of even elements: $eventCount")


}