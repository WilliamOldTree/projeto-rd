package br.com.qsd.politeismo.ecommerce.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.qsd.politeismo.ecommerce.entities.Produto;

public class ProdutoCardDTO {

	private Long id;

	private String nome;

	private String urlProduto;

	private String preco;

	private Integer estoque;

	private Integer quantidade = 1;

	public ProdutoCardDTO(String nome, String urlProduto, String preco) {
		this.nome = nome;
		this.urlProduto = urlProduto;
		this.preco = preco;

	}

	public ProdutoCardDTO(Produto produto) {
		id = produto.getIdProduto();
		nome = produto.getNome();
		urlProduto = produto.getUrlProduto();
		preco = produto.getPreco();
		estoque = produto.getEstoque();
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

	public Integer getQuantidade() {
		return quantidade;
	}
	
	

	public Long getId() {
		return id;
	}

	public Integer getEstoque() {
		return estoque;
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
