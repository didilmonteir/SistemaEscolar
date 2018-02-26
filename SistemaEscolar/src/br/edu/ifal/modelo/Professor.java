package br.edu.ifal.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="professor")
public class Professor {

	@Id
	private String cpf;
	@Column
	private String nome;
	@Column
	private String formacao;

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
