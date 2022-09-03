package teste.consultas;

import infra.DAO;
import modelo.consulta.NotaFilme;

public class ObterMedia {

	public static void main(String[] args) {
		
		DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
		NotaFilme nota = dao.consultarUm("mediaGeral");
		
		System.out.println(nota.getMedia());
		
		dao.fechar();
	}
}