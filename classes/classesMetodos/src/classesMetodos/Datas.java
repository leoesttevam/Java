package classesMetodos;

public class Datas {

	public int dia;
	public int mes;
	public int ano;
	
	//Construtor
	Datas() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Datas(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	//Método
	String obterData() {
		return String.format("%d/%d/%d", this.dia, this.mes, this.ano);
	}
	
	void imprimirData() {
		System.out.println(obterData());
	}
}
