package org.kotlinlang.play.collections

// function any
// Function any return true if the collection contains at least one element
// that matches the given predicate
// true나 false를 return

val numbers = listOf(1, -2, 3, -4, 5, -6)
val anyNegative = numbers.any {it < 0}
val anyGT6 = numbers.any {it > 6}

fun main() {
    println("Numbers: $numbers")
    println("Is there any number less than 0: $anyNegative")
    println("Is there any number greater than 6: $anyGT6")

}
