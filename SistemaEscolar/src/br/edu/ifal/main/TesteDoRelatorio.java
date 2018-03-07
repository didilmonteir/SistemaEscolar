package br.edu.ifal.main;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifal.modelo.Aluno;
import br.edu.ifal.modelo.Disciplina;
import br.edu.ifal.modelo.Nota;
import br.edu.ifal.servico.Relatorio;

public class TesteDoRelatorio {

	public static void main(String[] args) {

		List<Aluno> la = new ArrayList<>();
		Aluno a1 = new Aluno(4, "Edvald", "011.246.001-22");
		Aluno a2 = new Aluno(1, "Bekinha", "118.666.014-74");
		Aluno a3 = new Aluno(2, "Kelvin mestre dos Hardware", "111.222.333-75");

		la.add(a1);
		la.add(a2);
		la.add(a3);

		Disciplina poo = new Disciplina();

		poo.setNome("Qualidade de software");

		List<Nota> notas = new ArrayList<>();
		notas.add(new Nota(4, a1, poo, 2.5));
		notas.add(new Nota(1, a2, poo, 9.5));
		notas.add(new Nota(2, a3, poo, 7.5));

		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 2.5;
		
		Relatorio r = new Relatorio();
		r.gerar(notas);
		System.out.println(r.getMaiorNota() == maiorNotaEsperada );
		System.out.println(r.getMenorNota() == menorNotaEsperada );

	}

}
