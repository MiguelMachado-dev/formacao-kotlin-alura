import dev.miguelmachado.bytebank.modelo.ContaCorrente
import dev.miguelmachado.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    // usando labels
    val contaAlex = ContaCorrente(titular = "Alex", numero = 1000)
    contaAlex.deposita(200.0)
    contaAlex.saca(250.0)
    println("modelo.Conta da ${contaAlex.titular} de numero ${contaAlex.numero} com saldo de ${contaAlex.saldo}")

    val contaFran = ContaPoupanca("Fran", 1001)
    contaFran.deposita(300.0)
    println("modelo.Conta da ${contaFran.titular} de numero ${contaFran.numero} com saldo de ${contaFran.saldo}")

    if (contaFran.transfere(100.0, contaAlex)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println("modelo.Conta da ${contaAlex.titular} de numero ${contaAlex.numero} com saldo de ${contaAlex.saldo}")
    println("modelo.Conta da ${contaFran.titular} de numero ${contaFran.numero} com saldo de ${contaFran.saldo}")
}
