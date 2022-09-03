package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.println(total / 3);
		
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 };
		
		double total2 = 0;
		for(int i = 0; i < notasAlunoB.length; i++) {
			total2 += notasAlunoB[i];
		}
		
		System.out.println(total2 / notasAlunoB.length);
	}
}
