class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int) {
        if (admin.autentica(senha)) {
            println("${admin.nome.uppercase()}: Bem-vindo ao Bytebank")
        } else {
            println("${admin.nome.uppercase()}: Falha na autenticação")
        }
    }
}
