package br.edu.ifal.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifal.modelo.Nota;

public class NotaDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
	EntityManager manager = factory.createEntityManager();

	public void adicionarNota(Nota n) { // adiciona novo objeto ao banco
		manager.getTransaction().begin();
		manager.persist(n);
		manager.getTransaction().commit();
		manager.close();
	}

	public Nota buscarNota(int matricula) { // visualiza objeto do banco
		manager.getTransaction().begin();
		Nota n = manager.find(Nota.class, matricula);
		manager.getTransaction().commit();
		manager.close();
		return n;
	}

	public void atualizarNota(Nota n) { // atualiza as informacoes do objeto no banco
		manager.getTransaction().begin();
		manager.merge(n);
		manager.getTransaction().commit();
		manager.close();
	}

	public void removerNota(int nota) { // remove aluno do banco
		manager.getTransaction().begin();
		Nota n = manager.find(Nota.class, nota);
		manager.remove(n);
		manager.getTransaction().commit();
		manager.close();
	}


}



