package com.example.hw04.task1

import java.time.Year

data class Book(val isbn: String, val title: String, val year: Int)

fun main() {
    val kotlinBook = Book("978-1617293290", "Kotlin in Action", 2024)
    val androidBook = Book("978-1234567890", "Android Basics", 2023)

    // toString() otomatis dari data class
    println(kotlinBook)
    println(androidBook)

    // copy() dengan tahun diganti ke tahun sekarang
    val updatedBook = kotlinBook.copy(year = Year.now().value)
    println(updatedBook)

    // == membandingkan isi, bukan referensi
    println(kotlinBook == androidBook)
}