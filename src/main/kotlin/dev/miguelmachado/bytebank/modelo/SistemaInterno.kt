package dev.miguelmachado.bytebank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("${admin.nome.uppercase()}: Bem-vindo ao Bytebank")
        } else {
            println("${admin.nome.uppercase()}: Falha na autenticação")
        }
    }
}
