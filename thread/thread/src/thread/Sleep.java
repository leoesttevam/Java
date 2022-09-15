package thread;

public class Sleep {

	//Tempo de interrupção com Sleep
	public static void main(String[] args) throws InterruptedException {
		
		for(int pos = 1; pos < 10; pos++) {
			//Quero executar esse envio com o tempo determinado
			Thread.sleep(2000);
			System.out.println("Envio de E-mail " + pos);;
		}
		
		System.out.println("Fim!");
	}
}
