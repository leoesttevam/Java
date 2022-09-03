package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// Offer e Add -> adicionam elementos na fila.
		// Diferen�a � o comportamento quando a fila est� cheia!
		fila.add("Ana"); //Retorna falso.
		fila.offer("Bia");//Lan�a uma exce��o.
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Metodo pegar um elemento da fila.
		// Peek e Element -> obter o pr�ximo elemento da fila (sem remover).
		// Diferen�a � o comportamento quando a fila est� vazia!
		System.out.println(fila.peek());//retorna false.
		System.out.println(fila.peek());
		System.out.println(fila.element());//Lan�a uma exce��o.
		System.out.println(fila.element());
		
		// fila.size(); Para ver o tamanho da fila.
		// fila.clear(); Para limpar a fila.
		// fila.isEmpty(); Verifica se a fila est� vazia.
		// fila.poll(); Retorna o primeiro elemento da fila e remove.
		// fila.remove(); Ele e parecido com poll.
		
		System.out.println(fila.poll()); //Retorna false.
		System.out.println(fila.remove()); //Lan�a uma exce��o.
		
	}
}