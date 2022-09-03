package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		
		//Tipos Primitivos
		byte ba = 100;
		short sa = 1000;
		int ia = 10000;
		long la = 10000L;
		
		//Tipos Wrapper vers�o orientado ao objeto
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 10000L;
		
		System.out.println(b.byteValue() + ba + sa + ia + la + s + i + l);
	}
}
