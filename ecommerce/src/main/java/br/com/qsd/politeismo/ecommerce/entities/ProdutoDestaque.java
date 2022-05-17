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
  private Long id;

  @Column(nullable = false)
  private Double desconto;

  @OneToMany(mappedBy = "produtoDestaque")
  private  List<Produto> produtos;


  public ProdutoDestaque() {
	
  }



  public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
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

