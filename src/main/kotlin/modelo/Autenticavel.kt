package modelo

interface Autenticavel {
    val nome: String
    fun autentica(senha: Int): Boolean
}
