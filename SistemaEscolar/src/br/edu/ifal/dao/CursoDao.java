package br.edu.ifal.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifal.modelo.Curso;

public class CursoDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
	EntityManager manager = factory.createEntityManager();

	public void adicionarCurso(Curso c) { // adiciona novo objeto ao banco
		manager.getTransaction().begin();
		manager.persist(c);
		manager.getTransaction().commit();
		manager.close();
	}

	public Curso buscarCurso(Integer codigo) { // visualiza objeto do banco
		manager.getTransaction().begin();
		Curso c = manager.find(Curso.class, codigo);
		manager.getTransaction().commit();
		manager.close();
		return c;
	}

	public void atualizarCurso(Curso c) { // atualiza as informacoes do objeto no banco
		manager.getTransaction().begin();
		manager.merge(c);
		manager.getTransaction().commit();
		manager.close();
	}

	public void removerCurso(Integer codigo) { // remove objeto do banco
		manager.getTransaction().begin();
		Curso c = manager.find(Curso.class, codigo);
		manager.remove(c);
		manager.getTransaction().commit();
		manager.close();
	}
}