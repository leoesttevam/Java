package app;

import java.io.File;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho da pasta: ");
		String arquivo = sc.nextLine();
		
		File arq = new File(arquivo);
		
		File[] pasta = arq.listFiles(File::isDirectory);
		
		System.out.println("Pastas: ");
		for(File pastas : pasta) {
			System.out.println(pastas);
		}
		
		File[] files = arq.listFiles(File::isFile);
		System.out.println("Pastas: ");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean sucess = new File(arq + "\\subdir").mkdir();
		System.out.println("Pasta Criado com sucesso: " + sucess);
		
		sc.close();
	}
}
