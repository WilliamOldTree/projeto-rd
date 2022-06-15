package br.com.qsd.politeismo.ecommerce.controller.dto;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Endereco;
import br.com.qsd.politeismo.ecommerce.entities.Entrega;
import br.com.qsd.politeismo.ecommerce.entities.ItemPedido;
import br.com.qsd.politeismo.ecommerce.entities.Pedido;

public class PedidoDetalheDTO {
	
	private Long numeroPedido;
	private Date data;
	private Cliente cliente;
	private String statusPedido;
	private String formaPagamento;
	private Endereco endereco;
	private Entrega entrega;
	private BigDecimal valor;
	private List<ItemPedido> itens;
	
	
	public PedidoDetalheDTO() {}

	public PedidoDetalheDTO(Pedido pedido) {
		this.numeroPedido = pedido.getIdPedido();
		this.data = pedido.getData();
		this.cliente = pedido.getCliente();
		this.statusPedido = pedido.getStatusPedido();
		this.formaPagamento = pedido.getFormaPagamento();
		this.endereco = pedido.getEndereco();		
		this.valor = pedido.getValor();
		this.itens = pedido.getItensPedido();
		this.entrega = pedido.getEntrega();
 	}

	public Long getNumeroPedido() {
		return numeroPedido;
	}

	public String getData() {
		SimpleDateFormat dataAtual= new SimpleDateFormat("dd/MM/yyyy");
		String today = dataAtual.format(data);
		return today;
	}

	public String getStatusPedido() {
		return statusPedido;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public BigDecimal getValor() {
		return valor;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public Entrega getEntrega() {
		return entrega;
	}

	public List<ItemPedidoDetalheDTO> getItens() {
		List<ItemPedidoDetalheDTO> lista = ItemPedidoDetalheDTO.converter(itens);
		return lista;
	}

	public static List<PedidoDetalheDTO> converter(List<Pedido> pedidos) {
		return pedidos.stream().map(PedidoDetalheDTO::new).collect(Collectors.toList());
	} 	
}
