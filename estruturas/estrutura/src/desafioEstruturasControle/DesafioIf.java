package desafioEstruturasControle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioIf {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota = 1.3;
		
		//N�o usar ; em estrutura de controle
		if(nota >= 9.0) {
			System.out.println("Quadro de Honra!");
			System.out.println("Voc� � fera!!!");
		}
		
		sc.close();
	}
}
