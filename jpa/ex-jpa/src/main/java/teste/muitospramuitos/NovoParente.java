package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoParente {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Tio tia1 = new Tio("Maria");
		Tio tia2 = new Tio("Renato");
		
		Sobrinho sob = new Sobrinho("Junior");
		Sobrinho sob1 = new Sobrinho("Matheus");
		
		tia1.getSobrinhos().add(sob);
		sob.getTios().add(tia1);
		
		tia2.getSobrinhos().add(sob1);
		sob1.getTios().add(tia2);
		
		dao.abrirT().incluir(tia1).incluir(tia2).incluir(sob).incluir(sob1).fecharT().fechar();
	}
}
