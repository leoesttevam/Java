package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		//NÂO PERMITE: int -> Double
		
		BinaryOperator<Double> soma = (x, y) -> { return x + y; };
		System.out.println(soma.apply(5.0, 10.0));
		
		BinaryOperator<Integer> soma2 = (x, y) -> x * y;
		System.out.println(soma2.apply(5, 10));
		
	}
}
