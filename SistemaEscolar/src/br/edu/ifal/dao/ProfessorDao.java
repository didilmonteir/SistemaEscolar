package br.edu.ifal.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifal.modelo.Professor;

public class ProfessorDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
	EntityManager manager = factory.createEntityManager();

	public void adicionarProfessor(Professor p) { // adiciona novo objeto ao banco
		manager.getTransaction().begin();
		manager.persist(p);
		manager.getTransaction().commit();
		manager.close();
	}

	public Professor buscarProfessor(String cpf) { // visualiza objeto do banco
		manager.getTransaction().begin();
		Professor p = manager.find(Professor.class, cpf);
		manager.getTransaction().commit();
		manager.close();
		return p;
	}

	public void atualizarProfessor(Professor p) { // atualiza as informacoes do objeto no banco
		manager.getTransaction().begin();
		manager.merge(p);
		manager.getTransaction().commit();
		manager.close();
	}

	public void removerProfessor(String cpf) { // remove aluno do banco
		manager.getTransaction().begin();
		Professor p = manager.find(Professor.class, cpf);
		manager.remove(p);
		manager.getTransaction().commit();
		manager.close();
	}
}
