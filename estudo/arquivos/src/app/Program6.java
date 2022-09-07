package app;

import java.io.File;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digit o caminho do arquivo: ");
		String arq = sc.nextLine();
		
		File arquivo = new File(arq);
		
		System.out.println("getName: " + arquivo.getName());
		System.out.println("getParent: " + arquivo.getParent());
		
		sc.close();
	}
}
