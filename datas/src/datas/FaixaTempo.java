package datas;

import java.time.LocalDate;
import java.time.Period;

public class FaixaTempo {

	public static void main(String[] args) {
		
		LocalDate dataAntiga = LocalDate.of(1992, 9, 17);
		
		LocalDate dataNova = LocalDate.of(2022, 9, 15);
		
		System.out.println("Data antiga e maior que data nova: " + dataAntiga.isAfter(dataNova));
		
		System.out.println("Data antiga e anterior a nova: " + dataAntiga.isBefore(dataNova));
		
		System.out.println("Datas são iguais: " + dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias: " + periodo.getDays());
		
		System.out.println("Quantos meses: " + periodo.getMonths());
		
		System.out.println("Quantos anos: " + periodo.getYears());
		
		System.out.println("Periodo é: " + periodo.getYears() + " Anos " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias");
	}
	
}
