package br.com.qsd.politeismo.ecommerce.controller.form;


import java.util.List;

import br.com.qsd.politeismo.ecommerce.entities.ItemPedido;
import br.com.qsd.politeismo.ecommerce.enums.StatusPedido;

public class FormPedido {
		
	private String data;
	
	private String valor;
	
	private StatusPedido statusPedido;
	
	private String cliente;
	
	private List <ItemPedido> itemPedido;
	
	
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

	public String getEntrega() {
		return entrega;
	}

	public void setEntrega(String entrega) {
		this.entrega = entrega;
	}
	
	public List<ItemPedido> getItemPedido() {
		return itemPedido;
	}


	public void setItemPedido(List<ItemPedido> itemPedido) {
		this.itemPedido = itemPedido;
	}
	
	
}//end class
