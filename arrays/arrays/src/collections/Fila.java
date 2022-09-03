package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//offer e add -> adiciona elementos na fila.
		//Diferença éo comportamento quando a fila está cheia!
		//Outra diferença no offer quando da erro ao add ele retorna uma exceção como false.
		//Já no add ele retorna uma exceção.
		fila.add("José");
		fila.offer("Bia");
		fila.add("Maria");
		fila.offer("Guilherme");
		fila.add("Marcos");
		fila.offer("Lia");
		
		//Ele pega o primeiro elemento da fila e não remove.
		//Quando a fila está vazia ele retorna false.
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		
		//Ele pega o primeiro elemento da fila tbm não remove.
		//Quando a fila está vazia ele retorna uma exceção.
		System.out.println(fila.element());
		
		//fila.size(); Ele verifica o tamanho da fila.
		//fila.clear(); Ele limpa elemento da fila.
		//fila.isEmpty(); Ele verifica se a fila está vazia.
		
		//Ele pega o primeiro elemento da fila já removendo.
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		//Ele remove elemento da fila parecido com o poll.
		//Se a fila estiver vazia ele retorna uma exceção.
		System.out.println(fila.remove());
	}
}
