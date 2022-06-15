package br.com.qsd.politeismo.ecommerce.controller.dto;

import br.com.qsd.politeismo.ecommerce.entities.Cliente;

public class TokenDTO {
	
	private Long idCliente;
	private String nomeCliente;
	private String token;
	private String tipo;
	
	public TokenDTO(Cliente cliente, String token, String tipo) {
		this.idCliente = cliente.getId();
		this.nomeCliente = cliente.getNome();
		this.token = token;
		this.tipo = tipo;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getToken() {
		return token;
	}

	public String getTipo() {
		return tipo;
	}

}
