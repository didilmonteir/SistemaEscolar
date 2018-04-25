package br.edu.ifal.modelo;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "boletim")
public class Boletim {
	@Id
	@GeneratedValue(generator = "inc")
	@GenericGenerator(name = "inc", strategy = "increment")
	@Column(nullable = false, name = "id_boletim")
	private Integer id;
	@OneToMany
	private Set<Disciplina> disciplinas;
	@Column(length = 4, name = "notas")
	private List<Nota> notas;

	public Boletim(Set<Disciplina> disciplinas, List<Nota> notas) {
		this.disciplinas = disciplinas;
		this.notas = notas;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Set<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public void removerDisciplina(Disciplina d) {
		disciplinas.remove(d);
	}

	public void adicionarDisciplina(Disciplina d) {
		disciplinas.add(d);
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

	public void removerNota(Nota n) {
		notas.remove(n);
	}

	public void adicionarNota(Nota n) {
		notas.add(n);
	}

}
