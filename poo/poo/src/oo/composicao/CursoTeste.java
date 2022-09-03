package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Jo�o");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2022");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCursos(curso3);
		aluno2.adicionarCursos(curso3);
		aluno3.adicionarCursos(curso3);
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso " + curso1.nome);
			System.out.println("Meu nome � " + aluno.nome);
		}
		
		
		Curso encontrado = aluno1.obterCursoPorNome("Java Completo");
		
		if(encontrado != null) {
			System.out.println(encontrado.nome);
			System.out.println(encontrado.alunos);
		}
	}
}
