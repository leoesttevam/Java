package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

	public static void main(String[] args) {
		
		DAO<Aluno> aluno = new DAO<>();
		
		Aluno al = new Aluno(123L, "Diego Dias");
		AlunoBolsista ab = new AlunoBolsista(125L, "Pamela Anderson", 350.0);
		
		aluno.atomico(al);
		aluno.atomico(ab);
		
		aluno.fechar();
	}
}
