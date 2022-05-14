package br.com.qsd.politeismo.ecommerce.controller.form;

import java.time.LocalDate;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.enums.Genero;

public class FormCliente {

	private String cpf;
    private String nome;
    private String email;
    private String password;
    private String Celular;
    private String Fixo;
    private LocalDate nascimento;
    
	@Enumerated(EnumType.STRING)
    private Genero genero;
	
	public FormCliente() {
		
	}

	
	

	
	public FormCliente(String cpf, String nome, String email, String password, String celular, String fixo,
			LocalDate nascimento, Genero genero) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.password = password;
		this.Fixo = fixo;
		this.Celular = celular;
		this.nascimento = nascimento;
		this.genero = genero;
	}





	public FormCliente(Cliente entity) {
		cpf = entity.getCpf();
		nome = entity.getNome();
		email = entity.getEmail();
		password = entity.getPassword();
		nascimento = entity.getNascimento();
		genero = entity.getGenero();
		Celular = entity.getCelular();
		Fixo = entity.getFixo();
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



	public String getCelular() {
		return Celular;
	}



	public void setCelular(String celular) {
		Celular = celular;
	}



	public String getFixo() {
		return Fixo;
	}



	public void setFixo(String fixo) {
		Fixo = fixo;
	}
	
	
	
}
