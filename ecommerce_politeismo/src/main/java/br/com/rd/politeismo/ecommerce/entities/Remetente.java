package br.com.rd.politeismo.ecommerce.entities;
//package br.com.rd.politeismo.ecommerce.orm;
//
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "REMETENTE")
//public class Remetente {
//
//	@Id
//	@Column(name = "id_remetente")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//
//	@Column(nullable = false)
//	private String tipo;
//	
//	@OneToMany(mappedBy = "remetente")
//	private List<Operacao> operacao;
//
//
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getTipo() {
//		return tipo;
//	}
//
//	public void setTipo(String tipo) {
//		this.tipo = tipo;
//	}
//	
//	public List<Operacao> getOperacao() {
//		return operacao;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Remetente [id=" + id + ", tipo=" + tipo + "]";
//	}
//
//}