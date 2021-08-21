package org.kotlinlang.play.nullsaftey

// java 코드와 상호작용할 때 null value가 필요한 경우들이 있다.
// 혹은 absent state 일때.

// 코틀린은 null tracking을 제공


fun describeString(maybeString: String?): String {
    if(maybeString != null && maybeString.length > 0){
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null String"
    }
}


fun main(){

    println(describeString("abcd"))
    println(describeString(null)) // null tracking 가능능
}