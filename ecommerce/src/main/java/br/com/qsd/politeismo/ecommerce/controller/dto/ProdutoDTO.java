package br.com.qsd.politeismo.ecommerce.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.qsd.politeismo.ecommerce.entities.Produto;

public class ProdutoDTO {
	
	private Long idProduto;

	private String nome;
	
	private String urlProduto;

	private String descricao;
	
	private String volume;
	
	private String peso;
		
	private String preco;

	private Integer estoque;
    
	public ProdutoDTO(Long idProduto, String nome, String urlProduto, String descricao, String volume, String peso,
			String preco, Integer estoque) {
		
		this.idProduto = idProduto;
		this.nome = nome;
		this.urlProduto = urlProduto;
		this.descricao = descricao;
		this.volume = volume;
		this.peso = peso;
		this.preco = preco;
		this.estoque = estoque;
	}

	public ProdutoDTO(Produto produto) {
		idProduto = produto.getIdProduto();
		nome = produto.getNome();
		urlProduto = produto.getUrlProduto();
		descricao = produto.getDescricao();
		volume = produto.getVolume();
		peso = produto.getPeso();
		preco = produto.getPreco();
		estoque = produto.getEstoque();
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	
	public static List<ProdutoDTO> converter(List<Produto> produtos) {
		return produtos.stream().map(ProdutoDTO::new).collect(Collectors.toList());
	}
	
}
