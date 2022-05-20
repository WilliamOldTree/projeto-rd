package br.com.rd.model;

public class Produto {
	private Integer id;
	private String nome;
	private String descricao;
	private String urlProduto;
	private Double volume;
	private Double peso;
	private Double preco;
	private Integer estoque;
	private Integer departamento;
	private Integer categoria;
	private Double produtoDestaque;
	private Integer fornecedor;
	private Boolean fl_inativo;
	
	
	public Produto(String nome, Integer estoque, Double preco, Integer categoria, Integer departamento,
			Integer fornecedor) {
		this.nome = nome;
		this.estoque = estoque;
		this.preco = preco;
		this.categoria = categoria;
		this.departamento = departamento;
		this.fornecedor = fornecedor;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUrlProduto() {
		return urlProduto;
	}
	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
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
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Integer getEstoque() {
		return estoque;
	}
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
	public Integer getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Integer departamento) {
		this.departamento = departamento;
	}
	public Integer getCategoria() {
		return categoria;
	}
	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}
	public Double getProdutoDestaque() {
		return produtoDestaque;
	}
	public void setProdutoDestaque(Double produtoDestaque) {
		this.produtoDestaque = produtoDestaque;
	}
	public Integer getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Integer fornecedor) {
		this.fornecedor = fornecedor;
	}
	public Boolean getFl_inativo() {
		return fl_inativo;
	}
	public void setFl_inativo(Boolean fl_inativo) {
		this.fl_inativo = fl_inativo;
	}
}