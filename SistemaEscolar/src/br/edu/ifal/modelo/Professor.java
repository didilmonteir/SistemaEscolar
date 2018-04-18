package br.edu.ifal.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
@PrimaryKeyJoinColumn(name = "pessoa_id")
public class Professor extends Pessoa {

	@Id
	@Column(length = 11, nullable = false, name = "cpf")
	private String numeroCadastro;

	@Column(length = 80, nullable = false, name = "formacao")
	private String formacao;

	@Column(name = "tipo_professor", nullable = false)
	private TipoProfessor tipoProfessor;

	public Professor() {
		super();
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		if (formacao != null) {
			this.formacao = formacao;
		}
	}

	public TipoProfessor getTipoProfessor() {
		return tipoProfessor;
	}

	public void setTipoProfessor(TipoProfessor tipoProfessor) {
		this.tipoProfessor = tipoProfessor;
	}

}
