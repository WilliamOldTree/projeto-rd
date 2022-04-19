package br.com.rd.queroserdev.loja.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="item_pedido")
public class ItemPedido {

	@Id
	@Column(name = "produtoIdProduto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long produtoIdProduto;
	private Long pedidoIdPedido;
	@Column(nullable = false)
	private Integer quantidade;
	
	@ManyToOne
	@JoinColumn(name = "pedido_id_pedido", nullable = false)
	private Pedido pedido;
	

	public ItemPedido() {

	}

	public Long getProdutoIdProduto() {
		return produtoIdProduto;
	}

	public void setProdutoIdProduto(Long produtoIdProduto) {
		this.produtoIdProduto = produtoIdProduto;
	}

	public Long getPedidoIdPedido() {
		return pedidoIdPedido;
	}

	public void setPedidoIdPedido(Long pedidoIdPedido) {
		this.pedidoIdPedido = pedidoIdPedido;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	

}// end class
