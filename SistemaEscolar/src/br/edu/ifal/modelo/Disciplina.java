package br.edu.ifal.modelo;

import java.util.List;

public class Disciplina {
	
	private String nome;
	private String professor;
	private List<alunos> Alunos;
	
	public Disciplina() {
		super();
		this.nome = "";
		this.professor = "";
		this.alunos = "";
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getAlunos() {
		return alunos;
	}

	public void setAlunos(String alunos) {
		this.alunos = alunos;
	}
	
	// adicionar e remover da lista
			public void addDiciplinas(Disciplina disciplina) {
				if (disciplina!=null) {
					this.disciplina.add(disciplina);
				}	
			}
			public void removeDiciplina(Disciplina disciplina ) {
				this.disciplina.remove(disciplina);
			}
			
			
			public void addDic(Alunos alunos) {
				if (alunos!=null) {
					this.alunos.add(alunos);
				}	
			}
			public void removeDiciplina(Alunos alunos ) {
				this.alunos.remove(alunos);
			}

	}

