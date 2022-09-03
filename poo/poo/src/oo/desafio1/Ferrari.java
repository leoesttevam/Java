package oo.desafio1;

public class Ferrari extends Carro implements Esportivo, Luxo{

	@SuppressWarnings("unused")
	private boolean ligarTurbo;
	@SuppressWarnings("unused")
	private boolean ligarAr;
	
	void acelerar(){
		velocidadeAtual += 15;
		
		if(velocidadeAtual >= 340) {
			velocidadeAtual = 340;
		}
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}
}
