package dev.miguelmachado.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    // polimorfismo, visto que gerente e diretor sao funcionarios
    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }
}
