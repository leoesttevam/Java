package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalculoData {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendario = Calendar.getInstance(); //Pega a data atual
		
		calendario.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("14-09-2022"));
		
		calendario.add(Calendar.DAY_OF_MONTH, 40);
		System.out.println("Somando 0 dia do mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendario.getTime()));
		
		calendario.add(Calendar.MONTH, 1);
		System.out.println("Somando o mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendario.getTime()));
		
		calendario.add(Calendar.YEAR, 1);
		System.out.println("Somando 1 anos: " + new SimpleDateFormat("dd-MM-yyyy").format(calendario.getTime()));
	}
}
