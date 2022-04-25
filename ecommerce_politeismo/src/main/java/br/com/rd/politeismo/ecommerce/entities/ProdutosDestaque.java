package br.com.rd.politeismo.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO_DESTAQUE")

public class ProdutosDestaque {

	@Id
	@Column(name = "id_produto_destaque")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_produto_destaque;
	
	@Column(nullable = false)
	private Double desconto;
	
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
<<<<<<< HEAD:EcoormecePoliteismo/src/main/java/br/com/rd/queroserdev/loja/mvc/model/ProdutosDestaque.java
<<<<<<< HEAD

	@Override
	public String toString() {
		return "ProdutosDestaque [id_produto_destaque=" + id_produto_destaque + ", desconto=" + desconto + "]";
	}
	
	
}

=======
}
	
>>>>>>> b021456381f5b7a75b450be99b2033625ca84e5a
=======
}
>>>>>>> 12ce479fdda516b02add838b91e153c6ca9c6944:ecommerce_politeismo/src/main/java/br/com/rd/politeismo/ecommerce/entities/ProdutosDestaque.java
