package br.com.rd.queroserdev.loja.mvc.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private boolean flInativo = true; // flag inativo
	
	
	

	
	
	
	
	
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
	


}
