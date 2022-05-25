<<<<<<< HEAD
<<<<<<< HEAD
package br.com.qsd.politeismo.ecommerce.entities;

import java.util.List;

=======
package br.com.qsd.politeismo.ecommerce.entities;

import java.util.List;
>>>>>>> bf78065b9461cca12f96c1fc45cae2a7bc334ede
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

<<<<<<< HEAD
	@Column(nullable = false, name= "nome")
=======
	@Column(nullable = false)
>>>>>>> bf78065b9461cca12f96c1fc45cae2a7bc334ede
	private String nome;
	
	@Column(name= "url_produto", nullable = true)
	private String urlProduto;
	
<<<<<<< HEAD
	@Column(nullable = false, name="descricao")
	private String descricao;

	@Column(nullable = false, name="volume")
	private String volume;
	
	@Column(nullable = false, name="peso")
=======
	@Column(nullable = false)
	private String descricao;

	@Column(nullable = false)
	private String volume;
	
	@Column(nullable = false)
>>>>>>> bf78065b9461cca12f96c1fc45cae2a7bc334ede
	private String peso;
	
	@Column(name = "fl_inativo")
	private boolean flInativo = true; // flag inativo
	
<<<<<<< HEAD
	@Column(nullable = false, name="preco")
	private String preco;
	
	@Column(nullable = false, name="estoque")
=======
	@Column(nullable = false)
	private String preco;
	
	@Column(nullable = false)
>>>>>>> bf78065b9461cca12f96c1fc45cae2a7bc334ede
	private Integer estoque;
	
	@JsonIgnore
	@ManyToOne
<<<<<<< HEAD
	@JoinColumn(name = "fk_id_produto_destaque",nullable = false)
=======
	@JoinColumn(name = "fk_id_produto_destaque")
>>>>>>> bf78065b9461cca12f96c1fc45cae2a7bc334ede
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
<<<<<<< HEAD
	@OneToMany(mappedBy="idProduto") 
=======
	@OneToMany(mappedBy="idNotaFiscal") 
>>>>>>> bf78065b9461cca12f96c1fc45cae2a7bc334ede
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
	
	

<<<<<<< HEAD
=======
package br.com.qsd.politeismo.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	@JoinColumn(name = "fk_id_produto_destaque",nullable = false)
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

>>>>>>> 2a13be4dd739321b0ff51abb2a3466b580a8a98a
=======
>>>>>>> bf78065b9461cca12f96c1fc45cae2a7bc334ede
}// end