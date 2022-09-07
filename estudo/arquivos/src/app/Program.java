package app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Leonardo Estevam\\Desktop\\aqr\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) { // Vai verificar se existe uma nova linha no arquivo
				System.out.println(sc.nextLine()); // Se existir ele ira imprimir oq tem no arquivo
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if(sc != null) {
				sc.close();
			}
		}
		
	}
}
