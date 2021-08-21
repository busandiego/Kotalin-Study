package org.kotlinlang.play.variables

// 코틀린은 강력한 타입추론을 가지고 있음
// type inference
// explicitly  : 명시적으로

// In essence use val over var
// 본질적으로 var보다 val 사용해라
fun main() {

    // Declares a mutable variable and initializes it.
    var a: String = "initial" // val로 쓰는게 좋음
    print(a)

    // Declares an immutable variable and initializes it.
    val b: Int = 1

    // Declares an immutable variable and initializes it without specifying the type.
    // The compiler infers the type Int.
    val c = 3


    var e: Int // 초기화 안함.
    // println(e) 컴파일러 에러 발생: 초기화해줘야함

    // You're free to choose when you initialize a variable,
    // however, it must be initialized before the first read.
    // 특별한 경우아니면 미리 초기화 해주는게 훨씬 좋다 (포프 코딩리뷰)
}
