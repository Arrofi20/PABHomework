package com.example.hw04.task4

fun main() {
    val courses = mutableListOf("SIF101", "SIF202", "SIF303", "SIF202")
    val creditMap = mapOf(
        "SIF101" to 3, "SIF202" to 4, "SIF303" to 3,
        "SIF404" to 3, "SIF505" to 3
    )

    // 1. MutableList: tambah dua, hapus satu
    courses.add("SIF404")
    courses.add("SIF505")
    courses.remove("SIF303")
    println("Courses: $courses")

    // 2. Set: kode unik (duplikat hilang)
    val uniqueCourses = courses.toSet()
    println("Unique courses: $uniqueCourses")

    // 3. Map: cari kredit, tangani yang tidak ditemukan
    println("SIF202 credits: ${creditMap.getOrDefault("SIF202", 0)}")
    println("SIF999 credits: ${creditMap["SIF999"] ?: "not found"}")

    // 4. Ringkasan
    val totalCredits = uniqueCourses.sumOf { creditMap.getOrDefault(it, 0) }
    println("Total courses: ${uniqueCourses.size}")
    println("Total credits: $totalCredits")
}