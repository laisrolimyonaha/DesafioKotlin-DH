open class Curso (val nome: String, val codigoCurso: Int, val quantidadeMaxTurma: Int){

    private val listaAlunosMatriculados = mutableListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (listaAlunosMatriculados.size < quantidadeMaxTurma) {
            listaAlunosMatriculados.add(umAluno)
            return true
        } else return false
    }

    fun excluirAluno(umAluno: Aluno) {
        listaAlunosMatriculados.remove(umAluno)
    }


}