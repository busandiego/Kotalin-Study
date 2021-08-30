package org.kotlinlang.play.functional


// A higher-order function is a function that takes another function
// as parameter and/or returns a function.
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int{
    return operation(x, y)
}

// Declares a function that matches the operationsignature.
fun sum(x: Int, y: Int) = x + y

fun main() {
    // the function argument ::sum.
    // :: is the notation that references a function by name in Kotlin.
    val sumResult = calculate(4, 5, ::sum)


    // Invokes the higher-order function passing in a lambda as a function argument.
    // Looks clearer, doesn't it?
    val mulResult = calculate(4, 5) {a, b -> a * b}
    println("sumResult $sumResult, mulResult $mulResult")
}