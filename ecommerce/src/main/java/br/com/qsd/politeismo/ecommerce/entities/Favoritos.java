package br.com.qsd.politeismo.ecommerce.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity	
@Table(name = "FAVORITOS")
public class Favoritos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_FAVORITOS")
	private Long id_favoritos;
	

	@ManyToOne
	@JoinColumn(nullable = true, name = "id_cliente")
	private Cliente cliente;
	
	@ManyToMany
	@JoinTable(name = "produtos_favoritos", joinColumns = {
    @JoinColumn(name = "fk_favoritos") }, inverseJoinColumns = { @JoinColumn(name = "fk_produtos") })
	private List<Produto> produtos;	
	
	
	
	
	public Favoritos() {
		
	}


	public Long getId_favoritos() {
		return id_favoritos;
	}


	public void setId_favoritos(Long id_favoritos) {
		this.id_favoritos = id_favoritos;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public List<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	



}//end