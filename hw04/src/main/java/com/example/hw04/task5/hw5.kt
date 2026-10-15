package com.example.hw04.task5

enum class LetterGrade { A, B, C, D, E }

data class Student(val id: Int, val name: String, val score: Int)

fun Student.letterGrade(): LetterGrade = when {
    score >= 85 -> LetterGrade.A
    score >= 70 -> LetterGrade.B
    score >= 55 -> LetterGrade.C
    score >= 40 -> LetterGrade.D
    else -> LetterGrade.E
}

fun main() {
    val students = mutableListOf(
        Student(101, "Ali", 88),
        Student(102, "Budi", 65),
        Student(103, "Citra", 92),
        Student(104, "Dewi", 71)
    )

    // Tambah satu saat runtime, lalu hapus berdasarkan kondisi (skor < 40)
    students.add(Student(105, "Eka", 35))
    students.removeAll { it.score < 40 }

    // Iterasi dengan destructuring
    for (student in students) {
        val (id, name, score) = student
        println("$id - ${name.padEnd(8)} - $score -> ${student.letterGrade()}")
    }
}