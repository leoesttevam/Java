package estruturasControle;

import java.util.Locale;
import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		double nota = sc.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota inv�lida!");
		}else if(nota >= 8.1){
			System.out.println("Conceito A");
		}else if(nota >= 6) {
			System.out.println("Conceito B");
		}else if(nota >= 4.1) {
			System.out.println("Conceito C");
		}else if(nota >= 2.1){
			System.out.println("Conceito d");
		}else {
			System.out.println("Conceito E");
		}
		
		System.out.println("Fim!");
		
		sc.close();
	}
}
