package br.com.qsd.politeismo.ecommerce.controller.dto;

import br.com.qsd.politeismo.ecommerce.entities.ItemPedido;
import br.com.qsd.politeismo.ecommerce.entities.PedidoProdutoID;

public class ItemPedidoDTO {
	
	private PedidoProdutoID pedidoProdutoID;
	
	private Integer quantidade;
	
	public ItemPedidoDTO() {
		
	}
	
	public ItemPedidoDTO(ItemPedido itemPedido) {
		pedidoProdutoID = itemPedido.getPedidoProdutoID();
		quantidade = itemPedido.getQuantidade();
 	}
	
	public PedidoProdutoID getPedidoProdutoID() {
		return pedidoProdutoID;
	}

	public void setPedidoProdutoID(PedidoProdutoID pedidoProdutoID) {
		this.pedidoProdutoID = pedidoProdutoID;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
