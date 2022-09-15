package thread;

import javax.swing.JOptionPane;

public class CriandoThread {

	public static void main(String[] args) {
		
		new Thread() {
			
			public void run() { //Executa o que queremos.
				
				//Código da rotina que eu quero executar em paralelo.
				for(int pos = 1; pos < 11; pos++) {
					//Quero executar esse envio com o tempo determinado
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						
						System.out.println(e.getMessage());
					}
					System.out.println("Envio de E-mail " + pos);;
				}
				
			}
			
		}.start(); //Liga a thread que fica processando por tras do sistema
		
		JOptionPane.showMessageDialog(null, "Sistema executando para o usuário");
	}
}
