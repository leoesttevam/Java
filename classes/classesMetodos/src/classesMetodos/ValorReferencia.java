package classesMetodos;

public class ValorReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Datas d1 = new Datas(11, 8, 2022);
		Datas d2 = d1;
		
		d1.dia = 31;
		d1.mes = 12;
		
		d1.ano = 2025;
		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
		
		voltarData(d1);
		voltarData(d2);
		
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
	}
	
	static void voltarData(Datas d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
}
