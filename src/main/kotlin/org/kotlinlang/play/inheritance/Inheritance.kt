package org.kotlinlang.play.inheritance


// Kotlin classes are final by default.
// If you want to allow the class inheritance,
// mark the class with the open modifier.
// 기본적으로 class는 final이 잡혀 있다.
//  상속을 쓰려면 open을 써야함
open class Dog{
    open fun sayHello() {
        println("wow wow!")
    }
}

// A class inherits a superclass when you specify the : SuperclassName() after its name.
// The empty parentheses () indicate an invocation of the superclass default constructor.
class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif!")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}