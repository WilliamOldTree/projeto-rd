package br.com.qsd.politeismo.ecommerce.controller.dto;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Endereco;
import br.com.qsd.politeismo.ecommerce.entities.Entrega;
import br.com.qsd.politeismo.ecommerce.entities.Pedido;


public class PedidoDTO {
	
	private Long idPedido;
	private Date data;
	private BigDecimal valor;
	private String statusPedido;
	private Cliente cliente;
	private String formaPagamento;
	private Endereco endereco;
	private Entrega entrega;
	
	
	public PedidoDTO() {}

	public PedidoDTO(Pedido pedido) {
		this.idPedido = pedido.getIdPedido();
		this.data = pedido.getData();
		this.valor = pedido.getValor();
		this.statusPedido = pedido.getStatusPedido();
		this.cliente = pedido.getCliente();
		this.formaPagamento = pedido.getFormaPagamento();
		this.endereco = pedido.getEndereco();
		this.entrega = pedido.getEntrega();
 	}

	public Long getIdPedido() {
		return idPedido;
	}

	public String getData() {
		
		SimpleDateFormat dataAtual= new SimpleDateFormat("dd/MM/yyyy");
		String today = dataAtual.format(data);
		return today;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public String getStatusPedido() {
		return statusPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public Entrega getEntrega() {
		return entrega;
	}

	public static List<PedidoDTO> converter(List<Pedido> pedidos) {
		return pedidos.stream().map(PedidoDTO::new).collect(Collectors.toList());
		} 
	
}//end class