package umpraum;

import infra.DAO;

public class ObterCliente {

	public static void main(String[] args) {
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
		Cliente cliente = dao.obterPorId(1L);
		System.out.println(cliente.getAssento().getNome());
		
		System.out.println(cliente.getAssento().getCliente().getNome() );
		
		dao.fechar();
		
		
		DAO<Assento> as = new DAO<>(Assento.class);
		Assento assento = as.obterPorId(2L);
		
		System.out.println(assento.getCliente().getNome());
		
		as.fechar();
	}
}
 