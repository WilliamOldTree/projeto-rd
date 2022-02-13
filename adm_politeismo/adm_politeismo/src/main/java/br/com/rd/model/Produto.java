package br.com.rd.model;

public class Produto {
	private Integer id;
	private String descricao;
	private Double volume;
	private Double peso;
	private String situacao;
	private Double preco;
	private Integer estoque;
	private Integer prdtDestaque;

	public Produto(String descricao, Double volume, Double peso, String situacao, Double preco, Integer estoque,
			Integer produtoDestaque) {
		super();
		this.descricao = descricao;
		this.volume = volume;
		this.peso = peso;
		this.situacao = situacao;
		this.preco = preco;
		this.estoque = estoque;
		this.prdtDestaque = produtoDestaque;
	}

	public Produto(Integer id, String descricao, Double volume, Double peso, String situacao, Double preco,
			Integer estoque, Integer prdtDestaque) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.volume = volume;
		this.peso = peso;
		this.situacao = situacao;
		this.preco = preco;
		this.estoque = estoque;
		this.prdtDestaque = prdtDestaque;
	}

	public Produto(Produto produto) {
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

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public int getProdutoDestaque() {
		return prdtDestaque;
	}

	public void setProdutoDestaque(int produtoDestaque) {
		this.prdtDestaque = produtoDestaque;
	}

}
