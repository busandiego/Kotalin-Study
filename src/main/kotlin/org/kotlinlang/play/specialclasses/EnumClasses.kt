package org.kotlinlang.play.specialclasses

enum class State {
    // three enum constants
    IDLE, RUNNING, FINISHED
    // IDLE : 쉬고있는, 게으른
}

fun main() {
    val state = State.RUNNING

    // With enums, the compiler can infer if a when-expression is exhaustive
    // so that you don't need the else-case
    // exhaustive : 철저한
    // ENUM constants 다 넣어야 됨.
    val message = when(state){
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }

    println(message)
}