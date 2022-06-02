package br.com.qsd.politeismo.ecommerce.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Endereco;
import br.com.qsd.politeismo.ecommerce.entities.Pedido;
import br.com.qsd.politeismo.ecommerce.enums.FormaPagamento;
import br.com.qsd.politeismo.ecommerce.enums.StatusPedido;

public class PedidoDTO {
	
	private Long idPedido;
	private LocalDate data;
	private BigDecimal valor;
	private StatusPedido statusPedido;
	private Cliente cliente;
	private FormaPagamento formaPagamento;
	private Endereco endereco;
	
	
	public PedidoDTO() {
		
	}

	public PedidoDTO(Pedido pedido) {
		idPedido = pedido.getIdPedido();
		data = pedido.getData();
		valor = pedido.getValor();
		statusPedido = pedido.getStatusPedido();
		cliente = pedido.getCliente();
		formaPagamento = pedido.getFormaPagamento();
		endereco = pedido.getEndereco();
 	}

	public Long getIdPedido() {
		return idPedido;
	}

	public LocalDate getData() {
		return data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public StatusPedido getStatusPedido() {
		return statusPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public static List<PedidoDTO> converter(List<Pedido> pedidos) {
		return pedidos.stream().map(PedidoDTO::new).collect(Collectors.toList());
		} 
}