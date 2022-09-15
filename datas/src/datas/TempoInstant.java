package datas;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;

public class TempoInstant {

	public static void main(String[] args) throws InterruptedException, ParseException {
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println(" Dura��o em nano segundos: " + duracao.toNanos());
		
		System.out.println(" Dura��o em mininutos: " + duracao.toMinutes());
		
		System.out.println(" Dura��o em horas: " + duracao.toHours());
		
		System.out.println(" Dura��o em millesegundos: " + duracao.toMillis());
		
		System.out.println(" Dura��o em dias: " + duracao.toDays());
	}
}
