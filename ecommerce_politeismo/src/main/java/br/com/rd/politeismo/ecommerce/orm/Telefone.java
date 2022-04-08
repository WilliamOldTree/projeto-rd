package br.com.rd.politeismo.ecommerce.orm;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;


@Entity
@Table(name = "TELEFONE")
public class Telefone {

	@Id
	@Column(name= "id_telefone")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	@Column(nullable = false)
	private int ddd;
	private String celular;
	
	@Column(nullable = true)
	private String fixo;
	
	private Cliente cliente ;
	
	
	private Fornecedor fornecedor;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getDdd() {
		return ddd;
	}


	public void setDdd(int ddd) {
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


	public Fornecedor getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}


	@Override
	public String toString() {
		return "Telefone [id=" + id + ", ddd=" + ddd + ", celular=" + celular + ", fixo=" + fixo + ", fornecedor="
				+ fornecedor + "]";
	}


}
