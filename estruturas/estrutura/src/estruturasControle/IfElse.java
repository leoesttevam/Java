package estruturasControle;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String valor = JOptionPane.showInputDialog("Informe o n�mero");
		
		int numero= Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("N�mero � PAR!");
		}else {
			System.out.println("N�mero � �NPAR!");
		}
		
		sc.close();
	}
}
