package org.kotlinlang.play.functional

// Declares a higher-order function that returns a function.
// 함수가 다른 함수를 리턴하는 형태.
fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x

fun main() {

    // Invokes operation to get the result assigned to a variable.
    // invoke: 부르다
    // Here func becomes square which is returned by operation.
    // **operation()의 리턴은 spuare()의 함수이기 때문에
    // func(2)가 가능하다.
    val func = operation()

    // Invokes func. The square function is actually executed.
    // square함수가 작동함
    println(func(2))
}