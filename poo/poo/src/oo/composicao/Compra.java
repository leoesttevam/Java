package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> lista = new ArrayList<Item>();
	
	void adicionarItem(Item item) {
		lista.add(item);
		item.compra = this;
	}
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item : lista) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
}
