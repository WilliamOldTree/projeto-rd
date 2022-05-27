package br.com.qsd.politeismo.ecommerce.controller.form;

import java.util.List;

import br.com.qsd.politeismo.ecommerce.enums.FormaPagamento;

import br.com.qsd.politeismo.ecommerce.enums.StatusPedido;

public class FormPedido {
		
	private String data;
	private String valor;
	private String cliente;
	private StatusPedido statusPedido;
	private FormaPagamento formaPagamento;
	private String endereco;
	private List<String> itens;
	private String entrega;
		
	public FormPedido() {
		
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public StatusPedido getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}

	public List<String> getItens() {
		return itens;
	}

	public void setItens(List<String> itens) {
		this.itens = itens;
	}
	
	
}//end class


	


