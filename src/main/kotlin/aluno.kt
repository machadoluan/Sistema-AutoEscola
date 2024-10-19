package org.example

data class alunoModelo (
    val nome: String,
    val cpf: Number,
    val aulasFeitas: Int,
    val status: String
)

class alunos(){
    fun cadastrarAluno(nome: String,
                       cpf: Number,
                       aulasFeitas: Int,
                       status: String): List<alunoModelo>
    {
    val alunos : List<alunoModelo> = listOf(nome, cpf, aulasFeitas, status)
        return alunos
    }
}

