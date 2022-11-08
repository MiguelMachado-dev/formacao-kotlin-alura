fun testaFuncionario() {
    val miguel = Gerente(
        nome = "Miguel",
        cpf = "111.111.111-11",
        salario = 16000.0,
        senha = 123
    )

    println("Bonificação: ${miguel.bonificacao}")


    if (miguel.autentica(123456)) {
        println("Autenticado com sucesso!")
    }

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(miguel)

    println("Total de bonificação: ${calculadora.total}")
}
