package br.com.qsd.politeismo.ecommerce.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
//import java.util.Objects;
import java.util.Objects;

//import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.qsd.politeismo.ecommerce.enums.FormaPagamento;
import br.com.qsd.politeismo.ecommerce.enums.StatusPedido;

@Entity
@Table(name="pedido")
public class Pedido {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_pedido")
	private Long idPedido;
	
	@Column(nullable = false, name = "data_pedido")
	private LocalDate data;
	
	@Column(nullable = false, name = "valor_total")
	private BigDecimal valor;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false, name = "status_pedido")
	private StatusPedido statusPedido;
	
    @JsonIgnore
	@ManyToOne
	@JoinColumn(name = "fk_id_cliente", nullable = true)
	private Cliente cliente;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false, name = "forma_pagamento")
	private FormaPagamento formaPagamento;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "fk_id_endereco", nullable = true)
	private Endereco endereco;
	
	@JsonIgnore
	@OneToMany(mappedBy="idPedido")
	private List<ItemPedido> itensPedido;

	public Pedido() {
		
	
	}

	public Pedido(LocalDate data, BigDecimal valor, StatusPedido statusPedido, Cliente cliente,
			FormaPagamento formaPagamento, Endereco endereco) {
		
		this.data = data;
		this.valor = valor;
		this.statusPedido = statusPedido;
		this.cliente = cliente;
		this.formaPagamento = formaPagamento;
		this.endereco = endereco;
		
		
	}



	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public StatusPedido getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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