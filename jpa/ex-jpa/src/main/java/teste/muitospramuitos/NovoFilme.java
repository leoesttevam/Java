package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilme {

	public static void main(String[] args) {
		
		Filme as = new Filme("The walking dead", 9.3);
		
		Ator ps = new Ator("Derick");
		Ator p3 = new Ator("Maggi");
		
		as.adicionarAtor(ps);
		as.adicionarAtor(p3);
		
		DAO<Filme> dao = new DAO<>();
		dao.atomico(as);
		
	}
}
