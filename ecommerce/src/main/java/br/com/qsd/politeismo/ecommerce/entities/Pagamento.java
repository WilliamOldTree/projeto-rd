package br.com.qsd.politeismo.ecommerce.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pagamento")
public class Pagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_pagamento")
	private Long id;
	
	@Column(name="data", nullable = false)
	private LocalDate data;
	
	@Column(name="fl_inativo", nullable = false)
	private Boolean fl_inativo = false;
	
	@Column(name="valor", nullable = false)
	private Double valor;
	
	@ManyToOne
	@JoinColumn(name="fk_id_pedido", nullable = false)
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
