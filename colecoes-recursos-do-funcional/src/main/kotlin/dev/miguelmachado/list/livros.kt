package dev.miguelmachado.list

val listaLivros: MutableList<Livro> = mutableListOf(
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    ),
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),
    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881,
        editora = "Editora B"
    ),
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora C"
    ),
    Livro(
        titulo = "Sagarana",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1946
    )
)

val listaLivrosComNulos: MutableList<Livro?> = mutableListOf(
    null,
    Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    ),
    null,
    Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    ),
    null,
    Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881,
        editora = "Editora B"
    ),
    null,
    Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora C"
    ),
    null,
    Livro(
        titulo = "Sagarana",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1946
    ),
    null,
    Livro(
        titulo = "O Cortiço",
        autor = "Aluísio Azevedo",
        anoPublicacao = 1890,
        editora = "Editora D"
    ),
    null,
    Livro(
        titulo = "Quincas Borba",
        autor = "Machado de Assis",
        anoPublicacao = 1891,
        editora = "Editora E"
    ),
    Livro(
        titulo = "Dom Casmurro",
        autor = "Machado de Assis",
        anoPublicacao = 1899,
        editora = "Editora F"
    ),
    Livro(
        titulo = "O Alienista",
        autor = "Machado de Assis",
        anoPublicacao = 1882,
        editora = "Editora G"
    ),
)
