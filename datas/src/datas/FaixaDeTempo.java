package datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FaixaDeTempo {

	public static void main(String[] args) throws ParseException {
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-09-14"), LocalDate.now());
		
		System.out.println("Possui " + dias);
	}
}
