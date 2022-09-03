package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas notas: ");
		
		int qNotas = sc.nextInt();
		double[] notas = new double[qNotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println(i);
			notas[i] = sc.nextDouble();
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.println("A média é " + media);
		sc.close();
	}
}
