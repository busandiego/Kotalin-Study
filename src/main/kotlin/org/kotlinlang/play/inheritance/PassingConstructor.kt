package org.kotlinlang.play.inheritance

open class Lion(val name: String, val origin: String){
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

// 생성자 매개변수 super class Lion에 name이 전달된다.
class Asiatic(name: String) : Lion(name = name, origin = "India")

// 그래서 Asiatic 쪽에서 Lion superclass에 값을 전달해서 값이 세팅된다.
fun main() {
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}
