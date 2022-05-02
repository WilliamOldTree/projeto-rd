package br.com.rd.qsd.politeismo.ecommerce.controllers.dto;

import br.com.rd.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.rd.qsd.politeismo.ecommerce.entities.Endereco;

public class EnderecoDTO {

	private Long id_endereco;
	private String apelido;
	private String nomeLougradouro; 
	private String tipoLougradouro;
	private String numero;
	private String cep;
	private String cidade;
	private String bairro;
	private Cliente cliente;
	
	public EnderecoDTO() {
		
	}


	public EnderecoDTO(Long id_endereco, String apelido, String nomeLougradouro, String tipoLougradouro, String numero,
			String cep, String cidade, String bairro, Cliente cliente) {
		super();
		this.id_endereco = id_endereco;
		this.apelido = apelido;
		this.nomeLougradouro = nomeLougradouro;
		this.tipoLougradouro = tipoLougradouro;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.bairro = bairro;
		this.cliente = cliente;
	}



	public EnderecoDTO(Endereco entity) {
		id_endereco = entity.getId_endereco();
		apelido= entity.getApelido();
		nomeLougradouro= entity.getNomeLougradouro();
		tipoLougradouro= entity.getTipoLougradouro();
		numero = entity.getNumero();
	    cep = entity.getCep();
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
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}

