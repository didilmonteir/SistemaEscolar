package br.edu.ifal.dao;

import javax.persistence.*;

import br.edu.ifal.modelo.Aluno;

public class AlunoDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Aluno");
	EntityManager manager = factory.createEntityManager();

	public void adicionarAluno(Aluno a) {
		manager.getTransaction().begin();
		manager.persist(a);
		manager.getTransaction().commit();
	}
	

}
