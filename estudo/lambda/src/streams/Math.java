package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Math {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Carla", 6.1);
		Aluno a3 = new Aluno("Maria", 8.1);
		Aluno a4 = new Aluno("Vinicius", 9.5);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		Predicate<Aluno> reprovados = aprovados.negate();
		
		System.out.println(alunos.stream().allMatch(aprovados));
		System.out.println(alunos.stream().anyMatch(aprovados));
		System.out.println(alunos.stream().noneMatch(reprovados));
		
	}
}
