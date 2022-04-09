package br.com.rd.politeismo.ecommerce.orm;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
	
	@Id
	@Column(name="id_pedido")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="data_pedido", nullable = false)
	private LocalDate dataPedido;
	
	@Column(name="valor_total", nullable = false)
	private BigDecimal valorTotal;
	
	//Para relacionamentos
	@JoinColumn(name="cliente_id_cliente", nullable = false, referencedColumnName = "id_cliente")
	private Cliente cliente;
	
	@JoinColumn(name="entrega_id_entrega", nullable = false, referencedColumnName = "id_entrega")
	private Entrega entrega;
	
	
	
	
	public Pedido() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
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

	@Override
	public String toString() {
		return "Pedido [ID: " + id + ", Data Pedido: " + dataPedido + ", Valor Total: " + valorTotal + "]";
	}

}
