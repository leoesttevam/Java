package lambdas;

public class Trabalho implements Runnable{

	@Override
	public void run() {
		for(int i =0; i < 100; i++) {
			System.out.println("Tarefa #01");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				
			}
		}
	}

}
