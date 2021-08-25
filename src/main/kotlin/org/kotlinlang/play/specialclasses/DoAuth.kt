package org.kotlinlang.play.specialclasses

object DoAuth {

    // can't be used in a variable assignment.
    // You should use it to directly access its members:
    fun takeParams(username: String, password: String) {
        println("input Auth parameters + $username:$password")
    }
}

fun main() {
    // Calls the method.
    // This is when the object is actually created.
    DoAuth.takeParams("foo", "qwerty")
}