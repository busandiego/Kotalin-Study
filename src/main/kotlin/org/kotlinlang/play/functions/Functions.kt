package org.kotlinlang.play

// Unit: 반환할게 없을 때,
// 함수에는 기본적으로 반환 타입을 명시해줘야 한다.
// 자바 void 와 같은 역할
// Unit (i.e., no return value). i.e = in other words = 다시 말해서
fun printMessage(message: String): Unit {
    println(message)
}

// Unit을 사용한것과 마찬가지, 생략됨
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("$prefix $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

// 타입안써도 가능 타입추론해서 계산함
// inferred : 추론
fun multiply(x: Int, y: Int) = x * y


fun main() {
    printMessage("hey")
    printMessageWithPrefix("Korean", "race:")

    // 변수명 쓰는게 좋음, 순서 바꿔도 상관없음
    printMessageWithPrefix(prefix = "prefix", message = "end")
    println(sum(4, 6))
    println(multiply(2, 3))

}