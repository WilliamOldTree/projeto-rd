package br.com.qsd.politeismo.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PRODUTO")
	private Long idProduto;

	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private String volume;
	
	@Column(nullable = false)
	private String peso;
	
	@Column(name = "fl_inativo")
	private boolean flInativo = true; // flag inativo
	
	@Column(nullable = false)
	private String preco;
	
	@Column(nullable = false)
	private Integer estoque;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_produto_destaque",nullable = false)
	private ProdutoDestaque produtoDestaque;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_categoria", nullable = false)
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_departamento", nullable = false)
	private Departamento departamento;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_fornecedor", nullable = false)
	private Fornecedor fornecedor;

	
	public Long getId_produto() {

		return idProduto;
	}

	public void setId_produto(Long id_produto) {

		this.idProduto = id_produto;
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

	public boolean isFlInativo() {
		return flInativo;
	}

	public void setFlInativo(boolean flInativo) {
		this.flInativo = flInativo;
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

	public ProdutoDestaque getProdutoDestaque() {
		return produtoDestaque;
	}

	public void setProdutoDestaque(ProdutoDestaque produtoDestaque) {
		this.produtoDestaque = produtoDestaque;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	

}// end