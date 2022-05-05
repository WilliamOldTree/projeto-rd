package br.com.qsd.politeismo.ecommerce.controller.dto;

import br.com.qsd.politeismo.ecommerce.entities.Endereco;
import br.com.qsd.politeismo.ecommerce.enums.Estado;

public class EnderecoDTO {
	private Long id_endereco;
	private String apelido;
	private String nomeLougradouro;
	private String tipoLougradouro;
	private String numero;
	private String cep;
    private Estado estado;
	private String cidade;
	private String bairro;

	public EnderecoDTO() {
		
	}

	
	public EnderecoDTO(Endereco entity) {
		id_endereco = entity.getId_endereco();
		apelido= entity.getApelido();
		nomeLougradouro= entity.getNomeLougradouro();
		tipoLougradouro= entity.getTipoLougradouro();
		numero = entity.getNumero();
	    cep = entity.getCep();
	    estado = entity.getEstado();
		cidade = entity.getCidade();
		bairro = entity.getBairro();
		
	}


	public Long getId_endereco() {
		return id_endereco;
	}
	public void setId_endereco(Long id_endereco) {
		this.id_endereco = id_endereco;
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

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
