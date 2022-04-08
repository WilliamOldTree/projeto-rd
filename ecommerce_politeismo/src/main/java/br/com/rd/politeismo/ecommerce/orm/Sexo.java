package br.com.rd.politeismo.ecommerce.orm;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;


@Entity
@Table(name = "SEXO")
public class Sexo {
	

	@Id
	@Column(name= "id_sexo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String descricao;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	private List<Fisica> fisica;


	@Override
	public String toString() {
		return "Sexo [id=" + id + ", descricao=" + descricao + "]";
	}
	
	public List<Fisica> getFisica() {
		return fisica;
	}

	
}
