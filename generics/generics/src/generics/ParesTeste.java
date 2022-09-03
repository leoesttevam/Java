package generics;

public class ParesTeste {

	public static void main(String[] args) {
		
		Pares<Integer, String> resultado = new Pares<>();
		
		resultado.adicionar(1, "Maria");
		resultado.adicionar(2, "Pedro");
		resultado.adicionar(3, "José");
		resultado.adicionar(4, "Renen");
		resultado.adicionar(2, "Ana");
		
		System.out.println(resultado.getValor(1));
		
	}
}
