package com.example.hw04.task3

import kotlin.math.abs

// 1. Menghitung jumlah kata
fun String.wordCount(): Int =
    trim().split(Regex("\\s+")).filter { it.isNotEmpty() }.size

// 2. Format Rupiah dengan titik pemisah ribuan
fun Int.toRupiahString(): String {
    val digits = abs(this).toString()
    val grouped = digits.reversed().chunked(3).joinToString(".").reversed()
    val sign = if (this < 0) "-" else ""
    return "Rp $sign$grouped"
}

// 3. Rata-rata hanya dari nilai dalam rentang [min, max]
fun List<Int>.clampedAverage(min: Int, max: Int): Double {
    val filtered = filter { it in min..max }
    return if (filtered.isEmpty()) 0.0 else filtered.average()
}

fun main() {
    // 1
    println("Kotlin".wordCount())
    println("Belajar Kotlin itu menyenangkan".wordCount())
    println("Saya sedang mengerjakan tugas pengembangan aplikasi bergerak hari ini".wordCount())

    // 2
    println(1000.toRupiahString())
    println(50000.toRupiahString())
    println(1000000.toRupiahString())

    // 3
    val result = listOf(10, 50, 200, 85, -5).clampedAverage(0, 100)
    println("listOf(10, 50, 200, 85, -5).clampedAverage(0, 100) = $result")
    println(listOf(200, 300).clampedAverage(0, 100))
}