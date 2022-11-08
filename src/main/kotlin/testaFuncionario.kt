fun testaFuncionario() {
    val miguel = Gerente(
        nome = "Miguel",
        cpf = "111.111.111-11",
        salario = 16000.0,
        senha = 123
    )

    println("Bonificação: ${miguel.bonificacao}")

    val gerente = Gerente(
        nome = "Gerente",
        cpf = "222.222.222-22",
        salario = 32000.0,
        senha = 123456
    )

    println("Bonificação: ${gerente.bonificacao}")

    if (gerente.autentica(123456)) {
        println("Autenticado com sucesso!")
    }

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(miguel)
    calculadora.registra(gerente)

    println("Total de bonificação: ${calculadora.total}")
}
