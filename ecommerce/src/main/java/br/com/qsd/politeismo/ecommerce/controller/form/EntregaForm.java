package br.com.qsd.politeismo.ecommerce.controller.form;

import br.com.qsd.politeismo.ecommerce.enums.FormaEntrega;
import br.com.qsd.politeismo.ecommerce.enums.StatusEntrega;

public class EntregaForm {

	
	private String data;
	private String valor;
	private StatusEntrega statusEntrega;
	private FormaEntrega formaEntrega;
	

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
	public StatusEntrega getStatusEntrega() {
		return statusEntrega;
	}
	public void setStatusEntrega(StatusEntrega statusEntrega) {
		this.statusEntrega = statusEntrega;
	}
	public FormaEntrega getFormaEntrega() {
		return formaEntrega;
	}
	public void setFormaEntrega(FormaEntrega formaEntrega) {
		this.formaEntrega = formaEntrega;
	}

}
