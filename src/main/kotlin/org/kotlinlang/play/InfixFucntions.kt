package org.kotlinlang.play

// Infix Functions
// Member functions and extensions with a single parameter
// can be turned into infix functions.

// infix 함수는 두개의 변수 가운데 오는 함수를 말한다.


// Pair 객체를 만드는 경우
val pair : Pair<String, String> = "검정" to "치마"

/**
 *  Map을 만들 경우
 */

// 1. Pair를 이용해 Map을 만들기
val map1 = mapOf(Pair("민주당1호", "이재명"), Pair("국힘당1호", "윤석열"))


// 2. Infix 함수를 이용
val map2 = mapOf("민주당2호" to "이낙연", "국힘당2호" to "홍준표")

fun main(){
    println(map1)
    println(map2)
}


/*fun main2() {
    infix fun Int.times(str: String)


}*/



