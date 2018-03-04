package br.edu.ifal.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer codigo;
	
	private String nome;
	
	@OneToMany
	private List<Aluno> aluno;
	
	@OneToMany
	private List<Disciplina> disciplina;

	public Curso() {
		super();
		aluno = new ArrayList<>();
		disciplina = new ArrayList<>();
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
	

	public void addDisciplina(Disciplina disciplina) {
		if (disciplina != null) {
			this.disciplina.add(disciplina);
		}
	}

	public void removeDisciplina(Disciplina disciplina) {
		this.disciplina.remove(disciplina);
	}

}
