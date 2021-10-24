package org.kotlinlang.play.classes

import java.sql.DriverManager.println


class Customer
// curly braces can be omitted 생략가능

// Declares a class named Customer without any properties or user-defined constructors.
// A non-parameterized default constructor is created by Kotlin automatically.
// 코틀린에서 기본생성자 자동으로 만들어 줌.
// 밑에꺼는 user-defined로 two properties로 만든 것
class Contact(val id: Int, var email: String)
// val : immutable
// var : mutable
class testClass

val testClassInstance: testClass = testClass()

fun main() {

    // create instance
    // 코틀린에는 new가 없다!
    // 기본생성자로 만든 인스턴스

    val customer = Customer()

    if (customer == null) {
        println("null: $customer")
    } else {
        println("non null: $customer")
        println("non null: ${customer.toString()}")
    }

    // 2개의 매개변수로 만든 생성자
    val contact = Contact(id = 1, email = "mary@gmail.com")

    // accesses the property id
  //  println(contact.id)

    // updates the value of property email
    contact.email = "jane@gmail.com"




}



