package collections;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Diego"));
		lista.add(new Usuario("Rubens"));
		lista.add(new Usuario("Jos�"));
		
		System.out.println(lista.get(3)); //acessar pelo �ndice
		
		lista.remove(1);
		System.out.println(lista.remove(new Usuario("Jos�")));
		
		System.out.println(lista.contains(new Usuario("Carlos")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
