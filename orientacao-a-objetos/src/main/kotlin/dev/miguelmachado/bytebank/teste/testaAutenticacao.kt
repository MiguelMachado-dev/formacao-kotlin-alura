import dev.miguelmachado.bytebank.modelo.Cliente
import dev.miguelmachado.bytebank.modelo.Diretor
import dev.miguelmachado.bytebank.modelo.Gerente
import dev.miguelmachado.bytebank.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Miguel",
        cpf = "111.111.111-11",
        salario = 16000.0,
        senha = 123456
    )

    val diretor = Diretor(
        nome = "John Doe",
        cpf = "111.111.111-11",
        salario = 19000.0,
        senha = 123123,
        plr = 350.0
    )

    val cliente = Cliente(
        nome = "John Doe",
        cpf = "111.111.111-11",
        senha = 123123
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 123456)
    sistema.entra(admin = diretor, senha = 12312)
    sistema.entra(admin = cliente, senha = 123123)
}
