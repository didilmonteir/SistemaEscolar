package br.edu.ifal.modelo;

import javax.persistence.Column;

public abstract class  Pessoa {
	
	@Column(length = 200, nullable = false, name = "nome_aluno")
	private String nome;

	@Column(length = 200, nullable = false, name = "cpf")
	private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null) {
			this.nome = cpf;
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
