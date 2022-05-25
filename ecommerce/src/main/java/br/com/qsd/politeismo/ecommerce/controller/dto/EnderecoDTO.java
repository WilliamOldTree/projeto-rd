package br.com.qsd.politeismo.ecommerce.controller.dto;

import br.com.qsd.politeismo.ecommerce.entities.Endereco;
import br.com.qsd.politeismo.ecommerce.enums.Estado;

public class EnderecoDTO {
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
		apelido= entity.getApelido();
		nomeLougradouro= entity.getNomeLougradouro();
		tipoLougradouro= entity.getTipoLougradouro();
		numero = entity.getNumero();
	    cep = entity.getCep();
	    estado = entity.getEstado();
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

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
