package datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataEHora {

	public static void main(String[] args) throws ParseException{
		
		LocalDate data = LocalDate.now();
		System.out.println("Data Atual: " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalTime hora = LocalTime.now();
		System.out.println("Hora Atual: " + hora.format(DateTimeFormatter.ofPattern("HH:mm")));
		
		LocalDateTime dh = LocalDateTime.now();
		System.out.println("Data e Hora Atual: " + dh.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
	}
}
