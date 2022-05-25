package br.com.qsd.politeismo.ecommerce.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "PRODUTO")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produto")
	private Long idProduto;

	@Column(nullable = false)
	private String nome;
	
	@Column(name= "url_produto", nullable = true)
	private String urlProduto;
	
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
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "fk_id_produto_destaque")
	private ProdutoDestaque produtoDestaque;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "fk_id_categoria", nullable = false)
	private Categoria categoria;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "fk_id_departamento", nullable = false)
	private Departamento departamento;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "fk_id_fornecedor", nullable = false)
	private Fornecedor fornecedor;
	
	@JsonIgnore
	@OneToMany(mappedBy="idProduto")
	private List<ItemPedido> itensPedido;
	
	@JsonIgnore
	@ManyToMany(mappedBy="produtos")
	private List<Favoritos> favoritos;
	
	
	@JsonIgnore 
	@OneToMany(mappedBy="idNotaFiscal") 
	private List<ItemNotaFiscal> itemNotaFiscal; 
	
	public Produto() {
		
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

	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}	
	
	

}// end