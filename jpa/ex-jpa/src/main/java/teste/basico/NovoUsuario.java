package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ex-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = new Usuario("José Alencar", "j.a@gmail.com");
		
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		
		System.out.println("O id gerado foi: " + usuario.getId());
		em.close();
		emf.close();
	}
}
