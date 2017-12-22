package br.edu.ifal;

import java.util.List;

public class Curso {

	 private String nome;
	 private List<Aluno> aluno;
	 private List<Disciplina> disciplina;
	
	 public Curso() {
		super();
	 }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getAluno() {
		return aluno;
	}

	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}

	public List<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
	 
	 
	 
	 
}
