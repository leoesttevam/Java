package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("Pinoquio");
		livros.push("Os tres porquinhos");
		livros.push("Tazan");
		
		System.out.println(livros.peek());
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		for(String livro: livros) {
			System.out.println(livro);
		}
	}
}
