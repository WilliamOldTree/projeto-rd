package br.com.qsd.politeismo.ecommerce.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
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
	
}