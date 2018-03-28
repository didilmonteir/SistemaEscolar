package br.edu.ifal.servico;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.edu.ifal.modelo.Aluno;
import br.edu.ifal.modelo.Disciplina;
import br.edu.ifal.modelo.Nota;
import br.edu.ifal.modelo.Professor;;

public class RelatorioTest {
	
	private List<Aluno> alunos;
	private Disciplina disciplina;
	private Professor professor;
	private List<Nota> notas;
	private Relatorio relatorio;
	
	
	public void criacaoDasEntidadesParaOsTestes() {
		this.alunos = new ArrayList<>();
		this.disciplina = new Disciplina();
		this.notas = new ArrayList<>();
		this.professor= new Professor();
		this.relatorio = new Relatorio();
	}
	
	@Test
	public void deveFuncionarNaOrdemAleatoria() {
		criacaoDasEntidadesParaOsTestes();
		
		Aluno a1 = new Aluno(4, "Edvald", "011.246.001-22");
		Aluno a2 = new Aluno(1, "Bekinha", "118.666.014-74");
		Aluno a3 = new Aluno(2, "Kelvin mestre dos Hardware", "111.222.333-75");

		this.alunos.add(a1);
		this.alunos.add(a2);
		this.alunos.add(a3);

		disciplina.setNome("Qualidade de software");

		
		notas.add(new Nota(4, a1, disciplina, 2.5));
		notas.add(new Nota(1, a2, disciplina, 9.5));
		notas.add(new Nota(2, a3, disciplina, 7.5));

		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 2.5;

		relatorio.gerar(notas);
		// System.out.println(r.getMaiorNota() == maiorNotaEsperada );
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0.001);
		// System.out.println(r.getMenorNota() == menorNotaEsperada );
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(), 0.001);

	}

	@Test
	public void deveFuncionarNaOrdemCrescente() {
		criacaoDasEntidadesParaOsTestes();
		
		Aluno a1 = new Aluno(4, "Edvald", "011.246.001-22");
		Aluno a2 = new Aluno(1, "Bekinha", "118.666.014-74");
		Aluno a3 = new Aluno(2, "Kelvin mestre dos Hardware", "111.222.333-75");

		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);


		D.setNome("Qualidade de software");

		List<Nota> notas = new ArrayList<>();
		notas.add(new Nota(4, a1, poo, 2.5));
		notas.add(new Nota(1, a2, poo, 7.5));
		notas.add(new Nota(2, a3, poo, 9.5));

		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 2.5;

		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);
		// System.out.println(r.getMaiorNota() == maiorNotaEsperada );
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0.001);
		// System.out.println(r.getMenorNota() == menorNotaEsperada );
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(), 0.001);

	}

	@Test
	public void deveFuncionarNaOrdemDecrescente() {
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
		notas.add(new Nota(4, a1, poo, 9.5));
		notas.add(new Nota(1, a2, poo, 7.5));
		notas.add(new Nota(2, a3, poo, 2.5));

		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 2.5;

		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);
		// System.out.println(r.getMaiorNota() == maiorNotaEsperada );
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0.001);
		// System.out.println(r.getMenorNota() == menorNotaEsperada );
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(), 0.001);

	}

	@Test
	public void deveFuncionarComUmaUnicaNota() {
		List<Aluno> la = new ArrayList<>();
		Aluno a1 = new Aluno(4, "Edvald", "011.246.001-22");

		la.add(a1);

		Disciplina poo = new Disciplina();

		poo.setNome("Qualidade de software");

		List<Nota> notas = new ArrayList<>();
		notas.add(new Nota(4, a1, poo, 2.5));

		double maiorNotaEsperada = 2.5;
		double menorNotaEsperada = 2.5;

		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);
		// System.out.println(r.getMaiorNota() == maiorNotaEsperada );
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0.001);
		// System.out.println(r.getMenorNota() == menorNotaEsperada );
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(), 0.001);

	}

	@Test
	public void deveFuncionarDaIdentificaoDasTresMaioresNotas() {
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
		notas.add(new Nota(4, a1, poo, 8.0));
		notas.add(new Nota(1, a2, poo, 10.0));
		notas.add(new Nota(2, a3, poo, 9.0));

		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);

		int quantidadeDeNotasEsperadas = 3;
		double primeiraNotaEsperada = 10.0;
		double segundaNotaEsperada = 9.0;
		double terceiraNotaEsperada = 8.0;

		assertEquals(quantidadeDeNotasEsperadas, relatorio.getTop3Notas().size());
		assertEquals(primeiraNotaEsperada, relatorio.getTop3Notas().get(0).getValor(), 0000.1);
		assertEquals(segundaNotaEsperada, relatorio.getTop3Notas().get(1).getValor(), 0000.1);
		assertEquals(terceiraNotaEsperada, relatorio.getTop3Notas().get(2).getValor(), 0000.1);

		System.out.println();
	}

	@Test
	public void deveFuncionarDaIdentificaoDeUmaNota() {
		List<Aluno> la = new ArrayList<>();

		Aluno a1 = new Aluno(4, "Edvald", "011.246.001-22");

		Disciplina poo = new Disciplina();

		poo.setNome("Qualidade de software");

		List<Nota> notas = new ArrayList<>();
		notas.add(new Nota(4, a1, poo, 8.0));

		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);

		int quantidadeDeNotasEsperadas = 1;
		double primeiraNotaEsperada = 8.0;

		assertEquals(quantidadeDeNotasEsperadas, relatorio.getTop3Notas().size());
		assertEquals(primeiraNotaEsperada, relatorio.getTop3Notas().get(0).getValor(), 0000.1);

		System.out.println();
	}
	@Test
	public void deveFuncionarDaIdentificaoDeNenhumaNota() {
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
		notas.add(new Nota(4, a1, poo, 0.0));
		notas.add(new Nota(1, a2, poo, 0.0));
		notas.add(new Nota(2, a3, poo, 0.0));

		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);

		int quantidadeDeNotasEsperadas = 3;
		double primeiraNotaEsperada = 0.0;
		double segundaNotaEsperada = 0000.1;
		double terceiraNotaEsperada = 0.0;

		assertEquals(quantidadeDeNotasEsperadas, relatorio.getTop3Notas().size());
		assertEquals(primeiraNotaEsperada, relatorio.getTop3Notas().get(0).getValor(),0000.1);
		assertEquals(segundaNotaEsperada, relatorio.getTop3Notas().get(1).getValor(),0000.1);
		assertEquals(terceiraNotaEsperada, relatorio.getTop3Notas().get(2).getValor(),0000.1);

	}

}
