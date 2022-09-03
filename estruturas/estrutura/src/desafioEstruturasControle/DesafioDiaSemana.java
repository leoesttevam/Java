package desafioEstruturasControle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o dia da semana");
		int dia = sc.nextInt();
		
		if(dia >= 8 || dia <= 0) {
			System.out.println("Dia da semana inválida!");
		}else if(dia == 1) {
			System.out.println("Domingo-Feira");
		}else if(dia == 2) {
			System.out.println("Segunda-Feira");
		}else if(dia == 3) {
			System.out.println("Terça-Feira");
		}else if(dia == 4) {
			System.out.println("Quarta-Feira");
		}else if(dia == 5) {
			System.out.println("Quinta-Feira");
		}else if(dia == 6) {
			System.out.println("Sexta-Feira");
		}else if(dia == 7) {
			System.out.println("Sabado");
		}else {
			System.out.println("Fim do programa!");
		}
		sc.close();
	}
}
