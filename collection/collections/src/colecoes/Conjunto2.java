package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Conjunto2 {

	public static void main(String[] args) {
		
		//Set<String> lista = new HashSet<String>();
		SortedSet<String> lista = new TreeSet<String>();
		
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Lucas");
		lista.add("Pedro");
		
		for(String nome : lista) {
			System.out.println(nome);
		}
		
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n : nums) {
			System.out.println(n);
		}
	}
}
