package org.kotlinlang.play.functions

// Infix Functions
// Member functions and extensions with a single parameter
// can be turned into infix functions.

// infix 함수는 두개의 변수 가운데 오는 함수를 말한다.


// Pair 객체를 만드는 경우
val pair: Pair<String, String> = "검정" to "치마"

/**
 *  Map을 만들 경우
 */

// 1. Pair를 이용해 Map을 만들기
val map1 = mapOf(Pair("민주당1호", "이재명"), Pair("국힘당1호", "윤석열"))


// 2. Infix 함수를 이용
val map2 = mapOf("민주당2호" to "이낙연", "국힘당2호" to "홍준표")

/*fun main(){
    println(map1)
    println(map2)
}*/


fun main() {
    infix fun Int.times(str: String) = str.repeat((this))
    // 여기서 this는 Int가 된다 -> 2가 들어가게 됨.
    println(2 times "Bye ")


    infix fun Int.timess(str: String) = str.repeat((this))
    println(3 timess "Bye ")

    val pair = "Ferrari" to "Rambo"
    println(pair)

    val pairObj = Pair("a", "b")
    println(pairObj)

    // onto로 새로 만들어서 설정할 수도 있음
    // asto도 가능 원하는대로
    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)


    // 초기화
    val laura = Person("Laura")
    val lee = Person("Lee")

    // Infix notation also works on members functions (methods).
    lee liked laura
    //println(lee liked laura)
    // println("lee.likedPeople: " + lee.likedPeople)
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()

    infix fun liked(other: Person) {
        likedPeople.add(other)
        println("other::: " + other.toString())
        println("likedPeople::: " + likedPeople.toString())
    }

}


