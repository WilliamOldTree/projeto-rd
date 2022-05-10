package br.com.qsd.politeismo.ecommerce.controller.form;

import br.com.qsd.politeismo.ecommerce.entities.Endereco;

public class FormEnderecoDTO {
	private String apelido;
	private String nomeLougradouro;
	private String tipoLougradouro;
	private String numero;
	private String cep;
	private String cidade;
	private String bairro;
	
	
	public FormEnderecoDTO() {

	}
	
	
	public FormEnderecoDTO(String apelido, String nomeLougradouro, String tipoLougradouro, String numero, String cep,
			String cidade, String bairro) {
		super();
		this.apelido = apelido;
		this.nomeLougradouro = nomeLougradouro;
		this.tipoLougradouro = tipoLougradouro;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.bairro = bairro;
	}
	
	
	public FormEnderecoDTO(Endereco entity) {
		apelido= entity.getApelido();
		nomeLougradouro= entity.getNomeLougradouro();
		tipoLougradouro= entity.getTipoLougradouro();
		numero = entity.getNumero();
	    cep = entity.getCep();
		cidade = entity.getCidade();
		bairro = entity.getBairro();
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

}
