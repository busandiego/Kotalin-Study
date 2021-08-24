package org.kotlinlang.play.controlflow.Loops

// You can define your own iterators in your classes
// by implementing the iterator operator in them.

class Animal(val name: String)

class Zoo(private val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }

}

fun main() {
    val zoo = Zoo(
        listOf(
            Animal("bear"),
            Animal("bird"),
            Animal("cat")
        )
    )

    // For-loop range must have an 'iterator()' method
    // Loops through animals in the zoo with the user-defined iterator.
    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }

    // The iterator can be declared in the type or as an extension function.
}
