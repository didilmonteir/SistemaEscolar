package br.edu.ifal.modelo;

import javax.persistence.Column;

public abstract class  Pessoa {
	
	@Column(length = 200, nullable = false, name = "nome_aluno")
	private String nome;

	@Column(length = 200, nullable = false, name = "cpf")
	private String cpf;

}
