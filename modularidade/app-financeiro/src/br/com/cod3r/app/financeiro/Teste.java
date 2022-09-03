package br.com.cod3r.app.financeiro;

import java.util.ServiceLoader;
import br.com.cod3r.app.Calculadora;

public class Teste {

	public static void main(String[] args) {
		
		Calculadora calc = ServiceLoader
				.load(Calculadora.class)
				.findFirst().get();
		System.out.println(calc.soma(2, 3, 4));
		
		//OperacoesAritmeticas opr = new OperacoesAritmeticas();
		//System.out.println(opr.soma(5, 8, 2));
		
		//try {
			//Field field = CalculadoraIpl.class.getDeclaredFields()[0];
			//field.setAccessible(true);
			//field.set(calc, "def");
			//field.setAccessible(false);
			
			//System.out.println(calc.getId());
		//} catch (IllegalArgumentException | IllegalAccessException e) {
			//e.printStackTrace();
		//}
		
		
		//System.out.println(CalculadoraIpl.class.getName());
	}
}
