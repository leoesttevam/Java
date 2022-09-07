package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {

	public static void main(String[] args) {
		
		String arquivo = "C:\\Users\\Leonardo Estevam\\Desktop\\aqr\\in.txt";
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(arquivo);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if(br != null);
						br.close();
				if(fr != null)
						fr.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
