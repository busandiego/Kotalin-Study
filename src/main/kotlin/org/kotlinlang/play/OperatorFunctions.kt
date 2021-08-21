package org.kotlinlang.play

// using the operator modifier.
fun main() {

    operator fun Int.times(str: String) = str.repeat(this)

    println(2 * "Bye ")


    // An operator function allows easy range access on strings.
    operator fun String.get(range: IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."

    // The get() operator enables bracket-access syntax.
    println(str[0..14])

}
