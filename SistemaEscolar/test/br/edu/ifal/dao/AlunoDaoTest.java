package br.edu.ifal.dao;

import br.edu.ifal.modelo.Aluno;

public class AlunoDaoTest {

	private Aluno aluno;
	private AlunoDao alunoDao;
	
	public void salvaAlunoNoBanco() {
		aluno = new Aluno("José", "12345678901");
		
	}
}
