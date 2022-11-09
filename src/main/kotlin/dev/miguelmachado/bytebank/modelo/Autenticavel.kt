package dev.miguelmachado.bytebank.modelo

interface Autenticavel {
    val nome: String
    fun autentica(senha: Int): Boolean
}
