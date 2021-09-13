package org.kotlinlang.play.collections

// find, findLast
// find and findLast functions return the first or the last
// collection element that matches the given predicate
// if there are no such elements, functions return null

fun main() {

    // 조건에 맞게 있으면 그 문자열을 찾아서 리턴해줌
    // find는 첫번째 요소 findLast는 마지막요소
    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")
    val first = words.find {it.startsWith("some")}
    val last = words.findLast { it.startsWith("some") }


    val nothing = words.find {it.contains("nothing")}

    val firstContain = words.find { it.contains("some") }
    val lastContain = words.findLast { it.contains("some") }

    println("The first word starting with \"some\" is \"$first\"")
    println("The last word starting with \"some\" is \"$last\"")
    println("The first word containing \"nothing\" is ${nothing?.let { "\"$it\"" } ?: "null"}")

    println("The first word containing \"firstContain\" is $firstContain")
    println("The last word containing \"lastContain\" is $lastContain")




}