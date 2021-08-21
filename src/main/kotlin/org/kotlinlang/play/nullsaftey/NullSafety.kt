package org.kotlinlang.play.nullsaftey

// In an effort to rid the world of NullPointerException,
// variable types in Kotlin don't allow the assignment of null.
// If you need a variable that can be null,
// declare it nullable by adding ? at the end of its type.

fun main() {

    // 기본적으로 변수에 null을 할당 못하게 한다.
    // null이 필요한 경우 ?를 사용
    var neverNull: String = "This can't be null"
    // neverNull = null  compiler error

    var nullable: String? = "You can keep a null here"
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"

    // inferredNonNull = null  compiler error

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    strLength(neverNull)
    // strLength(nullable)  String? 을 불렀기 때문에 에러 발생
    // When calling the function with a String? (nullable) argument,
    // a compilation error is produced.
}



