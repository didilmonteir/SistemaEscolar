package br.edu.ifal.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Disciplina {

	@Id
	private String nome;
	
	@ManyToOne
	private Professor professor;
	
	@ManyToMany
	private List<Aluno> alunos;

	public Disciplina() {
		super();
		alunos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
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
