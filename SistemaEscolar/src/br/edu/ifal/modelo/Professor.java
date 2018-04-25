package br.edu.ifal.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "professor")
@PrimaryKeyJoinColumn(name = "id")
public class Professor extends Pessoa {

	@Column(nullable = false, name = "formacao")
	private String formacao;

	@Column(name = "tipo_professor", nullable = false)
	private TipoProfessor tipoProfessor;

	public Professor(String nome, String cpf) {
		super(nome, cpf);
	}

	public Professor(String nome, String cpf, String formacao, TipoProfessor tipoProfessor) {
		super(nome, cpf);
		this.formacao = formacao;
		this.tipoProfessor = tipoProfessor;
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
