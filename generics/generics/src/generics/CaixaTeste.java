package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		SemGenerics caixaA = new SemGenerics();
		
		caixaA.guardar(2.3);
		
		Double coisa = (Double) caixaA.abrir();
		
		System.out.println(coisa);
		
		SemGenerics caixaB = new SemGenerics();
		
		caixaB.guardar("Olá");
		
		String coisa2 = (String) caixaB.abrir();
		
		System.out.println(coisa2);
	}
}
