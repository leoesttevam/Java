package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::print;
		
		Stream<String> langs = Stream.of("Java ", "JavaScript ", "Python\n");
		langs.forEach(print);
		
		String[] maislangs = { "Python ", "Lips ", "Perl ", "Go\n" };
		
		Stream.of(maislangs).forEach(print);
		
		Arrays.stream(maislangs).forEach(print);
		Arrays.stream(maislangs, 1, 2).forEach(print);
		
		List<String> outraLangs = Arrays.asList("C ", "PHP ", "Java\n");
		outraLangs.stream().forEach(print);
		outraLangs.parallelStream().forEach(print);
		
		// Stream.generate(() -> "a").forEach(print);
		// Stream.iterate(0, n -> n + 1).forEach(println);
		
	}
}
