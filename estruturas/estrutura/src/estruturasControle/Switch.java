package estruturasControle;

public class Switch {

	public static void main(String[] args) {
		
		 //Switch sem break
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan...");
		case "roxa":
			System.out.println("Sei o Heian Godan...");
		case "verde":
			System.out.println("Sei o Heian Yodan...");
		case "laranja":
			System.out.println("Sei o Heian Sandan...");
		case "vermelha":
			System.out.println("Sei o Heian Nidan...");
		case "amarela":
			System.out.println("Sei o Heian Shodan...");
		default:
			System.out.println("N�o sei de nada");
		}
	}
}
