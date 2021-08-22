package org.kotlinlang.play.inheritance

open class Tiger(val origin: String){
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}


// Parameterized Constructor를 쓰고 싶으면 subClass 안에 파라미터 넣어서 정의한다.
class SiberianTiger : Tiger("Siberia")

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}