//
//package br.com.rd.model;
//
//import java.time.LocalDate;
//
//public class Cliente {
//	
//	private Long id;
//	private String cpf;
//	private String nome;
//	private String email;
//	private String senha;
//	private LocalDate nascimento;
//	private String fixo;
//	private String celular;
//	
//	public Cliente(Long id, String cpf, String nome, String email, String senha, LocalDate nascimento,
//			String fixo, String celular) {
//		super();
//		this.id = id;
//		this.cpf = cpf;
//		this.nome = nome;
//		this.email = email;
//		this.senha = senha;
//		this.nascimento = nascimento;
//		this.fixo = fixo;
//		this.celular = celular;
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
//	public String getCpf() {
//		return cpf;
//	}
//
//	public void setCpf(String cpf) {
//		this.cpf = cpf;
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
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getSenha() {
//		return senha;
//	}
//
//	public void setSenha(String senha) {
//		this.senha = senha;
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
//	public String getFixo() {
//		return fixo;
//	}
//
//	public void setFixo(String fixo) {
//		this.fixo = fixo;
//	}
//
//	public String getCelular() {
//		return celular;
//	}
//
//	public void setCelular(String celular) {
//		this.celular = celular;
//	}
//	
//	
//}//end class
//




package br.com.rd.model;

import java.time.LocalDate;

public class Cliente {
	
	private Long id;
	private String cpf;
	private String nome;
	private String email;
	private String senha;
	private LocalDate nascimento;
	private String fixo;
	private String celular;
	private Endereco endereco;
	public Cliente(Long id, String cpf, String nome, String email, String senha, LocalDate nascimento, String fixo,
			String celular, Endereco endereco) {
		super();
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.nascimento = nascimento;
		this.fixo = fixo;
		this.celular = celular;
		this.endereco = endereco;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}//end class




