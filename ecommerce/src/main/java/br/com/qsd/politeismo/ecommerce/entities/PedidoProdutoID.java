package br.com.qsd.politeismo.ecommerce.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PedidoProdutoID implements Serializable{
	
    private static final long serialVersionUID = 1L;
    
    @Column(name = "id_pedido")
	private Long idPedido;
    
    @Column(name = "id_produto")
	private Long idProduto;
	
	public PedidoProdutoID() {
		
	}

	public PedidoProdutoID(Long idPedido, Long idProduto) {
		this.idPedido = idPedido;
		this.idProduto = idProduto;
	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

}
