package estruturasControle;

import java.util.Locale;
import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = sc.nextDouble();
		
		if(media <= 10 && media >= 7.0) {
			System.out.println("Aluno Aprovado!");
			System.out.println("Parabéns!");
		}
		if(media < 7 && media >= 4.5) {
			System.out.println("Aluno esta em Recuperação");
			
		}
		
		if(media < 4.5 && media >= 0) {
			System.out.println("Aluno Reprovado");
		}
		
		sc.close();
	}
}
