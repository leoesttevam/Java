package estruturasControle;

import java.util.Scanner;

public class SwichBreak {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String conceito = "";
		int nota = sc.nextInt();
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1:
			conceito = "E";
			break;
		default:
			conceito = "Não Informado";
		}
		
		System.out.println("Conceito é " + conceito);
		
		sc.close();
	}
}
