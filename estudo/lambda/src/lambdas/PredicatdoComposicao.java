package lambdas;

import java.util.function.Predicate;

public class PredicatdoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = numero -> numero % 2 == 0;
		Predicate<Integer> isTresDg = numero -> numero >= 100 && numero <= 999;
		
		System.out.println(isPar.test(22));
		System.out.println(isPar.and(isTresDg).negate().test(255));
		System.out.println(isPar.or(isTresDg).test(450));
	}
}
