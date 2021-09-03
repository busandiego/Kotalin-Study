package org.kotlinlang.play.collections


// List
// list is an collection of items.
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers

// MutableList은 변경 가능
// List는 read-only

fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    println("Tot sudoers: ${getSysSudoers().size}")
    addSystemUser(4)
    println("Tot sudoers: ${getSysSudoers().size}")

    getSysSudoers().forEach{
        i -> println("Some useful into on user $i")
    }
    // compilation error : 컴파일 에러
    // getSysSudoers().add(5) <- Error!
}