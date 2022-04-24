//package br.com.rd.politeismo.ecommerce.orm;
//
//import java.time.LocalDate;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "fisica")
//public class Fisica {
//
//	@Id
//	@Column(name = "id_fisica")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	@Column(nullable = false)
//	private LocalDate nascimento;
//
//	private Long idSexo;
//	private Long idCliente;
//
//	public Fisica() {
//
//	}
//
//	public Fisica(Long id, LocalDate nascimento, Long idSexo, Long idCliente) {
//		this.id = id;
//		this.nascimento = nascimento;
//		this.idSexo = idSexo;
//		this.idCliente = idCliente;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public LocalDate getNascimento() {
//		return nascimento;
//	}
//
//	public void setNascimento(LocalDate nascimento) {
//		this.nascimento = nascimento;
//	}
//
//	public Long getIdSexo() {
//		return idSexo;
//	}
//
//	public void setIdSexo(Long idSexo) {
//		this.idSexo = idSexo;
//	}
//
//	public Long getIdCliente() {
//		return idCliente;
//	}
//
//	public void setIdCliente(Long idCliente) {
//		this.idCliente = idCliente;
//	}
//
//	
//
//}// end class
