package br.edu.ifal;

public class Aluno {

	private String nome;
	private String matricula;

	public Aluno() {
		this.nome ="";
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

}
