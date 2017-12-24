package br.edu.ifal.modelo;

import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name = "aluno")
public class Aluno {

	@Id
	private String matricula;
	@Column
	private String nome;
	@Column
	private String cpf;
	@Temporal(TemporalType.DATE)
	@Column(name = "data_nascimento", nullable = true)
	private Calendar dataNascimento;
	@Column
	private String nomePai;
	@Column
	private String nomeMae;

	public Aluno() { // Contrutor padrão

	}

	// Construtor de sobrecarga com recebimento de parametros
	public Aluno(String nome, String matricula, String cpf, Calendar dataNascimento, String nomePai, String nomeMae) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
	}

	public String getNome() { // retorna o nome do aluno
		return nome;
	}

	public void setNome(String nome) { // altera o nome do aluno
		if (nome != null) {
			this.nome = nome;
		}
	}

	public String getMatricula() { // retorna a matricula
		return matricula;
	}

	public void setMatricula(String matricula) { // altera a matricula
		if (nome != null) {
			this.matricula = matricula;
		}
	}

	public String getCpf() { // retorna o CPF
		return cpf;
	}

	public void setCpf(String cpf) { // altera o CPF
		if (cpf != null) {
			this.cpf = cpf;
		}
	}

	public Calendar getDataNascimento() { // retorna a data de nascimento
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) { // altera a data de nascimento
		if (dataNascimento != null) {
			this.dataNascimento = dataNascimento;
		}
	}

	public String getNomePai() { // retorna o nome do pai
		return nomePai;
	}

	public void setNomePai(String nomePai) { // altera o nome do pai
		if (nomePai != null) {
			this.nomePai = nomePai;
		}
	}

	public String getNomeMae() { // retorna o nome do mae
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) { // altera o nome do mae
		if (nomeMae != null) {
			this.nomeMae = nomeMae;
		}
	}

}
