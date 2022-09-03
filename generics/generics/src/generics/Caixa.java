package generics;

public class Caixa {

	public static void main(String[] args) {
		
		ComGenerics<String> caixaA = new ComGenerics<>();
		
		caixaA.guardar("Segredo");
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
	}
}
