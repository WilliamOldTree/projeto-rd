package br.com.rd.model;

public class Fornecedor {

	private Integer id;
	private String razao;
	private String cnpj;
	private String email;
	private Boolean status_fornecedor;


	public Fornecedor(String razao, String cnpj, String email) {
		super();
		this.razao = razao;
		this.cnpj = cnpj;
		this.email = email;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getRazao() {
		return razao;
	}


	public void setRazao(String razao) {
		this.razao = razao;
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


	
	public String toString() {
		return "Fornecedor [id=" + id + ", razao=" + razao + ", cnpj=" + cnpj + ", email=" + email + "]";
	}


	public Boolean getStatus_fornecedor() {
		return status_fornecedor;
	}


	public void setStatus_fornecedor(Boolean status_fornecedor) {
		this.status_fornecedor = status_fornecedor;
	}
	
	
	
}