package br.com.qsd.politeismo.ecommerce.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="item_pedido")
public class ItemPedido {
	
	@EmbeddedId
	private PedidoProdutoID pedidoProdutoID;
	
	@ManyToOne
    @JoinColumn(name = "id_pedido", insertable = false, updatable = false)
	private Pedido idPedido;	
	
	@ManyToOne
    @JoinColumn(name = "id_produto", insertable = false, updatable = false)
	private Produto idProduto;	
	
	private Integer quantidade;

	public ItemPedido() {}

	public ItemPedido(Pedido idPedido, Produto idProduto, Integer quantidade) {
		
		this.idPedido = idPedido;
		this.idProduto = idProduto;
		this.quantidade = quantidade;
		
	}

	public ItemPedido(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public PedidoProdutoID getPedidoProdutoID() {
		return pedidoProdutoID;
	}

	public void setPedidoProdutoID(PedidoProdutoID pedidoProdutoID) {
		this.pedidoProdutoID = pedidoProdutoID;
	}

	public Pedido getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Pedido idPedido) {
		this.idPedido = idPedido;
	}

	public Produto getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Produto idProduto) {
		this.idProduto = idProduto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
}//end class
