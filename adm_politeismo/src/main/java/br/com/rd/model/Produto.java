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
	
	
	private String nomeCategoria;
	private String nomeDepartamento;
	private String nomeFornecedor;
	
	public Produto(String nome, Integer estoque, Double preco, String categoria, String departamento,
			String fornecedor) {
		this.nome = nome;
		this.estoque = estoque;
		this.preco = preco;
		this.nomeCategoria = categoria;
		this.nomeDepartamento = departamento;
		this.nomeFornecedor = fornecedor;
	}

	public Produto(String nomeBack, String descricaoBack, String urlProdutoBack, Double volumeBack1, Double pesoBack1,
			Double precoBack1, Integer estoqueBack1, Integer departamentoBack1, Integer categoriaBack1,
			Double destaqueBack1, Integer fornecedorBack1) {
		
		this.nome = nomeBack;
		this.descricao = descricaoBack;
		this.urlProduto = urlProdutoBack;
		this.volume = volumeBack1;
		this.peso = pesoBack1;
		this.preco = precoBack1;
		this.estoque = estoqueBack1;
		this.departamento = departamentoBack1;
		this.categoria = categoriaBack1;
		this.produtoDestaque = destaqueBack1;
		this.fornecedor = fornecedorBack1;	
	}


	public Produto(String nome2, String descricao2, String urlProduto2, Double volume2, Double peso2, Double preco2,
			Integer quantidade, Integer departamento2, Integer categoria2, Integer fornecedor2, Double destaque) {
		this.nome = nome2;
		this.descricao = descricao2;
		this.urlProduto=urlProduto2;
		this.volume=volume2;
		this.peso=peso2;
		this.preco=preco2;
		this.estoque = quantidade;
		this.departamento= departamento2;
		this.categoria = categoria2;
		this.fornecedor=fornecedor2;
		this.produtoDestaque= destaque;
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

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoRia) {
		this.nomeCategoria = nomeCategoRia;
	}

	public String getNomeDepartamento() {
		return nomeDepartamento;
	}

	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

}