package br.edu.ifal.dao;

//import java.util.List;

import javax.persistence.*;

import br.edu.ifal.modelo.Aluno;

public class AlunoDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Aluno");
	EntityManager manager = factory.createEntityManager();

	public void adicionarAluno(Aluno a) { // adiciona novo objeto ao banco
		manager.getTransaction().begin();
		manager.persist(a);
		manager.getTransaction().commit();
		manager.close();
	}

	public Aluno visualizarAluno(String matricula) { // visualiza objeto do banco
		manager.getTransaction().begin();
		Aluno a = manager.find(Aluno.class, matricula);
		manager.getTransaction().commit();
		manager.close();
		return a;
	}

	public void atualizarAluno(Aluno a) { // atualiza as informacoes do objeto no banco
		manager.getTransaction().begin();
		manager.merge(a);
		manager.getTransaction().commit();
		manager.close();
	}

	public void removerAluno(String matricula) { // remove aluno do banco
		manager.getTransaction().begin();
		Aluno a = manager.find(Aluno.class, matricula);
		manager.remove(a);
		manager.getTransaction().commit();
		manager.close();
	}


}
