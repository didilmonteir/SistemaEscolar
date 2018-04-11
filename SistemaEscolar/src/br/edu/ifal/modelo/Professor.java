package br.edu.ifal.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="professor")
public class Professor {

	@Id
	@Column(length = 11, nullable = false, name = "cpf")
	private String cpf;

	@Column(length = 200, nullable = false, name = "nome_professors")
	private String nome;
	@Column(length = 80, nullable=false, name = "formacao")
	private String formacao;
	@Column(name = "tipo_professor", nullable = false)
	private TipoProfessor tipoProfessor;

	public enum TipoProfessor{
		SUBSTITUTO,
		EFETIVO,
	}
	
	public Professor() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null) {
			this.nome = nome;
		}
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		if (formacao != null) {
			this.formacao = formacao;
		}

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf != null) {
			this.cpf = cpf;
		}
	}


}
