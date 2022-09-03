package classesMetodos;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook");
		//p1.nome = "Notebook";
		p1.preco = 4356.89;
		
		var p2 = new Produto("TV");
		//p2.nome = "TV";
		p2.preco = 1300.99;
		
		Produto.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoDesconto();
		double precoFinal2 = p2.precoDesconto();
		System.out.println((precoFinal1 + precoFinal2) / 2);
	}
}
