package br.edu.ifal.servico;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifal.modelo.Aluno;
import br.edu.ifal.modelo.Disciplina;

public class GerenciadorDeNotaTest {

	private Aluno aluno;
	private Disciplina disciplina; 
	private GerenciadorDeNotas gerenciadorDeNotas;
	
	@Before
	public void criacaoDasEntidades() {
		aluno = new Aluno();
		aluno.setNome("Rebeca");
		aluno.setCpf("000.001.123-50");
		
		disciplina = new Disciplina();
		disciplina.setNome("POO");
		
		gerenciadorDeNotas = new GerenciadorDeNotas();
		
	}
	
	@Test
	public void naoDeveSetarNotaMenorQueZero() {
		
		boolean resultado = gerenciadorDeNotas.setarNotas(12, aluno, disciplina);
		
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoEsperado, resultado);
		
	}
	
	
	
}
