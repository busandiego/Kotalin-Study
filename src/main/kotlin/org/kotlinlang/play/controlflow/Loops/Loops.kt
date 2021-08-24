package org.kotlinlang.play.controlflow.Loops

val coffees = listOf("carmel", "americano", "latte", "cappuccino")


fun drinkCoffee() = println("drink a coffee")
fun makeCoffee() = println("make a coffee")


fun main() {

    // Loops through each cake in the list.
    for (coffee in coffees) {
        println("i like $coffee coffee")
    }

    var coffeeDrunk: Int = 0
    var coffeeMade: Int = 0

    while (coffeeDrunk < 6) {
        drinkCoffee()
        coffeeDrunk++
    }

    do {
        makeCoffee()
        coffeeMade++
    } while(coffeeMade < coffeeDrunk )
    // while에서 조건에 안 맞으면 다시 do로 돌아감
}

