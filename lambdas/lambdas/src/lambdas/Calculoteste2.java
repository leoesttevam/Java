package lambdas;

import java.util.function.BinaryOperator;

public class Calculoteste2 {

	public static void main(String[] args) {
		
		//Função lambda
		BinaryOperator<Double> soma = (x, y) -> { return x + y; };
		System.out.println(soma.apply(2.0, 3.0));
						
		BinaryOperator<Integer> multiplicacao = (e, f) -> { return e * f; };
		System.out.println(multiplicacao.apply(2, 3));
				
	}
}
