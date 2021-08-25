package org.kotlinlang.play.specialclasses

// In Kotlin you also have the object keyword.
// It is used to obtain a data type with a single implementation.
// If you are a Java user and want to understand what "single" means,
// you can think of the Singleton pattern:
// it ensures you that only one instance of that
// class is created even if 2 threads try to create it.

// object를 쓰면 싱글톤 패턴으로 만들 수 있다.

    // object: no class, no constructor, only a lazy instance.
    // Why lazy? Because it will be created once when the object is accessed.
    // Otherwise, it won't even be created.


    // you create a single object,
    // declare its members and access it within one function.
    // Objects like this are often created in Java as anonymous class instances.
    fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {


        // Creates an object to use when calculating the result value.
        val dayRates = object {
            var standard: Int = 30 * standardDays
            var festivity: Int = 50 * festivityDays
            var special: Int = 100 * specialDays
        }

        // Accesses the object's properties.
        val total = dayRates.standard + dayRates.festivity + dayRates.special

        println("Total price: $$total")

    }

fun main() {
    rentPrice(10, 2, 1)
}


