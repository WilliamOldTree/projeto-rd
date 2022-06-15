package br.com.qsd.politeismo.ecommerce.controller.dto;

import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Pix;


public class PixDTO {
	
	
	private Long id;
	private String chave = "88faa317-c217-4c29-8228-38f3d978bb6f";
	private String urlImagem;
	private Cliente cliente;
	
	
	public PixDTO(){
		
	}
	
	
	public PixDTO(Long id, String chave, String urlImagem, Cliente cliente) {
		
		this.id = id;
		this.chave = chave;
		this.urlImagem = urlImagem;
		this.cliente = cliente;
		
	}
	
	public PixDTO(Pix pix) {
		
		this.id = pix.getId();
		this.chave = pix.getChave();
		this.urlImagem = pix.getUrlImagem();
		this.getClass();
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getChave() {
		return chave;
	}


	public void setChave(String chave) {
		this.chave = chave;
	}


	public String getUrlImagem() {
		return urlImagem;
	}


	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}//end class
