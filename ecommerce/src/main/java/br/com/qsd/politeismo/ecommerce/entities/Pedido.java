package br.com.qsd.politeismo.ecommerce.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.qsd.politeismo.ecommerce.enums.StatusPedido;

@Entity
@Table(name="pedido")
public class Pedido {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_pedido")
	private Long idPedido;
	
	@Column(nullable = false, name = "data_pedido" )
	private LocalDate data;
	
	@Column(nullable = false, name = "valor_total" )
	private BigDecimal valor;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false, name = "status_pedido" )
	private StatusPedido statusPedido;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_cliente", nullable = true)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="fk_id_entrega",nullable = false)
	private Entrega entrega;
	
	@JsonIgnore
	@OneToMany(mappedBy="idPedido")
	private List<ItemPedido> itensPedido;
	
	public Pedido() {
		
	}

	public Long getidPedido() {
		return idPedido;
	}

	public void setidPedido(Long idPedido) {
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

	public Entrega getEntrega() {
		return entrega;
	}

	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}

    
	
}//end class 