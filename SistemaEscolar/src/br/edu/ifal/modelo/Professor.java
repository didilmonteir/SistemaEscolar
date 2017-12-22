package br.edu.ifal.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Professor {

	private String nome;
	private String formacao;
	@Id
	@GeneratedValue
	private String cpf;


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
