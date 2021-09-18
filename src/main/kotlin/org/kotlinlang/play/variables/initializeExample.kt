package org.kotlinlang.play.variables

fun someCondtion() = true

// val이라고 해서 무조건 처음에 초기화 해야되는게 아니라
//  first read하기 전에 조건문에 따라 초기화 해줄 수 있음
fun main() {
    val d: Int
    if (someCondtion()) {
        d = 1
    } else {
        d = 2
    }

    println(d) // -> first read

    val a= ""
    val b = " "

    println("'' ${a.length}")
    println("' ' ${b.length}")


}