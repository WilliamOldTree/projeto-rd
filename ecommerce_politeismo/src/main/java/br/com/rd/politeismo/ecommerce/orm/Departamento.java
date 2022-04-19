//package br.com.rd.politeismo.ecommerce.orm;
//
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//
//@Entity
//@Table(name="departamento")
//public class Departamento {
//	
//	@Id
//	@Column(name= "id_departamento")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//	
//	@Column(nullable = false)
//    private String nome;
//
//	@Column(name = "fl_inativo")
//	private boolean flInativo = true; // flag inativo
//	
//	
//	
//	
//	
//	
//	
//	public Departamento() {
//		
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
//	public String getNome() {
//		return nome;
//	}
//	
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	
//
//}
