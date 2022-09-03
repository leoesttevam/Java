package br.com.cod3r.app.calculo;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;
import br.com.cod3r.app.logging.Logger;

public class CalculadoraIpl implements Calculadora{
	
	private String id = "abc";

	private OperacoesAritmeticas op = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return op.soma(nums);
	}
	
	public String getId() {
		return id;
	}
}
