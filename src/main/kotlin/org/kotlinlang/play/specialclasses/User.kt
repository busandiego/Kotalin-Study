package org.kotlinlang.play.specialclasses

// Data classes make it easy to create classes that are used to store values.
// Such classes are automatically provided with methods for copying,
// getting a string representation, and using instances in collections.
// You can override these methods with your own implementations in the class declaration.
data class User(val name: String, val id: Int) {
    override fun equals(other: Any?) =
        other is User && other.id == this.id


}


fun main() {
    val user = User("Alex", 1)
    println(user)

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    // Our custom equals considers two instances equal
    // if their ids are equal.
    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    // hashCode() function
    println("user.hashCode(): ${user.hashCode()}")
    println("secondUser.hashCode(): ${secondUser.hashCode()}")
    println("thirdUser.hashCode(): ${thirdUser.hashCode()}")
    println("user.copy().hashCode(): ${user.copy().hashCode()}")

    // copy() function
    // Auto-generated copy function makes
    // it easy to create a new instance.
    println("user.copy(): ${user.copy()}")

    // copy creates a new instance, so the object
    // and its copy have distinct references.
    println("user === user.copy(): ${user === user.copy()}")
    println("user.copy(\"Max\"): ${user.copy("Max")}")
    println("user.copy(id = 3): ${user.copy(id = 3)}")

    println("name = ${user.component1()}")
    println("id = ${user.component2()}")
}