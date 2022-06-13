package br.com.qsd.politeismo.ecommerce.controller.dto;







import java.util.Date;

import br.com.qsd.politeismo.ecommerce.entities.Cliente;

public class ClienteDTO {
	
	
	private Long id_cliente;
    private String cpf;
    private String nome;
    private String email;
    private String nascimento;
    private String celular;
    private String fixo;
   
   
   
    
    public ClienteDTO () {
    	
    }

	public ClienteDTO(Long id_cliente, String cpf, String nome, String email, String nascimento, String celular,
			String fixo) {
		super();
		this.id_cliente = id_cliente;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.nascimento = nascimento;
		this.celular = celular;
		this.fixo = fixo;
	}

	
	

	public ClienteDTO(Cliente cliente) {
		id_cliente=cliente.getId();
		cpf=cliente.getCpf();
		nome=cliente.getNome();
		email=cliente.getEmail();
		nascimento=cliente.getNascimento();
		celular = cliente.getCelular();
		fixo = cliente.getFixo();
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

	public String getNascimento() {
		
		return nascimento;
	}

	public void setNascimento(String nascimento) {
					
		this.nascimento = nascimento;
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

}//end class
