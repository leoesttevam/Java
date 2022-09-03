package classesMetodos;

public class Jantar {

	public static void main(String[] args) {
		
		Comida cm = new Comida("Arroz", 0.223);
		Comida cd = new Comida("Arroz", 0.223);
		
		Pessoa p = new Pessoa("João", 99.9);
		
		p.comer(cm);
		System.out.println(p.apresentar());
		
		p.comer(cd);
		System.out.println(p.apresentar());
	}
}
