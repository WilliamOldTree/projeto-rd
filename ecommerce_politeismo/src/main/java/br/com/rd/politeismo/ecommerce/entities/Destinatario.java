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
//@Table(name = "DESTINATARIO")
//public class Destinatario {
//
//	@Id
//	@Column(name = "id_destinatario")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//
//	@Column(nullable = false)
//	private String tipo;
//	
//	@OneToMany(mappedBy = "destinatario")
//	private List<Operacao> operacao;	
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
//	@Override
//	public String toString() {
//		return "Destinario [id=" + id + ", tipo=" + tipo + "]";
//	}
//
//}