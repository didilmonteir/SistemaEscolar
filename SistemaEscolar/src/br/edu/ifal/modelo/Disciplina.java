package br.edu.ifal.modelo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "disciplina")
public class Disciplina {

	@Id
	@Column(length = 200, nullable = true)
	private String nome;

	@OneToMany
	private  Set<Professor> professor;

	@ManyToMany
	private Set<Aluno> alunos;
	
	@OneToMany
	private Set<Assunto> assunto;

	
	public Disciplina() {
		super();
	}

	public Disciplina(String nome, Set<Professor> professor, Set<Aluno> alunos, Set<Assunto> assunto) {
		super();
		this.nome = nome;
		this.professor = professor;
		this.alunos = alunos;
		this.assunto = assunto;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alunos == null) ? 0 : alunos.hashCode());
		result = prime * result + ((assunto == null) ? 0 : assunto.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((professor == null) ? 0 : professor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (alunos == null) {
			if (other.alunos != null)
				return false;
		} else if (!alunos.equals(other.alunos))
			return false;
		if (assunto == null) {
			if (other.assunto != null)
				return false;
		} else if (!assunto.equals(other.assunto))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (professor == null) {
			if (other.professor != null)
				return false;
		} else if (!professor.equals(other.professor))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Professor> getProfessor() {
		return professor;
	}

	public void professor (Set<Professor> professor) {
		this.professor = professor;
	}

	public Set<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Set<Aluno> aluno) {
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
