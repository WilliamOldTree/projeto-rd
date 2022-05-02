//package br.com.rd.politeismo.ecommerce.orm;
//
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//
//@Entity
//@Table(name = "FORMA")
//public class Forma {
//
//	@Id
//	@Column(name = "id_forma")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//
//	
//	@ManyToOne
//	@JoinColumn(name="cliente_id_cliente", nullable = false)
//	private Cliente cliente;
//	
//	public Cliente getCliente() {
//		return cliente;
//	}
//
//	public void setCliente(Cliente cliente) {
//		this.cliente = cliente;
//	}
//
//	@Column(nullable = false)
//	private String instituicao;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getInstituicao() {
//		return instituicao;
//	}
//
//	public void setInstituicao(String instituicao) {
//		this.instituicao = instituicao;
//	}
//
//}
//
