package br.com.rd.queroserdev.loja.mvc.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@Column(name="id_cliente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String email;
	
	@OneToMany(mappedBy="cliente")
	List <Telefone> telefone;
	
	@OneToMany(mappedBy="cliente")
	List<Cartao>cartao;
	
	@OneToMany(mappedBy="cliente")
	List<Pix> pix;
	
	
	


	@OneToMany(mappedBy="cliente")
	List<Boleto> boleto;
	
	
	@OneToMany(mappedBy="cliente")
	List<Forma> forma;
	
	public List<Boleto> getBoleto() {
		return boleto;
	}

	
	public List<Forma> getForma() {
		return forma;
	}


	public List<Telefone> getTelefone() {
		return telefone;
	}


	public List<Cartao> getCartao() {
		return cartao;
	}


	public List<Pix> getPix() {
		return pix;
	}




	public Cliente() {
		
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}//end class
