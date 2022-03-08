package br.com.rd.model;

public class Produto {
	private Integer id;
	private String descricao;
	private String volume;
	private String peso;
	private String situacao;
	private String preco;
	private Integer quantidade;
	private Integer desconto;

	public Produto(String descricao, String volume, String peso, String situacao, String preco, Integer quantidade, Integer desconto) {
		super();
		this.descricao = descricao;
		this.volume = volume;
		this.peso = peso;
		this.situacao = situacao;
		this.preco = preco;
		this.quantidade = quantidade;
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", volume=" + volume + ", peso=" + peso
				+ ", situacao=" + situacao + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}

	public Produto(String descricao2, String volume2, String peso2, String situacao2, String preco2,
			Integer quantidade2) {
		this.descricao = descricao2;
		this.volume = volume2;
		this.peso = peso2;
		this.situacao = situacao2;
		this.preco = preco2;
		this.quantidade = quantidade2;
	}

	public Integer getDesconto() {
		return desconto;
	}

	public void setDesconto(Integer desconto) {
		this.desconto = desconto;
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
	
	public String getSituacao() {
		return situacao;
	}
	
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}
