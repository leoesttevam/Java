package datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendario {

	public static void main(String[] args) {
		
		Calendar calendario = Calendar.getInstance();
		
		System.out.println("Calendario em millisegundos: " + calendario.getTimeInMillis());
		
		System.out.println("Dia do mês: " + calendario.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Dia da semana: " + calendario.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("Mês: " + (calendario.get(Calendar.MONTH) + 1));
		
		System.out.println("Ano: " + calendario.get(Calendar.YEAR));
		
		System.out.println("Hora do dia: " + calendario.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Minuto da hora: " + calendario.get(Calendar.MINUTE));
		
		System.out.println("Segundos: " + calendario.get(Calendar.SECOND));
		
		// Simple Date Format
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				
		System.out.println("Data Atual em formato padrão em String: " + sdf.format(Calendar.getInstance().getTime()));
				
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				
		System.out.println("Data em formato para banco de dados: " + sdf.format(calendario.getTime()));
	}
}
