package classesMetodos;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(10);
		//a.pi = 10;
		System.out.println(a.area());
		
		AreaCirc b = new AreaCirc(5);
		//b.pi = 10;
		System.out.println(b.area());
		
		System.out.println(AreaCirc.PI);
	}
}
