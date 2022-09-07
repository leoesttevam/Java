package lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		
		Calculo soma = new Soma();
		Calculo multiplicacao = new Multiplicar();
		
		System.out.println(soma.executar(2, 9));
		System.out.println(multiplicacao.executar(8, 5));
	}
}
