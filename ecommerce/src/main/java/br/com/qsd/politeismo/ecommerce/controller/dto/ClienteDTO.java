package br.com.qsd.politeismo.ecommerce.controller.dto;

import java.time.LocalDate;

import br.com.qsd.politeismo.ecommerce.entities.Cliente;

public class ClienteDTO {
	
	private Long id_cliente;
    private String cpf;
    private String nome;
    private String email;
    private LocalDate nascimento;
    private String Celular;
    private String Fixo;
    public ClienteDTO () {
    	
    }



	public ClienteDTO(Long id_cliente, String cpf, String nome, String email, LocalDate nascimento, String celular,
			String fixo) {
		super();
		this.id_cliente = id_cliente;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.nascimento = nascimento;
		this.Fixo = fixo;
		this.Celular = celular;
	}



	public ClienteDTO(Cliente cliente) {
		id_cliente=cliente.getId();
		cpf=cliente.getCpf();
		nome=cliente.getNome();
		email=cliente.getEmail();
		nascimento=cliente.getNascimento();
		Celular = cliente.getCelular();
		Fixo = cliente.getFixo();
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

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
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
