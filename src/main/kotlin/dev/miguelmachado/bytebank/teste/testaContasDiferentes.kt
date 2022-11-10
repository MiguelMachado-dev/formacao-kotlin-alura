import dev.miguelmachado.bytebank.modelo.*

fun testaContasDiferentes() {
    // formas diferentes de enviar o valor para o construtor
    val gui = Cliente(
        nome = "Gui", cpf = "", senha = 2, endereco = Endereco(
            logradouro = "Rua das Laranjeiras",
        )
    )

    val contaCorrente = ContaCorrente(
        titular = Cliente(nome = "Alex", cpf = "", senha = 1),
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "Fran", cpf = "", senha = 2),
        numero = 1001
    )
    val contaSalario = ContaSalario(
        titular = gui,
        numero = 1002
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")
    println("saldo salário: ${contaSalario.saldo}")
    println("=======================================")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")
    println("saldo após saque salário: ${contaSalario.saldo}")
    println("=======================================")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")
    println("=======================================")

    contaPoupanca.transfere(200.0, contaCorrente)

    println("saldo poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")
    println("=======================================")

    contaCorrente.transfere(100.0, contaSalario)

    println("saldo corrente após transferir para salário: ${contaCorrente.saldo}")
    println("saldo salário após receber transferência: ${contaSalario.saldo}")
    println("=======================================")

    contaPoupanca.transfere(200.0, contaSalario)

    println("saldo poupança após transferir para salário: ${contaPoupanca.saldo}")
    println("saldo salário após receber transferência: ${contaSalario.saldo}")
    println("=======================================")

    // modelo.Conta Salário não pode transferir
    //  contaSalario.transfere(200.0, contaCorrente)
    //  contaSalario.transfere(200.0, contaPoupanca)
}
