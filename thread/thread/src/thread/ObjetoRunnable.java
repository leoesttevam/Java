package thread;

import javax.swing.JOptionPane;

public class ObjetoRunnable {

	public static void main(String[] args) {
		
		Thread mail = new Thread(tree1);
		mail.start();
			
		
		JOptionPane.showMessageDialog(null, "Sistema executando para o usuário");
	}
	
	private static Runnable tree1 = new Runnable() {
		
		@Override
		public void run() {
				
				for(int pos = 1; pos < 11; pos++) {
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						
						System.out.println(e.getMessage());
					}
					System.out.println("Envio de E-mail " + pos);;
				}
		}
	};
}
