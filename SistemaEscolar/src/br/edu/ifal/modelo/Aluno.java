package br.edu.ifal.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "aluno")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer matricula;

	@Column
	private String nome;

	@Column
	private String cpf;

	@Column(name = "data_nascimento")
	private String dataNascimento;

	@Column
	private String nomePai;

	@Column
	private String nomeMae;

	@ManyToMany
	private List<Disciplina> disciplinas;

	public Aluno() { // Contrutor padrao
		super();
		disciplinas = new ArrayList<>();
	}
	

	public Aluno(Integer matricula, String nome, String cpf) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
	}


	public String getNome() { // retorna o nome do aluno
		return nome;
	}

	public void setNome(String nome) { // altera o nome do aluno
		if (nome != null) {
			this.nome = nome;
		}
	}

	public void setMatricula(Integer matricula) {
		if (matricula != null) {
			this.matricula = matricula;
		}
	}

	public Integer getMatricula() { // retorna a matricula
		return matricula;
	}

	public String getCpf() { // retorna o CPF
		return cpf;
	}

	public void setCpf(String cpf) { // altera o CPF
		if (cpf != null) {
			this.cpf = cpf;
		}
	}

	public String getDataNascimento() { // retorna a data de nascimento
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) { // altera a data de nascimento
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

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public void adicionarDisciplina(Disciplina d) {
		if (d != null) {
			this.disciplinas.add(d);
		}
	}

	public void removerDisciplina(Disciplina d) {
		if (d != null) {
			this.disciplinas.remove(d);
		}
	}

}
