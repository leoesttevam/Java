package generics;

import java.util.Arrays;
import java.util.List;

public class ListaTeste {

	public static void main(String[] args) {
		List<String> langs = Arrays.asList("JS", "JAVA", "PHP", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String ultimaString = (String) ListaUtil.getUtil1(langs);
		System.out.println(ultimaString);
		
		Integer untimoNumero = (Integer) ListaUtil.getUtil1(nums);
		System.out.println(untimoNumero);
		
		String ultimaString2 = ListaUtil.getUtil2(langs);
		System.out.println(ultimaString2);
		
		Integer untimoNumero2 = ListaUtil.getUtil2(nums);
		System.out.println(untimoNumero2);
	}
}
