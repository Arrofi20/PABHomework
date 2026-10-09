package com.example.hw05.task3

data class Student(val name: String, val score: Int, val year: Int)

val students = listOf(
    Student("Ali", 85, 2023),
    Student("Budi", 62, 2022),
    Student("Citra", 91, 2023),
    Student("Dewi", 58, 2022),
    Student("Eka", 76, 2023)
)

fun main() {
    // 1. filter
    val passing = students.filter { it.score >= 70 }
    println("Count (score >= 70): ${passing.size}")

    // 2. map + forEach
    students.map { "${it.name} (${it.score})" }.forEach { println(it) }

    // 3. sortedByDescending
    students.sortedByDescending { it.score }
        .take(3)
        .forEach { println(it.name) }

    // 4. fold
    val total = students.fold(0) { acc, s -> acc + s.score }
    val average = total.toDouble() / students.size
    println("Total: $total   Average: $average")

    // 5. groupBy
    students.groupBy { it.year }
        .forEach { (year, list) -> println("$year: ${list.map { it.name }}") }
}