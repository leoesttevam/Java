package estruturasControle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Voc� precisa falar as palavras magicas...");
			System.out.println("Quer sair?");
			
			texto = sc.nextLine();
		}while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Programa Finalizado!");
		System.out.println("Obrigado!");
		
		sc.close();
	}
}
