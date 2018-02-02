package br.edu.ifal.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifal.modelo.Aluno;
import br.edu.ifal.modelo.Professor;

public class ProfessorDao {
	
		Professor professor = new Professor();
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Professor");
		EntityManager manager = factory.createEntityManager();
		
		public void adicionarProfessor(Professor p) { // adiciona novo objeto ao banco
			manager.getTransaction().begin();
			manager.persist(p);
			manager.getTransaction().commit();
			manager.close();
		}

		public Professor exibirProfessor(String cpf) { // visualiza objeto do banco
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

		public void removerRemover(String cpf) { // remove aluno do banco
			manager.getTransaction().begin();
			Aluno a = manager.find(Aluno.class, cpf);
			manager.remove(a);
			manager.getTransaction().commit();
			manager.close();
		}
}
