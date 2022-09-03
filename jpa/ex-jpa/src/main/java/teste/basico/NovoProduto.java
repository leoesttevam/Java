package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		
		Produto prod = new Produto("Monitor 23", 789.98);
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		dao.atomico(prod).fechar();
		
		
	}
}
