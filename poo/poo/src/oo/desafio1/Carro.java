package oo.desafio1;

public class Carro {
	
	int velocidadeAtual;
	
	void acelerar(){
		velocidadeAtual += 5;
	}
	
	void frear() {
		velocidadeAtual -= 5;
		
		if(velocidadeAtual < 0) {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade Atual ? " + velocidadeAtual + "Km/h"; 
	}
}
