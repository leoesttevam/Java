package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuario = new HashMap<>();
		
		usuario.put(1, "José");
		usuario.put(1, "Matheus");
		usuario.put(2, "José");
		usuario.put(3, "Luis");
		usuario.put(4, "Leo");
		
		System.out.println(usuario.size());
		System.out.println(usuario.isEmpty());
		
		System.out.println(usuario.keySet());
		System.out.println(usuario.values());
		System.out.println(usuario.entrySet());
		
		System.out.println(usuario.containsKey(4));
		System.out.println(usuario.containsValue("Leo"));
		
		System.out.println(usuario.get(2));
		
		for(int chave: usuario.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuario.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> valores: usuario.entrySet()) {
			System.out.println(valores.getKey() + " = " + valores.getValue());
		}
	}
}
