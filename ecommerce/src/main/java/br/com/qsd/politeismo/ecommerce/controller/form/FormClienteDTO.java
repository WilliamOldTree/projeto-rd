package br.com.qsd.politeismo.ecommerce.controller.form;

import java.time.LocalDate;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.enums.Genero;

public class FormClienteDTO {

	private String cpf;
    private String nome;
    private String email;
    private String password;
    private LocalDate nascimento;
    
	@Enumerated(EnumType.STRING)
    private Genero genero;
	
	public FormClienteDTO() {
		
	}

	public FormClienteDTO(String cpf, String nome, String email, String password, LocalDate nascimento, Genero genero) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.password = password;
		this.nascimento = nascimento;
		this.genero = genero;
	}
	
	public FormClienteDTO(Cliente entity) {
		cpf = entity.getCpf();
		nome = entity.getNome();
		email = entity.getEmail();
		password = entity.getPassword();
		nascimento = entity.getNascimento();
		genero = entity.getGenero();
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
}
