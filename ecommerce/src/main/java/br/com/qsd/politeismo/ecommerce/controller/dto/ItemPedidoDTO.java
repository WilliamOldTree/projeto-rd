package br.com.qsd.politeismo.ecommerce.controller.dto;



import java.util.List;
import java.util.stream.Collectors;

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
	
	

//	public void setPedidoProdutoID(PedidoProdutoID pedidoProdutoID) {
//		this.pedidoProdutoID = pedidoProdutoID;
//	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public static List <ItemPedidoDTO> converter(List<ItemPedido> itensPedido){	
		return itensPedido.stream().map(ItemPedidoDTO::new).collect(Collectors.toList());
		
	}
	
}//end calss

