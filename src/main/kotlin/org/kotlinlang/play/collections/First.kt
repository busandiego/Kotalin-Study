package org.kotlinlang.play.collections

// first, last
// there functions return the first and the last element of
// the collection correspondingly
// you can also use them with a predicate
// predicate가 함수형처럼 서술해서 표현하는 것을 말하는 듯 싶다.
// -> first { it % 2 == 0 } 처럼 조건거 인듯
// in this case, they return the first or the last element that matches the given predicate

// If a collection is empty or doesn't contain elements matching the predicate, the functions throw
// throw를 던지니까 주의 - NoSuchElementException

fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val arrnumbers = arrayOf(1, -2, 3, -4, 5, -6)

    val first = numbers.first()
    val last = numbers.last()

    // predicate
    val firstEven = numbers.first {it % 2 == 0}
    val lastOdd = numbers.last { it % 2 != 0}

    println("Numbers: $numbers")
    println("arrnumbers: ${arrnumbers.toString()}")
    println("arrnumbers: ${arrnumbers[0]}")
    println("First $first, last $last, first even $firstEven, last odd $lastOdd" )
}