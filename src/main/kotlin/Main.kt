fun main(){
    println("Bem vindo ao Bytebank")
    val titular = "Miguel"
    val numeroConta = 1000
    var saldo = 0.0

    if (titular.length > 1)
        saldo = 100.0

    println("Titular $titular")
    println("numero da conta $numeroConta")
    println("Saldo da conta $saldo")
}