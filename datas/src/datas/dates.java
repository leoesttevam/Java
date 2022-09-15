package datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dates {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Date data = new Date();
		
		System.out.println("Data em millisegundos: " + data.getTime());
		
		System.out.println("Dia do mês: " + data.getDate());
		
		System.out.println("Mês: " + (data.getMonth() + 1));
		
		System.out.println("Ano: " + (data.getYear() + 1900));
		
		System.out.println("Hora do dia: " + data.getHours());
		
		System.out.println("Minuto da hora: " + data.getMinutes());
		
		System.out.println("Segundos: " + data.getSeconds());
		
		
		// Simple Date Format
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Data Atual em formato padrão em String: " + sdf.format(data));
		
		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("Data em formato para banco de dados: " + sdf.format(data));
		
	}
}
