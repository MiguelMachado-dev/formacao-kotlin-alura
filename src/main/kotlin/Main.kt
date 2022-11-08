fun main() {
    println("Bem vindo ao Bytebank")

    val miguel = Funcionario(
        nome = "Miguel",
        cpf = "111.111.111-11",
        salario = 16000.0
    )

    println("nome ${miguel.nome}")
    println("cpf ${miguel.cpf}")
    println("salario ${miguel.salario}")
    println("Bonificação ${miguel.bonificacao()}")
}
