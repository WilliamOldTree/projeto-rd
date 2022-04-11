package br.com.rd.politeismo.ecommerce.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	public ItemPedido() {

	}

	public ItemPedido(Long produtoIdProduto, Long pedidoIdPedido, Integer quantidade) {
		this.produtoIdProduto = produtoIdProduto;
		this.pedidoIdPedido = pedidoIdPedido;
		this.quantidade = quantidade;
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

	@Override
	public String toString() {
		return "ItemPedido [produtoIdProduto=" + produtoIdProduto + ", pedidoIdPedido=" + pedidoIdPedido
				+ ", quantidade=" + quantidade + "]";
	}

}// end class
