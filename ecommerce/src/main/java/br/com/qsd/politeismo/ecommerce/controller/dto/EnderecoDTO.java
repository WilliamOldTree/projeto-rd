package br.com.qsd.politeismo.ecommerce.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.qsd.politeismo.ecommerce.entities.Endereco;
import br.com.qsd.politeismo.ecommerce.enums.Estado;

public class EnderecoDTO {
	private Long id;
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
		id = entity.getIdEndereco();
		apelido= entity.getApelido();
		nomeLougradouro= entity.getNomeLougradouro();
		tipoLougradouro= entity.getTipoLougradouro();
		numero = entity.getNumero();
	    cep = entity.getCep();
	    estado = entity.getEstado();
		cidade = entity.getCidade();
		bairro = entity.getBairro();
		
	}

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
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
	
	public static List<EnderecoDTO> converter (List <Endereco> enderecos ) {
		return enderecos.stream().map(EnderecoDTO::new).collect(Collectors.toList()); 
	}
	
}
