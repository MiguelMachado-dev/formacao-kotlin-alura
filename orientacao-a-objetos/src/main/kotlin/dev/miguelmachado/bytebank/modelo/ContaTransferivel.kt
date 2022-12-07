package dev.miguelmachado.bytebank.modelo

import dev.miguelmachado.bytebank.exception.FalhaAutenticacaoException
import dev.miguelmachado.bytebank.exception.SaldoInsuficienteException

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(mensagem = "O saldo é insuficiente, saldo atual: $saldo, valor a ser transferido: $valor")
        }

        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }

        saldo -= valor
        destino.deposita(valor)
    }

}
