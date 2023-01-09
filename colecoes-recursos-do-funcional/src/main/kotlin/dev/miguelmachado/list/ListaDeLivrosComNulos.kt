package dev.miguelmachado.list

fun main() {
    listaLivros
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach { (editora: String?, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}
