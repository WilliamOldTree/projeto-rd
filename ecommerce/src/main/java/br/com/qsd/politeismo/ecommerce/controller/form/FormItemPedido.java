package br.com.qsd.politeismo.ecommerce.controller.form;

public class FormItemPedido {
	
	private String quantidade;
	private String produto;
	private String pedido;
	
	public FormItemPedido() {
		
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	
	
	
}//end class
