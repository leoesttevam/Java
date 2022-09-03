package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sets2 {

	public static void main(String[] args) {
		
		SortedSet<String> lista = new TreeSet<>();
		
		lista.add("Maria");
		lista.add("Pedro");
		lista.add("Carlos");
		lista.add("Matheus");
		
		for(String nome: lista) {
			System.out.println(nome);
		}
		
		Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
