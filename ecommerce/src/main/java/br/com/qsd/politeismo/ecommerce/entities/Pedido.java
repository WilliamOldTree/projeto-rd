package br.com.qsd.politeismo.ecommerce.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
//import java.util.Objects;
import java.util.Objects;

import javax.persistence.CascadeType;
//import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "pedido")
public class Pedido {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_pedido")
	private Long idPedido;
	
	@Column(nullable = false, name = "data_pedido")
	private Date data;
	
	@Column(nullable = false, name = "valor_total")
	private BigDecimal valor;
	
	@Column(nullable = false, name = "status_pedido")
	private String statusPedido;
	
	@JsonIgnore
	@ManyToOne(fetch =FetchType.EAGER, cascade = CascadeType.ALL) 
	@JoinColumn(name = "fk_id_cliente", nullable = true)
	private Cliente cliente;
	

	@Column(nullable = false, name = "forma_pagamento")
	private String formaPagamento;
	
	@JsonIgnore
	@ManyToOne(fetch =FetchType.EAGER, cascade = CascadeType.ALL) 
	@JoinColumn(name = "fk_id_endereco", nullable = true)
	private Endereco endereco;
	
	@JsonIgnore
	@ManyToOne(fetch =FetchType.EAGER, cascade = CascadeType.ALL)
	private Entrega entrega;
	
	@JsonIgnore
	@OneToMany(mappedBy="idPedido")
	private List<ItemPedido> itensPedido;

	public Pedido() {}

	public Pedido(Date data, BigDecimal valor, String statusPedido, Cliente cliente,
			String formaPagamento, Endereco endereco, Entrega entrega) {		
		this.data = data;
		this.valor = valor;
		this.statusPedido = statusPedido;
		this.cliente = cliente;
		this.formaPagamento = formaPagamento;
		this.endereco = endereco;	
		this.entrega = entrega;
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Entrega getEntrega() {
		return entrega;
	}

	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}

	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(List<ItemPedido> itensPedido) {
		this.itensPedido = itensPedido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPedido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(idPedido, other.idPedido);
	}
	
	
}//end class 