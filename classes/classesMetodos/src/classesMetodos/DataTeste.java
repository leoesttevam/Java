package classesMetodos;

public class DataTeste {

	public static void main(String[] args) {
		
		Datas data = new Datas();
		
		var d2 = new Datas();
		d2.dia = 31;
		d2.mes = 12;
		d2.ano = 2021;
		
		System.out.println(data.obterData());
		System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);
	}
}
