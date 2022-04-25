package br.com.rd.politeismo.ecommerce.entities;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	@Column(nullable = false)
	private Integer quantidade;

	@Column(name= "fl_inativo")
	private Boolean flInativo; // flag inativo

	@ManyToOne
	@JoinColumn(name="fk_id_departamento", nullable = false)
	private Departamento departamento;

	@ManyToOne
	@JoinColumn(name="fk_id_categoria", nullable = false)
	private Categoria categoria;

	@ManyToOne
	@JoinColumn(name="fk_id_produto_destaque", nullable = false)
	private ProdutosDestaque destaque;

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

	public boolean isFlInativo() {
		return flInativo;
	}

	public void setFlInativo(boolean flInativo) {
		this.flInativo = flInativo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public ProdutosDestaque getDestaque() {
		return destaque;
	}

	public void setDestaque(ProdutosDestaque destaque) {
		this.destaque = destaque;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", volume=" + volume + ", peso=" + peso + ", preco="
				+ preco + ", quantidade=" + quantidade + ", flInativo=" + flInativo + ", departamento=" + departamento
				+ ", categoria=" + categoria + ", destaque=" + destaque + "]";
	}

}
