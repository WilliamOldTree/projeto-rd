<<<<<<< HEAD
<<<<<<< HEAD
=======
package br.com.qsd.politeismo.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity	
@Table(name = "FAVORITOS")


public class Favoritos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="ID_FAVORITOS")
	private Long id_favoritos;
	
	@Column(nullable = false, name = "LISTA")
	private String lista_favoritos;
	
	
	@ManyToOne
	@JoinColumn(nullable = true, name = "id_cliente")
	private Cliente cliente;
	
		
	public Favoritos(Long id_favoritos, String lista_favoritos, Long id_cliente, Cliente cliente) {
		super();
		this.id_favoritos = id_favoritos;
		this.lista_favoritos = lista_favoritos;
		this.cliente = cliente;
	}

	
	public Long getId_favoritos() {
		return id_favoritos;
	}

	public void setId_favoritos(Long id_favoritos) {
		this.id_favoritos = id_favoritos;
	}

	public String getLista_favoritos() {
		return lista_favoritos;
	}

	public void setLista_favoritos(String lista_favoritos) {
		this.lista_favoritos = lista_favoritos;
	}



	@Override
	public String toString() {
		return "Favoritos [id_favoritos=" + id_favoritos + ", lista_favoritos=" + lista_favoritos + ", id_cliente="
				+ ", cliente=" + cliente + "]";
	}


	public Cliente getCliente() {
		// TODO Auto-generated method stub
		return null;
	}
}
=======
>>>>>>> 421972d200574f03f92aadedc3dc360b4ac2d26c
package br.com.qsd.politeismo.ecommerce.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
<<<<<<< HEAD
=======
package br.com.qsd.politeismo.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity	
@Table(name = "FAVORITOS")


public class Favoritos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="ID_FAVORITOS")
	private Long id_favoritos;
	
	@Column(nullable = false, name = "LISTA")
	private String lista_favoritos;
	
	
	@ManyToOne
	@JoinColumn(nullable = true, name = "id_cliente")
	private Cliente cliente;
	
		
	public Favoritos(Long id_favoritos, String lista_favoritos, Long id_cliente, Cliente cliente) {
		super();
		this.id_favoritos = id_favoritos;
		this.lista_favoritos = lista_favoritos;
		this.cliente = cliente;
	}

	
	public Long getId_favoritos() {
		return id_favoritos;
	}

	public void setId_favoritos(Long id_favoritos) {
		this.id_favoritos = id_favoritos;
	}

	public String getLista_favoritos() {
		return lista_favoritos;
	}

	public void setLista_favoritos(String lista_favoritos) {
		this.lista_favoritos = lista_favoritos;
	}



	@Override
	public String toString() {
		return "Favoritos [id_favoritos=" + id_favoritos + ", lista_favoritos=" + lista_favoritos + ", id_cliente="
				+ ", cliente=" + cliente + "]";
	}


	public Cliente getCliente() {
		// TODO Auto-generated method stub
		return null;
	}
}
>>>>>>> 29b5b77eea07f6485c978e0cab6c6e22791a6025
=======
>>>>>>> 4c080c22c4c7cdd9603e7a8907c133b2dea15553
>>>>>>> 421972d200574f03f92aadedc3dc360b4ac2d26c
