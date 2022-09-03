package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoveUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ex-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario us = em.find(Usuario.class, 1L);
		
		if(us != null) {
			em.getTransaction().begin();
			em.remove(us);
			em.getTransaction().commit(); 
		}
		
		em.close();
		emf.close();
	}
}
