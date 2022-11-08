fun main() {
    println("Bem vindo ao Bytebank")

    val contaCorrente = ContaCorrente(
        titular = "Miguel",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "John Doe",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
}
