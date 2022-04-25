package br.com.rd.politeismo.ecommerce.entities;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@Column(name= "id_categoria")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(name= "fl_inativo")
	private Boolean flInativo; // flag inativo
	
	@OneToMany(mappedBy="categoria")
	private List<Produto> produtos;

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nome=" + nome + ", flInativo=" + flInativo + "]";
	}

	public Categoria() {
		
	}

	public Long getId_categoria() {
		return id;
	}
	
	public void setId_categoria(Long id_categoria) {
		this.id = id_categoria;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isFlInativo() {
		return flInativo;
	}

	public void setFlInativo(boolean flInativo) {
		this.flInativo = flInativo;
	}

}
