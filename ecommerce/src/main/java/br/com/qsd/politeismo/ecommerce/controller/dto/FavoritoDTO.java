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


	

}//end