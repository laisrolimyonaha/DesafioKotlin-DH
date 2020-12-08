class DigitalHouseManager () {


    val listaAlunos = mutableListOf<Aluno>()
    val listaProfessores = mutableListOf<Professor>()
    val listaCursos = mutableListOf<Curso>()
    val listaMatricula = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        val curso = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)
        listaCursos.add(curso)
        println("O curso ${curso.nome} foi registrado.")
    }

    fun excluirCurso(codigoCurso: Int){
        for (curso in listaCursos) {
            if (curso.codigoCurso == codigoCurso) {
                listaCursos.remove(curso)
                println("O curso $curso de código $codigoCurso foi excluido com êxito.")
            }
        }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int){
        val profAdjunto = ProfessorAdjunto(nome,sobrenome,tempoDeCasa = 0,codigoProfessor, quantidadeDeHoras)
        listaProfessores.add(profAdjunto)
        println("O Professor Adjunto ${profAdjunto.nome} foi registrado com sucesso.")
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String){
        val profTitular = ProfessorTitular(nome,sobrenome,tempoDeCasa = 0,codigoProfessor,especialidade)
        listaProfessores.add(profTitular)
        println("O Professor Titular ${profTitular.nome} foi registrado com sucesso.")
    }

    fun excluirProfessor(codigoProfessor: Int){
        for (professor in listaProfessores) {
            if (professor.codigoProfessor == codigoProfessor) {
                listaProfessores.remove(professor)
                println("O professor foi excluido com êxito.")
            }
        }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        val novoAluno = Aluno(nome,sobrenome,codigoAluno)
        listaAlunos.add(novoAluno)
        println("Aluno ${novoAluno.nome} matriculado com sucesso.")
    }




}