package org.kotlinlang.play.collections

// associateBy, groupBy
// functions associateBy and groupBy build maps from the elemetns of a collection
// indexed by the specified key.



data class Person(val name: String, val city: String, val phone: String) // 1
fun main() {

    val people = listOf(                                                     // 2
        Person("John", "Boston", "+1-888-123456"),
        Person("Sarah", "Munich", "+49-777-789123"),
        Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
        Person("Vasilisa", "Saint-Petersburg", "+7-999-123456"))


}