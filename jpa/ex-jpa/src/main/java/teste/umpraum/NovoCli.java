package teste.umpraum;

import infra.DAO;
import umpraum.Assento;
import umpraum.Cliente;

public class NovoCli {

	public static void main(String[] args) {
		
		Assento assento = new Assento("16C");
		Cliente cliente = new Cliente("Ana", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT().incluir(assento).incluir(cliente).fecharT().fechar(); 
	}
}
