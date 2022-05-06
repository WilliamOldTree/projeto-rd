package br.com.qsd.politeismo.ecommerce.entities;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

public class ItemPedido {

	private Long id;
//	private List<Produto> produtos;

	@ManyToMany(mappedBy = "pedidos", fetch = FetchType.EAGER)
	private List<Pedido> pedidos;
//	private Integer quantidade;

}
