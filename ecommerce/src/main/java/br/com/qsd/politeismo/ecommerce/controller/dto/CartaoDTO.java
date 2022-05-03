package br.com.qsd.politeismo.ecommerce.controller.dto;

import br.com.qsd.politeismo.ecommerce.entities.Cartao;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Forma;
import br.com.qsd.politeismo.ecommerce.repository.FormaRepository;

public class CartaoDTO {
	
private Long id_cartao;
private String titular_cartao;
private String cvv_cartao;
private String validade_cartao;
private String cliente;
private String forma;



public CartaoDTO(Long id_cartao, String titular_cartao, String cvv_cartao, String validade_cartao, String cliente,
		String forma) {
	super();
	this.id_cartao = id_cartao;
	this.titular_cartao = titular_cartao;
	this.cvv_cartao = cvv_cartao;
	this.validade_cartao = validade_cartao;
	this.cliente = cliente;
	this.forma = forma;
}




public CartaoDTO(Cartao cartao) {
	super();
	id_cartao = cartao.getId();
	titular_cartao = cartao.getTitular_cartao();
	validade_cartao = cartao.getValidade_cartao();
	cliente = cartao.getCliente().getNome();
	forma = cartao.getFormaPagamento().getInstituicao();
	
}




public Long getId_cartao() {
	return id_cartao;
}




public void setId_cartao(Long id_cartao) {
	this.id_cartao = id_cartao;
}




public String getTitular_cartao() {
	return titular_cartao;
}




public void setTitular_cartao(String titular_cartao) {
	this.titular_cartao = titular_cartao;
}




public String getCvv_cartao() {
	return cvv_cartao;
}




public void setCvv_cartao(String cvv_cartao) {
	this.cvv_cartao = cvv_cartao;
}




public String getValidade_cartao() {
	return validade_cartao;
}




public void setValidade_cartao(String validade_cartao) {
	this.validade_cartao = validade_cartao;
}




public String getCliente() {
	return cliente;
}




public void setCliente(String cliente) {
	this.cliente = cliente;
}




public String getForma() {
	return forma;
}




public void setForma(String forma) {
	this.forma = forma;
}






}
