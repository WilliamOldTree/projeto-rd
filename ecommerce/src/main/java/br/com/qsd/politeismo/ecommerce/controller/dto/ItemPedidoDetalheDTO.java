package br.com.qsd.politeismo.ecommerce.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.qsd.politeismo.ecommerce.entities.ItemPedido;
import br.com.qsd.politeismo.ecommerce.entities.PedidoProdutoID;

public class ItemPedidoDetalheDTO {

	private Long codigo_produto;
	private String produto;
	private String urlProduto;
	private String preco;
	private Integer quantidade;
	private PedidoProdutoID chave;
	
	public ItemPedidoDetalheDTO(ItemPedido item) {
		this.codigo_produto = item.getIdProduto().getIdProduto();
		this.produto = item.getIdProduto().getNome();
		this.preco = item.getIdProduto().getPreco();
		this.quantidade = item.getQuantidade();
		this.chave = item.getPedidoProdutoID();
		this.urlProduto = item.getIdProduto().getUrlProduto();
	}

	public Long getCodigo_produto() {
		return codigo_produto;
	}


	public String getProduto() {
		return produto;
	}


	public String getPreco() {
		return preco;
	}


	public Integer getQuantidade() {
		return quantidade;
	}
	
	public String getUrlProduto() {
		return urlProduto;
	}

	public static List<ItemPedidoDetalheDTO> converter(List<ItemPedido> itemPedidos) {
		return itemPedidos.stream().map(ItemPedidoDetalheDTO::new).collect(Collectors.toList());
	}
	
}
