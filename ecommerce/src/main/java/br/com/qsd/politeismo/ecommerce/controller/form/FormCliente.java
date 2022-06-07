package br.com.qsd.politeismo.ecommerce.controller.form;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import br.com.qsd.politeismo.ecommerce.enums.Genero;

public class FormCliente {

	private String cpf;
    private String nome;
    private String email;
    private String password;
    private String celular;
    private String fixo;
    private String nascimento;
    
	@Enumerated(EnumType.STRING)
    private Genero genero;
	
	public FormCliente() {
		
	}


	public FormCliente(String cpf, String nome, String email, String password, String celular, String fixo,
			String nascimento, Genero genero) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.password = password;
		this.celular = celular;
		this.fixo = fixo;
		this.nascimento = nascimento;
		this.genero = genero;
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

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
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
	

}
