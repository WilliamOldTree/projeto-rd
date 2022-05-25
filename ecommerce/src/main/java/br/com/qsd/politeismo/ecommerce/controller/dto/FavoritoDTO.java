<<<<<<< HEAD
<<<<<<< HEAD
package br.com.qsd.politeismo.ecommerce.controller.dto;


import java.util.List;

import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Favoritos;
import br.com.qsd.politeismo.ecommerce.entities.Produto;

public class FavoritoDTO {
	
	private Long id_favoritos;
	private Cliente cliente;
	private List <Produto> produto;
	
	public FavoritoDTO () {

	}
	
	public FavoritoDTO (Favoritos favorito) {
				
		id_favoritos = favorito.getId_favoritos();
		cliente = favorito.getCliente();
		produto = favorito.getProdutos();
		
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

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}


	

=======
=======
>>>>>>> 421972d200574f03f92aadedc3dc360b4ac2d26c
package br.com.qsd.politeismo.ecommerce.controller.dto;


import java.util.Map;

import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Favoritos;

public class FavoritoDTO {
	
	private Long id_favoritos;
	private String lista_favoritos;
	private Cliente cliente;
	
	public FavoritoDTO (Long id_favoritos, String lista_favoritos, Cliente cliente) {
				
		this.setId_favoritos(id_favoritos);
		this.lista_favoritos = lista_favoritos;
		this.cliente = cliente;
		
	
	}
	
	public FavoritoDTO (Favoritos favorito) {
				
		id_favoritos = favorito.getId_favoritos();
		lista_favoritos = favorito.getLista_favoritos();
		cliente = favorito.getCliente();
		
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Map<String, ?> getId_produto() {
		// TODO Auto-generated method stub
		return null;
	}


	

<<<<<<< HEAD
>>>>>>> 29b5b77eea07f6485c978e0cab6c6e22791a6025
=======
=======
package br.com.qsd.politeismo.ecommerce.controller.dto;


import java.util.List;

import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Favoritos;
import br.com.qsd.politeismo.ecommerce.entities.Produto;

public class FavoritoDTO {
	
	private Long id_favoritos;
	private Cliente cliente;
	private List <Produto> produto;
	
	public FavoritoDTO () {

	}
	
	public FavoritoDTO (Favoritos favorito) {
				
		id_favoritos = favorito.getId_favoritos();
		cliente = favorito.getCliente();
		produto = favorito.getProdutos();
		
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

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}


	

>>>>>>> 4c080c22c4c7cdd9603e7a8907c133b2dea15553
>>>>>>> 421972d200574f03f92aadedc3dc360b4ac2d26c
}//end