package br.com.rd.model;

public class Produto {
	private int id;
	private String descricao;
	private Double volume;
	private Double peso;
	private String situacao;
	private Double preco;
	private int quantidade;
	private Double desconto;
	
	public Produto(String descricao, Double volume, Double peso, String situacao, Double preco, int quantidade, Double desconto) {
		super();
		this.descricao = descricao;
		this.volume = volume;
		this.peso = peso;
		this.situacao = situacao;
		this.preco = preco;
		this.quantidade = quantidade;
		this.desconto = desconto;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getVolume() {
		return volume;
	}
	
	public void setVolume(Double volume) {
		this.volume = volume;
	}
	
	public Double getPeso() {
		return peso;
	}
	
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	public String getSituacao() {
		return situacao;
	}
	
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double getDesconto() {
		return desconto;
	}
	
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
}
