package org.kotlinlang.play.collections

// Filter
// It takes a filter predicate as a lambda-parameter
// Elements that make the predicate true are returned in the result collection.


fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val positives = numbers.filter { x -> x > 0}

    val negatives = numbers.filter { it < 0}

    println("Numbers: $numbers")
    println("Positive Numbers: $positives")
    println("Negative Numbers: $negatives")




}