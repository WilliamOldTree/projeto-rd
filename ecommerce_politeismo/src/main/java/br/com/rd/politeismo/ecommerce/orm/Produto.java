package br.com.rd.politeismo.ecommerce.orm;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
	
	@Id
	@Column(name= "id_produto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private Double volume;
	
	@Column(nullable = false)
	private Double peso;

	@Column(nullable = false)
	private BigDecimal preco;
	
	@Column(name= "fl_inativo")
	private boolean flInativo = true; // flag inativo
	
	@Column(name ="estoque_produto",nullable = false)
	private Estoque estoqueProduto;
	
	@Column(name ="produto_destaque_id_produto_destaque", nullable = false)
	private ProdutoDestaque produtoDestaque;
	
	
	
	//Para associativa c/ departamento_categoria_produto
	private List<Categoria> categoria;
	private List<Departamento> departamento;
	
	//Para associativa c/ fornecedor
	private List<Fornecedor> fornecedor;
	
	//Para associativa c/ favoritos
	private List<Favoritos> favoritos;



	public Produto() {
		
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Estoque getEstoqueProduto() {
		return estoqueProduto;
	}

	public void setEstoqueProduto(Estoque estoqueProduto) {
		this.estoqueProduto = estoqueProduto;
	}

	public ProdutoDestaque getProdutoDestaque() {
		return produtoDestaque;
	}

	public List<Categoria> getCategoria() {
		return categoria;
	}

	public List<Departamento> getProduto() {
		return departamento;
	}

	public List<Fornecedor> getFornecedor() {
		return fornecedor;
	}
	
	public List<Favoritos> getFavoritos() {
		return favoritos;
	}

	@Override
	public String toString() {
		return "Produto [ID: " + id + ", Descricao: " + descricao + ", Volume: " + volume + ", Peso: " + peso + ", Preco: "
				+ preco + ", Categoria: " + categoria + ", Departamento: " + departamento + "]";
	}

	
}
