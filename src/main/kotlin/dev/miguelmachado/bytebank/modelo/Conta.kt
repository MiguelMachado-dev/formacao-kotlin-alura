package dev.miguelmachado.bytebank.modelo

// Classes abstratas não podem ser instanciadas.
abstract class Conta(
    val titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

    fun deposita(valor: Double) {
        // this.saldo += valor
        if (valor > 0) {
            saldo += valor
        }
    }

    abstract fun saca(valor: Double)
}
