package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) {
		
		String arquivo = "C:\\Users\\Leonardo Estevam\\Desktop\\aqr\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))){
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
