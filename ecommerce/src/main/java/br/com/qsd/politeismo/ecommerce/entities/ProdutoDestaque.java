package br.com.qsd.politeismo.ecommerce.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO_DESTAQUE")
public class ProdutoDestaque {
 
  @Id
  @Column(name = "id_produto_destaque")
  @GeneratedValue(strategy = GenerationType.IDENTITY) 
  private Long id_produto_destaque;

  @Column(nullable = false)
  private Double desconto;

  @OneToMany(mappedBy = "produtoDestaque")
  private  List<Produto> produtos;


  public ProdutoDestaque() {
	
  }

  public Long getId_produto_destaque() {
	return id_produto_destaque;
  }

  public void setId_produto_destaque(Long id_produto_destaque) {
	this.id_produto_destaque = id_produto_destaque;
  }

  public Double getDesconto() {
	return desconto;
  }

  public void setDesconto(Double desconto) {
	this.desconto = desconto;
  }

  public List<Produto> getProduto() {
	return produtos;
  }


}

