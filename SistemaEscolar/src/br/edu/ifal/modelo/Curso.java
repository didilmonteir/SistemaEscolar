package br.edu.ifal.modelo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "curso")
public class Curso {

	@Id
	@GeneratedValue(generator = "inc")
	@GenericGenerator(name = "inc", strategy = "increment")
	private Integer codigo;

	@Column(length = 50, nullable = false, name = "nome")
	private String nome;

	@OneToMany
	private Set<Aluno> aluno;

	@OneToMany
	private Set<Disciplina> disciplina;

	public Curso(Integer codigo, String nome, Set<Aluno> aluno, Set<Disciplina> disciplina) {
		this.codigo = codigo;
		this.nome = nome;
		this.aluno = aluno;
		this.disciplina = disciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(Set<Aluno> aluno) {
		this.aluno = aluno;
	}

	public void adicionarAluno(Aluno a) {
		aluno.add(a);
	}

	public void removerAluno(Aluno a) {
		aluno.remove(a);
	}

	public Set<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Set<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}

	public void adicionarDisciplina(Disciplina disciplina) {
		if (disciplina != null) {
			this.disciplina.add(disciplina);
		}
	}

	public void removeDisciplina(Disciplina disciplina) {
		this.disciplina.remove(disciplina);
	}

}
