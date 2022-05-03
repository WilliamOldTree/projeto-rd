package br.com.qsd.politeismo.ecommerce.controller.form;

import br.com.qsd.politeismo.ecommerce.entities.Cartao;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Forma;

public class FormCartaoDTO {
	private String titular_cartao;
	private String cvv_cartao;
	private String validade_cartao;
	private Cliente cliente;
	private Forma forma;
	
	
	public FormCartaoDTO(String titular_cartao, String cvv_cartao, String validade_cartao, Cliente cliente,
			Forma forma) {
		super();
		this.titular_cartao = titular_cartao;
		this.cvv_cartao = cvv_cartao;
		this.validade_cartao = validade_cartao;
		this.cliente = cliente;
		this.forma = forma;
	}


	public FormCartaoDTO(Cartao cartao) {
		super();
		titular_cartao = cartao.getTitular_cartao();
		validade_cartao = cartao.getValidade_cartao();
		cliente = cartao.getCliente();
		forma = cartao.getFormaPagamento();	}


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


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Forma getForma() {
		return forma;
	}


	public void setForma(Forma forma) {
		this.forma = forma;
	}	
	
	
	
}



