package br.edu.ifal.servico;

import br.edu.ifal.modelo.Aluno;
import br.edu.ifal.modelo.Disciplina;
import br.edu.ifal.modelo.Nota;

public class GerenciadorDeNotas {

	private Nota nota;

	public boolean setarNotas(double valorNota, Aluno aluno, Disciplina disciplina) {
		if (valorNota < 0 || valorNota > 10 || aluno == null || disciplina == null) {
			return false;
		} else {
			nota = new Nota(10, aluno, disciplina, valorNota);
			return true;
		}
	}

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}

}
