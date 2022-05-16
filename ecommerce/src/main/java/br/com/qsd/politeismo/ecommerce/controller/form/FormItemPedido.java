package br.com.qsd.politeismo.ecommerce.controller.form;

public class FormItemPedido {
	
	private String idPedido;	
	
	private String idProduto;	
	
	private String quantidade;
	
	public FormItemPedido() {
		
	}

	public String getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}

	public String getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

}
