package br.edu.ifal.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Disciplina {

	@Id
	private String nome;
	@Column
	private List<Professor> professores;
	@Column
	private List<Aluno> alunos;

	public Disciplina() {
		super();
		professores = new ArrayList<>();
		alunos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Professor> getProfessor() {
		return professores;
	}

	public void setProfessor(List<Professor> professor) {
		this.professores = professor;
	}

	public void removerProfessor(Professor professor) {
		professores.remove(professor);
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> aluno) {
		this.alunos = aluno;
	}

	public void addAluno(Aluno aluno) {
		if (aluno != null) {
			this.alunos.add(aluno);
		}
	}

	public void removeAluno(Aluno aluno) {
		this.alunos.remove(aluno);
	}
}
