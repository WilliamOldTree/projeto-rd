<<<<<<< HEAD
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


	public ItemPedido() {
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



}
=======
package br.com.qsd.politeismo.ecommerce.entities;


//import java.util.List;

//import javax.persistence.FetchType;
//import javax.persistence.ManyToMany;
//
//public class ItemPedido {
//
//	private Long id;
////	private List<Produto> produtos;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

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


	public ItemPedido() {
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
}
>>>>>>> 4c080c22c4c7cdd9603e7a8907c133b2dea15553
