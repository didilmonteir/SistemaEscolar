package br.edu.ifal.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifal.modelo.Aluno;

public class DiciplinaDao {

/*
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Diciplina");
		EntityManager manager = factory.createEntityManager();

		public void adicionarDiciplina(Diciplina d) { // adiciona novo objeto ao banco
			manager.getTransaction().begin();
			manager.persist(a);
			manager.getTransaction().commit();
			manager.close();
		}

		public Aluno visualizarDiciplina(String matricula) { // visualiza objeto do banco
			manager.getTransaction().begin();
			Aluno a = manager.find(Diciplina.class, matricula);
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
		}*/

		/*
		 * public List<Aluno> listarAlunos() { // metodo responsavel de listar nome e
		 * matricula manager.getTransaction().begin(); List<Aluno> alunos =
		 * manager.createQuery("select nome,matricula from aluno;").getResultList();
		 * manager.getTransaction().commit(); return alunos; }
		 */

	}
