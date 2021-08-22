package org.kotlinlang.play.generics

// The first way to use generics in Kotlin is creating generic classes.

// E is called the generic type parameter.
class MutableStack<E>(vararg items: E){
    private val elements = items.toMutableList()

    // Inside the generic class,
    // E can be used as a parameter like any other type.
    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size


    override fun toString() = "MutableStack(${elements.joinToString()})"

}

// generic function
fun<E> mutableStackOf(vararg  elements: E) = MutableStack(*elements)

fun main() {

    // 타입추론하기 때문에 double 타입을 명시안해도 작동함함
   val stack = MutableStack(0.69, 3.14, 2.7)
    println("init: $stack")
    stack.push(0.99)
    println("push: $stack")

    println("peek(): ${stack.peek()}")
    println(stack)

    for (i in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }

    val stackOf = mutableStackOf("0.11", "0.34", "0.27")

}