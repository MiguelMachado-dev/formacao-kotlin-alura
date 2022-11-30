package dev.miguelmachado.bytebank.modelo

interface Autenticavel {
    fun autentica(senha: Int): Boolean
}
