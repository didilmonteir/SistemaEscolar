package br.edu.ifal.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="escola")
public class Escola {
	@Id
	private Integer codigo;
	private String nome;
	private List<Curso> cursos;
	private List<Professor> professores;
		
	public Escola() {
		super();
		cursos = new ArrayList<>();
		professores = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if (nome != null) {
			this.nome = nome;
		}
	}
	
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		if (cursos != null) {
			this.cursos = cursos;
		}
	}
	public List<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(List<Professor> professores) {
		if (professores != null) {
			this.professores = professores;
		}
	}
	
}
