package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Jorge", 6.9);
		Aluno a3 = new Aluno("Vinicius", 8.0);
		Aluno a4 = new Aluno("Bia", 7.2);
		Aluno a5 = new Aluno("Amanda", 8.7);
		Aluno a6 = new Aluno("Carla", 7.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = al -> al.nota >= 7;
		Function<Aluno, String> ap = a -> "Parabéns " + a.nome + ", você foi aprovado(a)!";
		
		alunos.stream()
			.filter(aprovado)
			.map(ap)
			.forEach(System.out::println);
	}
}
