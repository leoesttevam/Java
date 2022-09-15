package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ParcelasEmDatas {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int boleto = 0;
		double valor = 0;
		double soma = 0;
		
		Date data = new SimpleDateFormat("dd/MM/yyyy").parse("14/09/2022");
		
		System.out.println("Digite o valor do produto: ");
		valor = sc.nextDouble();
		
		System.out.println("Digite a quantidade de parcelas: ");
		boleto = sc.nextInt();
		
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(data);
		
		soma = valor / boleto;
		
		System.out.println("Valor do produto: " + valor + " Númmero de parcela " + boleto);
		System.out.printf("Valor da parcela %.2f", soma);
		System.out.println();
		
		for(int parcela = 1; parcela <= boleto; parcela++) {
			calendario.add(Calendar.MONTH, 1);
			
			System.out.println("Parcela número: " + parcela + " vencimento em: " + new SimpleDateFormat("dd/MM/yyyy").format(calendario.getTime()));
		}
		
		sc.close();
	}
}
