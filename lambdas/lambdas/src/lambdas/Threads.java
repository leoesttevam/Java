package lambdas;

public class Threads {

	public static void main(String[] args) {
		
		Runnable t1 = new Trabalho();
		Runnable t2 = new Runnable() {
			
			public void run() {
				for(int i =0; i < 100; i++) {
					System.out.println("Tarefa #02");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						
					}
				}	
			}
		};
		
		Runnable t3 = () -> {
			for(int i =0; i < 100; i++) {
				System.out.println("Tarefa #03");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					
				}
			}
		};
		
		Thread a = new Thread(t1);
		Thread b = new Thread(t2);
		Thread c = new Thread(t3);
		
		
		a.start();
		b.start();
		c.start();
	}
	
	static void t3() {
		for(int i =0; i < 100; i++) {
			System.out.println("Tarefa #03");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
	}
}
