package lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		
		//Fun??o lambda
		Calculo soma = (x, y) -> { return x + y; };
		System.out.println(soma.executar(2, 3));
		
		//soma = (x, y) -> x * y;
		
		Calculo multiplicacao = (e, f) -> { return e * f; };
		System.out.println(multiplicacao.executar(2, 3));
		
		System.out.println(soma.legal());
		System.out.println(Calculo.muitoLegal());
	}
}
