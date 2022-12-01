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

    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    val aumento = 1.1

    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }

    println(salarios.contentToString())

    // mesma ideia, mas usando forEach
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * aumento
    }

    println(salarios.contentToString())
}
