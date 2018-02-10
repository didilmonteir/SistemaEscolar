package br.edu.ifal.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.edu.ifal.modelo.Disciplina;

public class DiciplinaDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
	EntityManager manager = factory.createEntityManager();

	public void adicionarDiciplina(Disciplina d) { // adiciona novo objeto ao banco
		manager.getTransaction().begin();
		manager.persist(d);
		manager.getTransaction().commit();
		manager.close();
	}

	public Disciplina visualizarDisciplina(String nome) { // visualiza objeto do banco
		manager.getTransaction().begin();
		Disciplina d = manager.find(Disciplina.class, nome);
		manager.getTransaction().commit();
		manager.close();
		return d;
	}

	public void atualizarAluno(Disciplina d) { // atualiza as informacoes do objeto no banco
		manager.getTransaction().begin();
		manager.merge(d);
		manager.getTransaction().commit();
		manager.close();
	}

	public void removerDisciplina(String nome) { // remove aluno do banco
		manager.getTransaction().begin();
		Disciplina d = manager.find(Disciplina.class, nome);
		manager.remove(d);
		manager.getTransaction().commit();
		manager.close();
	}

}
