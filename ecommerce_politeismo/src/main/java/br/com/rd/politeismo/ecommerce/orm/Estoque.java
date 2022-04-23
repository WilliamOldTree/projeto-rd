package br.com.rd.politeismo.ecommerce.orm;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


//@Entity
//@Table(name = "ESTOQUE")
//public class Estoque {
//
//	public Estoque() {
//		// TODO Auto-generated constructor stub
//	}
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="ID_ESTOQUE")
//	private Long idEstoque;
//	
//	@Column(nullable = true, name = "QUANTIDADE")
//	private Long quantidade;
//
//	@OneToMany(mappedBy ="estoque")
//    private List<Produto> produtos;
//	
//	
//	public List<Produto> getProdutos() {
//		return produtos;
//	}
//
//	
//
//	public Long getIdEstoque() {
//		return idEstoque;
//	}
//
//	public void setIdEstoque(Long idEstoque) {
//		this.idEstoque = idEstoque;
//	}
//
//	public Long getQuantidade() {
//		return quantidade;
//	}
//
//	public void setQuantidade(Long quantidade) {
//		this.quantidade = quantidade;
//	}
//
//
//}
