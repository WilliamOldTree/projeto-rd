
package br.com.rd.model;

import java.time.LocalDate;

public class Cliente {
	
	private Long id_cliente;
	private String cpf;
	private String nome;
	private String email;
	private String senha;
	private LocalDate nascimento;
	private String fixo;
	private String celular;
	
	
	public Cliente(Long id_cliente, String cpf, String nome, String email, String senha, LocalDate nascimento,
			String fixo, String celular) {
		super();
		this.id_cliente = id_cliente;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.nascimento = nascimento;
		this.fixo = fixo;
		this.celular = celular;
	}


	public Long getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
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


	public LocalDate getNascimento() {
		return nascimento;
	}


	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}


	public String getFixo() {
		return fixo;
	}


	public void setFixo(String fixo) {
		this.fixo = fixo;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	
		
	

}//end class

