package br.com.qsd.politeismo.ecommerce.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Entrega;
import br.com.qsd.politeismo.ecommerce.entities.Pedido;
import br.com.qsd.politeismo.ecommerce.enums.StatusPedido;

public class PedidoDTO {
	
	private Long idPedido;
	
	private LocalDate data;
	
	private BigDecimal valor;
	
	private StatusPedido statusPedido;
	
	private Cliente cliente;
	
	private Entrega entrega;
	
	public PedidoDTO() {
		
	}

	public PedidoDTO(Pedido pedido) {
		idPedido = pedido.getidPedido();
		data = pedido.getData();
		valor = pedido.getValor();
		statusPedido = pedido.getStatusPedido();
		cliente = pedido.getCliente();
		entrega = pedido.getEntrega();
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

	public Entrega getEntrega() {
		return entrega;
	}

	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}
	
	

}
