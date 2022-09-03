package teste.basico;

import java.util.List;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {
		
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> prods = dao.obterTodos();
		
		for(Produto prod: prods) {
			System.out.println("ID: " + prod.getId() + " Nome: " + prod.getNome() + " Preço: " + prod.getPreco());
		}
		
		double precoTotal = prods
				.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, (t, p) -> t + p)
				.doubleValue();
		System.out.println("O valor total é R$ " + precoTotal);
	}
}
