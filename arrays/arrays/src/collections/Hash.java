package collections;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuario = new HashSet<Usuario>();
		
		usuario.add(new Usuario("Pedro"));
		usuario.add(new Usuario("Ana"));
		usuario.add(new Usuario("Leo"));
		
		boolean resultado = usuario.contains(new Usuario("Ana"));
		System.out.println(resultado);
	}
}
