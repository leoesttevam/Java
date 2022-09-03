package classesMetodos;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	//Construtor
	Produto() {
		
	}
	
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	Produto(String nomeInicial) {
		nome = nomeInicial;
	}
	
	//Método
	double precoDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoDesconto(double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}
}
