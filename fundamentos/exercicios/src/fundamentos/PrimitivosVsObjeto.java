package fundamentos;

public class PrimitivosVsObjeto {

	public static void main(String[] args) {
		
		String s = new String("Texto");
		s.toUpperCase();
		
		//Wrappers são a versão objetos dos tipos Primitivos
		int a = 123;
		System.out.println(a);
	}
}
