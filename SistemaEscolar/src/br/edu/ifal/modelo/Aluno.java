package br.edu.ifal.modelo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
@PrimaryKeyJoinColumn(name = "id")
public class Aluno extends Pessoa {

	@Column(length = 8, nullable = false, name = "data_nascimento")
	private String dataNascimento;

	@Column(length = 200, nullable = true, name = "nome_pai")
	private String nomePai;

	@Column(length = 200, nullable = true, name = "nome_mae")
	private String nomeMae;

	@ManyToMany
	private Set<Disciplina> disciplinas;

	@Column(name = "tipo_aluno", nullable = false)
	private TipoAluno tipoAluno;

	public Aluno(Integer id, String nome, String cpf) {
		super(nome, cpf);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplinas == null) ? 0 : disciplinas.hashCode());
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
		Aluno other = (Aluno) obj;
		if (disciplinas == null) {
			if (other.disciplinas != null)
				return false;
		} else if (!disciplinas.equals(other.disciplinas))
			return false;
		return true;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		if (dataNascimento != null) {
			this.dataNascimento = dataNascimento;
		}
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		if (nomePai != null) {
			this.nomePai = nomePai;
		}
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		if (nomeMae != null) {
			this.nomeMae = nomeMae;
		}
	}

	public Set<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Set<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public void adicionarDisciplina(Disciplina d) {
		if (d != null) {
			this.disciplinas.add(d);
		}
	}

	public void removerDisciplina(Disciplina d) {
		if (d != null) {
			this.disciplinas.remove(d);
		}
	}

	public TipoAluno getTipoAluno() {
		return tipoAluno;
	}

	public void setTipoAluno(TipoAluno tipoAluno) {
		this.tipoAluno = tipoAluno;
	}

}
