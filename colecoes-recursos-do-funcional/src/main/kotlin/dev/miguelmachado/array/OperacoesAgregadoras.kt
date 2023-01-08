package dev.miguelmachado.array

fun main() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    val media: Double = idades.average()
    println("Média de idade: $media")

    // Retorna true se todos os elementos do array atenderem a condição
    val todosMaiores = idades.all { it >= 18 }
    println("Todos maiores de idade? $todosMaiores")

    val existeMaior = idades.any { it >= 18 }
    println("Existe alguém maior de idade? $existeMaior")

    val maiores = idades.filter { it >= 18 }
    println("Maiores de idade: $maiores")

    val busca = idades.find { it >= 18 }
    println("Busca: $busca")
}
