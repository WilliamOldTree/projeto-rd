package br.com.rd.model;

public class UserADM {
	private int id;
	private String nome;
	private String cargo;
	private String email;
	private String senha;


	public UserADM(String nome, String cargo, String email) {
		this.nome = nome;
		this.cargo = cargo;
		this.email = email;
	}
	
	public UserADM(String nome, String cargo, String email, String senha) {
		this.nome = nome;
		this.cargo = cargo;
		this.email = email;
		this.senha= senha;
	}
	
	public UserADM() {
		// TODO Auto-generated constructor stub
	}

	public UserADM(String email2, String senha2) {
		this.email = email2;
		this.senha= senha2;
	}

	public UserADM(String nome2) {
		this.nome = nome2;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
