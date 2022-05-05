package br.com.qsd.politeismo.ecommerce.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TELEFONE")
public class Telefone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ddd;
	private String celular;
	private String fixo;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
//	@ManyToOne
//	@JoinColumn(name = "id_fornecedor")
//	private Fornecedor fornecedor;
	
	
	public Telefone() {
	}
	
	public Telefone(Long id, String ddd, String celular, String fixo, Cliente cliente) {
		this.id = id;
		this.ddd = ddd;
		this.celular = celular;
		this.fixo = fixo;
		this.cliente = cliente;
//		this.fornecedor = fornecedor;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDdd() {
		return ddd;
	}


	public void setDdd(String ddd) {
		this.ddd = ddd;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getFixo() {
		return fixo;
	}


	public void setFixo(String fixo) {
		this.fixo = fixo;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


//	public Fornecedor getFornecedor() {
//		return fornecedor;
//	}
//
//
//	public void setFornecedor(Fornecedor fornecedor) {
//		this.fornecedor = fornecedor;
//	}
	
}
