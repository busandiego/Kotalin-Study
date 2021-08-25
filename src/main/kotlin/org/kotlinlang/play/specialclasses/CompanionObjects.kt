package org.kotlinlang.play.specialclasses

// Companion Objects
// An object declaration inside a class defines another useful case: the companion object.
// Syntactically it's similar to the static methods in Java: you call object members using its class name as a qualifier.
// If you plan to use a companion object in Kotlin, consider using a package-level function instead.
class BigBen {
    companion object Bonger {

        // Defines a companion object method.
        fun getBongs(nTimes: Int){
            for(i in 1 .. nTimes){
                print("Bong ")
            }
        }
    }
}

fun main() {
    // Calls the companion object method via the class name.
    BigBen.getBongs(12)
}