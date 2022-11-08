fun testaComportamentosConta() {
    // usando labels
    val contaAlex = ContaCorrente(titular = "Alex", numero = 1000)
    contaAlex.deposita(200.0)
    contaAlex.saca(250.0)
    println("Conta da ${contaAlex.titular} de numero ${contaAlex.numero} com saldo de ${contaAlex.saldo}")

    val contaFran = ContaPoupanca("Fran", 1001)
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
