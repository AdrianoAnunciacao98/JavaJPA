package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class TestandoEstados {

	public static void main(String[] args) {
	
		Conta conta = new Conta();
		conta.setTitular("Almiro");
		conta.setAgencia(1232);
		conta.setNumero(211221);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(conta);
		em.remove(conta);
		
		em.getTransaction().commit();
	}

}
