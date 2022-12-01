package dev.miguelmachado.bytebank

fun main() {
    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55, 40)

    var maiorIdade = 0
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println("Maior idade: $maiorIdade")

    var menorIdade = Int.MAX_VALUE
    idades.forEach {
        if (it < menorIdade) {
            menorIdade = it
        }
    }

    println("Menor idade: $menorIdade")
}
