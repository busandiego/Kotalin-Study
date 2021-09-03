package org.kotlinlang.play.collections

// Set
// A set is unordered collection that does not support duplicates.
// setOf(), mutableSetOf()
val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

fun addIssue(uniqueDesc: String): Boolean {
    // add 함수의 데이터리턴은 Boolean임
    // fun add
    // Adds the specified element to the set.
    // Returns:
    // true if the element has been added, false if the element is already contained in the set.

    return openIssues.add(uniqueDesc)
}

// 이렇게 축약 가능
fun addIssue2(uniqueDesc: String): Boolean = openIssues.add(uniqueDesc)
fun addIssue3(uniqueDesc: String) = openIssues.add(uniqueDesc)

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registerred correctly." else "marked as duplicate and rejected."
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")
}
