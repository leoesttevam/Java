package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.Pedido;
import modelo.umpramuitos.ItemPedido;

public class NovoPedido {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Produto produto = new Produto("Geladeira", 2789.99);
		Pedido pedido = new Pedido();
		ItemPedido item = new ItemPedido(10, pedido, produto);
		
		dao.abrirT().incluir(produto).incluir(pedido).incluir(item).fecharT().fechar();
	}
}
