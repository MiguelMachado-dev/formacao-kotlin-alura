package dev.miguelmachado.bytebank.modelo

// Classes abstratas não podem ser instanciadas.
abstract class Conta(
    val titular: Cliente,
    val numero: Int
) : Autenticavel {
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposita(valor: Double) {
        // this.saldo += valor
        if (valor > 0) {
            saldo += valor
        }
    }

    abstract fun saca(valor: Double)
}
