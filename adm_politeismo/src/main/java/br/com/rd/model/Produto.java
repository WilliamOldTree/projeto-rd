package br.com.rd.model;

public class Produto {
	private Integer id;
	private String descricao;
	private Double volume;
	private Double peso;
	private String situacao;
	private Double preco;
	
	
	public Produto(String descricao, Double volume, Double peso, String situacao, Double preco) {
		super();
		this.descricao = descricao;
		this.volume = volume;
		this.peso = peso;
		this.situacao = situacao;
		this.preco = preco;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
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
}
