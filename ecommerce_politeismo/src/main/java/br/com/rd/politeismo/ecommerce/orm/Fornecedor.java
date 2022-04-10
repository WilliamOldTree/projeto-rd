package br.com.rd.politeismo.ecommerce.orm;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fornecedor")
public class Fornecedor {

	@Id
	@Column(name = "id_fornecedor")
	private Long id;

	@Column(nullable = false)
	private String razaoSocial;

	@Column(unique = true, nullable = false)
	private String cnpj;

	@Column(nullable = false)
	private String email;

	@Column(name = "fl_inativo")
	private boolean flInativo = true; // flag inativo

	// Para associativa c/ produto
	private List<Produto> produto;

	public Fornecedor() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	@Override
	public String toString() {
		return "Fornecedor [ID: " + id + ", Razao Social: " + razaoSocial + ", CNPJ: " + cnpj + ", Email=" + email
				+ "]";
	}

}
