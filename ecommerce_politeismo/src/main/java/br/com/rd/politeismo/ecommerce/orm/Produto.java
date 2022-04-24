package br.com.rd.politeismo.ecommerce.orm;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
	
	@Id
	@Column(name= "id_produto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy="produto")
	List<ProdutosDestaque>produtosdestaque;
	
public List<ProdutosDestaque> getProdutosdestaque() {
		return produtosdestaque;
	}

	
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
	
	//Para relacionamentos

//@ManyToOne
//@JoinColumn(name = "CATEGORIA_ID_CATEGORIA")
//private Categoria categoria;
	
@ManyToOne
@JoinColumn(name = "ESTOQUE_ID_ESTOQUE")
private Estoque estoque;



	public Estoque getEstoque() {
	return estoque;
}


public void setEstoque(Estoque estoque) {
	this.estoque = estoque;
}


	public boolean isFlInativo() {
	return flInativo;
}


public void setFlInativo(boolean flInativo) {
	this.flInativo = flInativo;
}


//public Categoria getCategoria() {
//	return categoria;
//}
//
//
//public void setCategoria(Categoria categoria) {
//	this.categoria = categoria;
//}


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





	
}
