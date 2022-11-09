package dev.miguelmachado.bytebank.modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
    // "abstract" nao pode ter implementação
    abstract val bonificacao: Double
}
