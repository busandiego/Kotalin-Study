package org.kotlinlang.play.controlflow.Loops

// Kotlin uses == for structural comparison
// if (a == null) b == null else a.equals(b)

// and === for referential comparison.


fun main() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway", "Twain")


    // Returns true because it calls authors.equals(writers) and
    // sets ignore element order.
    // structural comparison
    println(authors == writers)

    // Returns false
    // because authors and writers are distinct references.
    // 레퍼런스 주소 값이 다름
    // referential comparison
    println(authors === writers)
}
