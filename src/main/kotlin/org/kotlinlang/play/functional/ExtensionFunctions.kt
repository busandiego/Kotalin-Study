package org.kotlinlang.play.functional

    // ExtensionsFunctions and Properties

    // 코틀린은 클래스에 함수와 프로퍼티를 설정해서 추가할 수 있다.
    data class Item(val name: String, val price: Float)

    data class Order(val items: Collection<Item>)

    // Adds extension functions for the order type
    fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F

    fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PORODUCTS"

    // 두줄다 하나의 함수로 만들어져있음
    val Order.commaDelimitedItemNames: String
    get() = items.map { it.name }.joinToString()

    fun main() {
        val order = Order(listOf(
            Item("Bread", 25.0F),
            Item("Wine", 29.0F),
            Item("Water", 12.0F)))

        println("Max priced item name: ${order.maxPricedItemName()}")
        println("Max priced item value: ${order.maxPricedItemValue()}")
        println("Items: ${order.commaDelimitedItemNames}")

        println("=================================================")
        fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"
        println(null.nullSafeToString())
        println("Kotlin".nullSafeToString())
    }
