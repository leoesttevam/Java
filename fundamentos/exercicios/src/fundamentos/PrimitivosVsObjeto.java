package fundamentos;

public class PrimitivosVsObjeto {

	public static void main(String[] args) {
		
		String s = new String("Texto");
		s.toUpperCase();
		
		//Wrappers s�o a vers�o objetos dos tipos Primitivos
		int a = 123;
		System.out.println(a);
	}
}
