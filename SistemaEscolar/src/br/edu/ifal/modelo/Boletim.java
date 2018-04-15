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
@Table(name= "boletim")
public class Boletim {
	@Id
	@GeneratedValue(generator = "inc")
	@GenericGenerator(name = "inc", strategy = "increment")	
	@Column(length = 10, nullable = false, name = "id_boletim")
	private int id;	
	@OneToMany
	private Set<Disciplina> disciplinas;
	@Column(length = 4, name = "notas", nullable = true)
	private List<Byte> notas;
	
}
