package br.edu.ifal.modelo;

import br.edu.ifal.dao.AlunoDao;

public class Main {

	public static void main(String[] args) {
		AlunoDao dao = new AlunoDao();
		Aluno aluno = new Aluno();
		aluno.setNome("Luke");
		aluno.setCpf("000.00.000-01");
		aluno.setDataNascimento("01/01/2010");
		
		aluno.setNomeMae("Padme");
		aluno.setNomePai("Anakin");
		dao.adicionarAluno(aluno);
		
	}

}
