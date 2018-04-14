package br.edu.ifal.modelo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("professor")
public class Professor extends Pessoa{

	@Id
	@Column(length = 11, nullable = false, name = "cpf")
	private String numeroCadastro;

	@Column(length = 80, nullable=false, name = "formacao")
	private String formacao;

	public Professor() {
		super();
	}
	@Column(name = "tipo_professor", nullable = false)
	private TipoProfessor tipoProfessor;

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
