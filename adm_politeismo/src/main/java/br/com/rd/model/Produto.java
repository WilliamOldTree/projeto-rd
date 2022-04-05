package br.com.rd.model;

public class Produto {
	private Integer id;
	private String descricao;
	private String volume;
	private String peso;
	private String preco;
	private Integer quantidade;
	private Double desconto;
	private Boolean status_produto;

	public Produto(String descricao, String volume, String peso, String preco, Integer quantidade) {
		super();
		this.descricao = descricao;
		this.volume = volume;
		this.peso = peso;
		this.preco = preco;
		this.quantidade = quantidade;
	}



	public Produto(String descricaoBack1, String volumeBack1, String pesoBack1, String precoBack1, Integer quantidadeBack1,
			Double descontoBack1) {
		this.descricao = descricaoBack1;
		this.volume = volumeBack1;
		this.peso = pesoBack1;
		this.preco = precoBack1;
		this.quantidade = quantidadeBack1;	
		this.desconto = descontoBack1;	

		}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", volume=" + volume + ", peso=" + peso
				+ ", situacao=" + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
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

	public Boolean getStatus_produto() {
		return status_produto;
	}

	public void setStatus_produto(Boolean status_produto) {
		this.status_produto = status_produto;
	}
}