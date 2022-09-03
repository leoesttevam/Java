package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class Desafio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Function<Produto, Double> precoFinal = p -> p.preco * (1 - p.desconto);
		UnaryOperator<Double> imposto = preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arrendondamento = preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatado = preco -> ("R$ " + preco).replace(".", ",");
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		String preco = precoFinal
				.andThen(imposto)
				.andThen(frete)
				.andThen(arrendondamento)
				.andThen(formatado).apply(p);
		System.out.println("O preço final é " + preco);
	}
}
