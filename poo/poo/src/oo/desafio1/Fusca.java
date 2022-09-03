package oo.desafio1;

public class Fusca extends Carro{

	void acelerar(){
		velocidadeAtual += 5;
		
		if(velocidadeAtual >= 117) {
			velocidadeAtual = 117;
		}
	}
}
