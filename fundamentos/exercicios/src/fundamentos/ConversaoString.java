package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoString {

	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2).length());
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro n?mero");
		String valor2 = JOptionPane.showInputDialog("Digite o primeiro segundo");
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		
		System.out.println("A soma ?: "+ soma);
		System.out.println("M?dia ?: " + soma / 2);
	}
}
