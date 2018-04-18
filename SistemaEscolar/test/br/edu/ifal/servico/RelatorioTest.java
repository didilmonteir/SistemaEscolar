package br.edu.ifal.servico;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifal.modelo.Aluno;
import br.edu.ifal.modelo.Disciplina;
import br.edu.ifal.modelo.Nota;

public class RelatorioTest {

	private List<Aluno> alunos;
	private Disciplina disciplina;
	private List<Nota> notas;
	private Relatorio relatorio;

	@Before
	public void criacaoDasEntidadesParaOsTestes() {
		this.alunos = new ArrayList<>();
		this.disciplina = new Disciplina();
		this.notas = new ArrayList<>();
		this.relatorio = new Relatorio();

		Aluno ana = new Aluno(4, "Edvald", "011.246.001-22");
		Aluno ze = new Aluno(1, "Bekinha", "118.666.014-74");
		Aluno juca = new Aluno(2, "Kelvin mestre dos Hardware", "111.222.333-75");
		Aluno bekinha = new Aluno(1, "Bekinha", "118.666.014-74");

		this.alunos.add(ana);
		this.alunos.add(ze);
		this.alunos.add(juca);
		this.alunos.add(bekinha);
	}

	@Test
	public void deveFuncionarNaOrdemAleatoria() {

		disciplina.setNome("Qualidade de software");

		notas.add(new Nota(4, alunos.get(0), disciplina, 2.5));
		notas.add(new Nota(1, alunos.get(1), disciplina, 9.5));
		notas.add(new Nota(2, alunos.get(2), disciplina, 7.5));

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

		disciplina.setNome("Qualidade de software");

		notas.add(new Nota(4, alunos.get(0), disciplina, 2.5));
		notas.add(new Nota(1, alunos.get(1), disciplina, 9.5));
		notas.add(new Nota(2, alunos.get(2), disciplina, 7.5));

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

		disciplina.setNome("Qualidade de software");

		notas.add(new Nota(4, alunos.get(0), disciplina, 9.5));
		notas.add(new Nota(1, alunos.get(1), disciplina, 7.5));
		notas.add(new Nota(2, alunos.get(2), disciplina, 2.5));

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

		Aluno ana = new Aluno(4, "Edvald", "011.246.001-22");

		this.alunos.add(ana);

		disciplina.setNome("Qualidade de software");

		notas.add(new Nota(4, ana, disciplina, 2.5));

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

		disciplina.setNome("Qualidade de software");

		this.notas.add(new Nota(4, alunos.get(0), disciplina, 8.0));
		this.notas.add(new Nota(1, alunos.get(1), disciplina, 10.0));
		this.notas.add(new Nota(2, alunos.get(2), disciplina, 9.0));

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

		Aluno ana = new Aluno(4, "Edvald", "011.246.001-22");

		disciplina.setNome("Qualidade de software");

		notas.add(new Nota(4, ana, disciplina, 8.0));

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

		disciplina.setNome("Qualidade de software");

		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);

		int quantidadeDeNotasEsperadas = 0;

		assertEquals(quantidadeDeNotasEsperadas, relatorio.getTop3Notas().size());

	}

	/*
	 * @Test public void deveFuncionarParaAs3PrimeirasNotasParaNenhumAluno() {
	 * criacaoDasEntidadesParaOsTestes();
	 * 
	 * }
	 */
	@Test
	public void deveFuncionarParaAs3PrimeirasNotasPara4Alunos() {

		notas.add(new Nota(4, alunos.get(0), disciplina, 8.0));
		notas.add(new Nota(2, alunos.get(1), disciplina, 7.0));
		notas.add(new Nota(3, alunos.get(2), disciplina, 6.0));
		notas.add(new Nota(1, alunos.get(3), disciplina, 9.5));

		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);
		int quantidadeDeNotasEsperadas = 3;
		assertEquals(quantidadeDeNotasEsperadas, relatorio.getTop3Notas().size());

	}

	@Test
	public void deveFuncionarParaAs3PrimeirasNotasPara2Alunos() {

		notas.add(new Nota(4, alunos.get(0), disciplina, 8.0));
		notas.add(new Nota(2, alunos.get(1), disciplina, 7.0));

		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);
		int quantidadeDeNotasEsperadas = 2;
		assertEquals(quantidadeDeNotasEsperadas, relatorio.getTop3Notas().size());

	}

}
