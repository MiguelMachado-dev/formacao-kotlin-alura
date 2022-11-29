package dev.miguelmachado.bytebank

import dev.miguelmachado.bytebank.modelo.Conta
import testaContasDiferentes

fun main() {
    testaContasDiferentes()

    println("Total de contas: ${Conta.total}")
}
