package org.kotlinlang.play.collections

// Function all
// Function all returns true if all elements in collection
// match the give predicate



// val numbers = listOf(1, -2, 3, -4, 5, -6) - 컴파일오류
// 다른 패키지에 있는 변수명하고 겹침

fun main() {
    val numbers = listOf(1, -2, 3, -4, 5)

    val allEven = numbers.all { it % 2 == 0}

    val allLess6 = numbers.all { it < 6}

    println("Numbers: $numbers")
    println("All numbers are even: $allEven")
    println("All numbers are less than 6: $allLess6")

}