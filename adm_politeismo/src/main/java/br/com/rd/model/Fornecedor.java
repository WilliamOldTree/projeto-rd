package br.com.rd.model;

public class Fornecedor {

	private Integer id;
	private String razao;
	private String cnpj;
	private String email;
	private String telefone;
	private Boolean flInativo;
	
	
	public Fornecedor(String razao, String cnpj, String email, String telefone) {
		super();
		this.razao = razao;
		this.cnpj = cnpj;
		this.email = email;
		this.telefone = telefone;
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Boolean getFlInativo() {
		return flInativo;
	}
	public void setFlInativo(Boolean flInativo) {
		this.flInativo = flInativo;
	}

	
}