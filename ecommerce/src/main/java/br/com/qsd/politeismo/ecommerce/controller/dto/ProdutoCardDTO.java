package br.com.qsd.politeismo.ecommerce.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.qsd.politeismo.ecommerce.entities.Produto;

public class ProdutoCardDTO {

	private String nome;
	
	private String urlProduto;
		
	private String preco;

	public ProdutoCardDTO(String nome, String urlProduto, String preco) {
		this.nome = nome;
		this.urlProduto = urlProduto;
		this.preco = preco;

	}
	
	public ProdutoCardDTO(Produto produto) {
		nome = produto.getNome();
		urlProduto = produto.getUrlProduto();
		preco = produto.getPreco();
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrlProduto() {
		return urlProduto;
	}

	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	public static List<ProdutoCardDTO> converter(List<Produto> produtos) {
		return produtos.stream().map(ProdutoCardDTO::new).collect(Collectors.toList());
	}
	
}
