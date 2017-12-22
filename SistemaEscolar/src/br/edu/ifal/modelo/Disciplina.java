package br.edu.ifal.modelo;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	
	private String nome;
	private List<Professor>professores;
	private List<Aluno> alunos;
	
	public Disciplina() {
		super();
	
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

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
		
	}

