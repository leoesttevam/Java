package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<String> imprimir = valor -> System.out.println(valor);
		Consumer<Produto> imprimir2 = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimir2.accept(p1);
		
		Produto p2 = new Produto("Caderno", 24.34, 0.09);
		Produto p3 = new Produto("Mochila", 120.34, 0.12);
		Produto p4 = new Produto("Notebook", 3565.94, 0.20);
		Produto p5 = new Produto("Monito", 1299.99, 0.15);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir2);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
