package br.com.qsd.politeismo.ecommerce.entities;

import java.time.LocalDate;

public class Pagamento {
	
	private Long id;
	private LocalDate data;
	private Boolean fl_inativo = false;
	private Double valor;
	private Pedido pedido;
	
	
	
	public Pagamento () {
		
	}
	
	public Pagamento(Long id, LocalDate data, Boolean fl_inativo, Double valor, Pedido pedido) {
		
		this.id = id;
		this.data = data;
		this.fl_inativo = fl_inativo;
		this.valor = valor;
		this.pedido = pedido;
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	public Boolean getFl_inativo() {
		return fl_inativo;
	}


	public void setFl_inativo(Boolean fl_inativo) {
		this.fl_inativo = fl_inativo;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


	public Pedido getPedido() {
		return pedido;
	}


	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
}//end class
