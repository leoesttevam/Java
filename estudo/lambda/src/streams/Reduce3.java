package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Carla", 6.1);
		Aluno a3 = new Aluno("Maria", 8.1);
		Aluno a4 = new Aluno("Vinicius", 9.5);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		Function<Aluno, Double> nota = a -> a.nota;
		BiFunction<Media, Double, Media> somaMedia = (media, notas) -> media.adicionar(notas);
		BinaryOperator<Media> combiner = (m1, m2) -> Media.combinar(m1, m2);
		
		Media media = alunos.stream()
			.filter(aprovados)
			.map(nota)
			.reduce(new Media(), somaMedia, combiner);
		
		System.out.println(media.getValor());
	}
}
