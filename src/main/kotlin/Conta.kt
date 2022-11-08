open class Conta(
    val titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        // this.saldo += valor
        if (valor > 0) {
            saldo += valor
        }
    }

    open fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        } else {
            println("Valor de $valor indisponível para saque na conta $titular")
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }

        return false
    }
}
