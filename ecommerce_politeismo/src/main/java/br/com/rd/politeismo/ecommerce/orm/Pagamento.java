package br.com.rd.politeismo.ecommerce.orm;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name = "PAGAMENTO")
public class Pagamento {


	@Id
	@Column(name= "id_pagamento")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private LocalDate data_pagamento;
	private String status_pagamento;
	private BigDecimal valor_pagamento;
	private Pedido pedido;
	private Forma forma;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getData_pagamento() {
		return data_pagamento;
	}
	public void setData_pagamento(LocalDate data_pagamento) {
		this.data_pagamento = data_pagamento;
	}
	public String getStatus_pagamento() {
		return status_pagamento;
	}
	public void setStatus_pagamento(String status_pagamento) {
		this.status_pagamento = status_pagamento;
	}
	public BigDecimal getValor_pagamento() {
		return valor_pagamento;
	}
	public void setValor_pagamento(BigDecimal valor_pagamento) {
		this.valor_pagamento = valor_pagamento;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Forma getForma() {
		return forma;
	}
	public void setForma(Forma forma) {
		this.forma = forma;
	}

	
	@Override
	public String toString() {
		return "Pagamento [id=" + id + ", data_pagamento=" + data_pagamento + ", status_pagamento=" + status_pagamento
				+ ", valor_pagamento=" + valor_pagamento + "]";
	}
	
}
