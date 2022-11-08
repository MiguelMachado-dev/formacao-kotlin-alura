fun main() {
    println("Bem vindo ao Bytebank")

    val miguel = Funcionario(
        nome = "Miguel",
        cpf = "111.111.111-11",
        salario = 16000.0
    )

    val gerente = Gerente(
        nome = "Gerente",
        cpf = "222.222.222-22",
        salario = 32000.0,
        senha = 123456
    )

    if (gerente.autentica(123456)) {
        println("Autenticado com sucesso!")
    }
}
