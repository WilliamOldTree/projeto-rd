package br.com.rd.model;

public class Fornecedor {

	private Integer id;
	private String razaoSocial;
	private String cnpj;
	private String email;
	private String telefone;
	private Boolean flInativo;
	
	public Fornecedor(String razaoSocial, String cnpj, String email, String telefone) {
		this.razaoSocial = razaoSocial;
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