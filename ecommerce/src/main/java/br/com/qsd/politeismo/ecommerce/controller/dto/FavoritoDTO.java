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


	

}//end