package br.com.qsd.politeismo.ecommerce.controller.form;



import br.com.qsd.politeismo.ecommerce.enums.FormaPagamento;
import br.com.qsd.politeismo.ecommerce.enums.StatusPedido;

public class FormPedido {
		
	private String data;
	private String valor;
	private StatusPedido statusPedido;
	private String cliente;
	private FormaPagamento formaPagamento;
	private String endereco;
		
	
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


	public StatusPedido getStatusPedido() {
		return statusPedido;
	}


	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
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
	
	
		
}//end class
