package br.com.rd.politeismo.ecommerce.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Fisica extends Cliente{
	
	@Column(nullable = false)
	private String cpf;
	
	@Column(nullable = false)
	private LocalDate nascimento;
	
	@ManyToOne
	@JoinColumn(name="fk_id_sexo", nullable = false)
	private Sexo sexo;
	
	@ManyToMany(mappedBy="clientesFisica",fetch = FetchType.EAGER)
	private List<Endereco> enderecos;

	public Fisica() {

	}

	public Fisica(String cpf, LocalDate nascimento, Sexo idSexo) {
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.sexo = idSexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public Sexo getIdSexo() {
		return sexo;
	}

	public void setIdSexo(Sexo idSexo) {
		this.sexo = idSexo;
	}


	
}// end class

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
