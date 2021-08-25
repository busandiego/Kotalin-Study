package org.kotlinlang.play.specialclasses

// Enums may contain properties and methods like other classes,
// separated from the list of enum constants by a semicolon.
enum class Color(val rgb: Int) {

    RED(0xFF0000),  // property는 0xFF0000인듯
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    // Enum class members are separated from the constant definitions by a semicolon.
    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

fun main() {
    val red = Color.RED
    println(red)
    println(red.containsRed()) // true false 인가?
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())
}