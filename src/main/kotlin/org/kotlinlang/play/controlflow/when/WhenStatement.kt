package org.kotlinlang.play.controlflow.`when`

// when: instead of the widely used switch statement,
// switch 대신 씀

fun main() {
    case(1)
    case("abc")
    case(3L)
    case(RandomClass())
    case("123")
    case(1)
    case(RandomClass())




}

fun case(obj: Any) {
    // 직접 객체를 조건에 넣을 순 없고 파라미터로 넣긴 가능
    when (obj) {
        1 -> println("Int 형")
        "abc" -> println("String 형")
        is Long -> println("Long 형")
        !is String -> println("String 아님")
        else -> println("unknown")
    }
}



class RandomClass()