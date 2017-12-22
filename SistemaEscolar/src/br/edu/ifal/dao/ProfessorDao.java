package br.edu.ifal.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifal.modelo.Professor;

public class ProfessorDao {
	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.setNome("Tia Priscylla");
		professor.setFormacao("Mestre em ciência da computação");
		professor.setCpf("111222333");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("professor");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(professor);
		manager.getTransaction().commit();
		
		System.out.println("Cpf do professo: "+ professor.getCpf());
		
		Professor encontrado = manager.find(Professor.class, 1L);
		System.out.println(encontrado.getNome());
		
		 manager.getTransaction().begin();
         manager.remove(encontrado);
         manager.getTransaction().commit();
		
         manager.close();
		
	}
}
