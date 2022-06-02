package br.com.qsd.politeismo.ecommerce.controller.dto;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import br.com.qsd.politeismo.ecommerce.entities.Endereco;
import br.com.qsd.politeismo.ecommerce.entities.ItemPedido;
import br.com.qsd.politeismo.ecommerce.entities.Pedido;

public class PedidoDetalheDTO {
	
	private Long numeroPedido;
	private Date data;
	private String nomeCliente;
	private String statusPedido;
	private String formaPagamento;
	private Endereco endereco;
	private BigDecimal valor;
	private List<ItemPedido> itens;
	
	
	public PedidoDetalheDTO() {}

	public PedidoDetalheDTO(Pedido pedido) {
		this.numeroPedido = pedido.getIdPedido();
		this.data = pedido.getData();
		this.nomeCliente = pedido.getCliente().getNome();
		this.statusPedido = pedido.getStatusPedido();
		this.formaPagamento = pedido.getFormaPagamento();
		this.endereco = pedido.getEndereco();		
		this.valor = pedido.getValor();
		this.itens = pedido.getItensPedido();
 	}

	public Long getNumeroPedido() {
		return numeroPedido;
	}

	public String getData() {
		SimpleDateFormat dataAtual= new SimpleDateFormat("dd/MM/yyyy");
		String today = dataAtual.format(data);
		return today;
	}

	public String getNomeCliente() {
		return nomeCliente;
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
	
	public List<ItemPedidoDetalheDTO> getItens() {
		List<ItemPedidoDetalheDTO> lista = ItemPedidoDetalheDTO.converter(itens);
		return lista;
	}

	public static List<PedidoDetalheDTO> converter(List<Pedido> pedidos) {
		return pedidos.stream().map(PedidoDetalheDTO::new).collect(Collectors.toList());
	} 	
}
