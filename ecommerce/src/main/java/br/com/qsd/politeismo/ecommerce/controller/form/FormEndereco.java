package br.com.qsd.politeismo.ecommerce.controller.form;

import br.com.qsd.politeismo.ecommerce.enums.Estado;

public class FormEndereco {

	private String apelido;
	private String nomeLougradouro;
	private String tipoLougradouro;
	private String numero;
	private String cep;
    private Estado estado;
	private String cidade;
	private String bairro;
	private String cliente;

	public FormEndereco() {

	}
	
	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	public String getNomeLougradouro() {
		return nomeLougradouro;
	}
	
	public void setNomeLougradouro(String nomeLougradouro) {
		this.nomeLougradouro = nomeLougradouro;
	}
	
	public String getTipoLougradouro() {
		return tipoLougradouro;
	}
	
	public void setTipoLougradouro(String tipoLougradouro) {
		this.tipoLougradouro = tipoLougradouro;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
