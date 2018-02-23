package br.edu.ifal.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifal.modelo.Escola;

public class EscolaDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
	EntityManager manager = factory.createEntityManager();

	public void adicionarEscola(Escola e) { // adiciona novo objeto ao banco
		manager.getTransaction().begin();
		manager.persist(e);
		manager.getTransaction().commit();
		manager.close();
	}

	public Escola buscarEscola(Integer codigo) { // visualiza objeto do banco
		manager.getTransaction().begin();
		Escola e = manager.find(Escola.class, codigo);
		manager.getTransaction().commit();
		manager.close();
		return e;
	}

	public void atualizarEscola(Escola e) { // atualiza as informacoes do objeto no banco
		manager.getTransaction().begin();
		manager.merge(e);
		manager.getTransaction().commit();
		manager.close();
	}

	public void removerEscola(Integer codigo) { // remove aluno do banco
		manager.getTransaction().begin();
		Escola e = manager.find(Escola.class, codigo);
		manager.remove(e);
		manager.getTransaction().commit();
		manager.close();
	}

}
