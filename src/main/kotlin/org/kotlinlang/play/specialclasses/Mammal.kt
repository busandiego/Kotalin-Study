package org.kotlinlang.play.specialclasses

// Sealed classes let you restrict the use of inheritance
// it cannot be subclasses outside of the package where the sealed class is declared
sealed class Mammal(val name: String)


// Defines subclasses.
// Note that all subclasses must be in the same package
class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {

    // Uses an instance of the sealed class as an argument in a when expression.
    when (mammal) {

        // A smartcast is performed, casting Mammal to Human.
        is Human -> return "Hello ${mammal.name};" +
                "  you're working as a ${mammal.job}"

        // A smartcast is performed, casting Mammal to Cat.
        is Cat -> return "Hello ${mammal.name}"
    }
}

fun main() {
    println(greetMammal(Human("Lee", "software engineer")))
    println(greetMammal(Cat("Snowy")))
}