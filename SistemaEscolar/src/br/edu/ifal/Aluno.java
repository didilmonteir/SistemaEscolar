package br.edu.ifal;

public class Aluno {

	private String nome;
	private String matricula;
	private String cpf;
	private String dataNascimento;
	private String nomePai;
	private String nomeMae;

	public Aluno() {
		this.nome = "";
		this.matricula = "";

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome != null) {
			this.nome = nome;
		}
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if (nome != null) {
			this.matricula = matricula;
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

}
