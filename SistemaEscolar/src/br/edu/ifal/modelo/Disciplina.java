package br.edu.ifal.modelo;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "disciplina")
public class Disciplina {

	@Id
	@Column(length = 200, nullable = true)
	private String nome;

	@OneToMany
	private  List<Professor> professor;

	@ManyToMany
	private List<Aluno> alunos;
	
	@OneToMany
	private Set<Assunto> assunto;

	
	public Disciplina() {
		super();
	}

	public Disciplina(String nome, List<Professor> professor, List<Aluno> alunos, Set<Assunto> assunto) {
		super();
		this.nome = nome;
		this.professor = professor;
		this.alunos = alunos;
		this.assunto = assunto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Professor> getProfessor() {
		return professor;
	}

	public void professor (List<Professor> professor) {
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
	

	public void addProfessor(Professor professor) {
		if (professor != null) {
			this.professor.add(professor);
		}
	}

	public void removeProfessor(Professor professor) {
		this.professor.remove(professor);
	}
}
