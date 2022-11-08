fun main() {
    println("Bem vindo ao Bytebank")
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.deposita(200.0)
    contaAlex.saca(250.0)
    println("Conta da ${contaAlex.titular} de numero ${contaAlex.numero} com saldo de ${contaAlex.saldo}")

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.deposita(300.0)
    println("Conta da ${contaFran.titular} de numero ${contaFran.numero} com saldo de ${contaFran.saldo}")

    if (contaFran.transfere(100.0, contaAlex)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println("Conta da ${contaAlex.titular} de numero ${contaAlex.numero} com saldo de ${contaAlex.saldo}")
    println("Conta da ${contaFran.titular} de numero ${contaFran.numero} com saldo de ${contaFran.saldo}")
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        // this.saldo += valor
        if (valor > 0) {
            saldo += valor
        }
    }

    fun saca(valor: Double) {
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
