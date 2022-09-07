package app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args) {
		
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		
		String arquivo = "C:\\Users\\Leonardo Estevam\\Desktop\\aqr\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
