import dev.miguelmachado.bytebank.exception.FalhaAutenticacaoException
import dev.miguelmachado.bytebank.exception.SaldoInsuficienteException
import dev.miguelmachado.bytebank.modelo.Cliente
import dev.miguelmachado.bytebank.modelo.ContaCorrente
import dev.miguelmachado.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)

    val contaAlex = ContaCorrente(titular = alex, numero = 1000)
    contaAlex.deposita(200.0)
    contaAlex.saca(250.0)
    println("modelo.Conta da ${contaAlex.titular} de numero ${contaAlex.numero} com saldo de ${contaAlex.saldo}")

    val contaFran = ContaPoupanca(fran, 1001)
    contaFran.deposita(300.0)
    println("modelo.Conta da ${contaFran.titular} de numero ${contaFran.numero} com saldo de ${contaFran.saldo}")

    try {
        contaFran.transfere(valor = 200.0, destino = contaAlex, senha = 2)
        println("Transferência sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferência")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na transferência")
        println("Falha na autenticação")
        e.printStackTrace()
    }

    println("modelo.Conta da ${contaAlex.titular} de numero ${contaAlex.numero} com saldo de ${contaAlex.saldo}")
    println("modelo.Conta da ${contaFran.titular} de numero ${contaFran.numero} com saldo de ${contaFran.saldo}")
}
