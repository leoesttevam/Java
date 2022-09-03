package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//offer e add -> adiciona elementos na fila.
		//Diferen�a �o comportamento quando a fila est� cheia!
		//Outra diferen�a no offer quando da erro ao add ele retorna uma exce��o como false.
		//J� no add ele retorna uma exce��o.
		fila.add("Jos�");
		fila.offer("Bia");
		fila.add("Maria");
		fila.offer("Guilherme");
		fila.add("Marcos");
		fila.offer("Lia");
		
		//Ele pega o primeiro elemento da fila e n�o remove.
		//Quando a fila est� vazia ele retorna false.
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		
		//Ele pega o primeiro elemento da fila tbm n�o remove.
		//Quando a fila est� vazia ele retorna uma exce��o.
		System.out.println(fila.element());
		
		//fila.size(); Ele verifica o tamanho da fila.
		//fila.clear(); Ele limpa elemento da fila.
		//fila.isEmpty(); Ele verifica se a fila est� vazia.
		
		//Ele pega o primeiro elemento da fila j� removendo.
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		//Ele remove elemento da fila parecido com o poll.
		//Se a fila estiver vazia ele retorna uma exce��o.
		System.out.println(fila.remove());
	}
}
