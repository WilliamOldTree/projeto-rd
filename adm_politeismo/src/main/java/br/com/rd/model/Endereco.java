package br.com.rd.model;

public class Endereco {

	private Long id;
	private String apelido;
	private String logradouro;
	private String tipo;
	private String numero;
	private String cep;
	private String cidade;
	private String bairro;
	private String estado;
	
	
	public Endereco(Long id, String apelido, String logradouro, String tipo, String numero, String cep, String cidade,
			String bairro, String estado) {
		super();
		this.id = id;
		this.apelido = apelido;
		this.logradouro = logradouro;
		this.tipo = tipo;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.bairro = bairro;
		this.estado = estado;
	}

	

	public Endereco(String apelido, String logradouro, String tipo, String numero, String cep, String cidade,
			String bairro, String estado) {
		super();
		this.apelido = apelido;
		this.logradouro = logradouro;
		this.tipo = tipo;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.bairro = bairro;
		this.estado = estado;
	}



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getApelido() {
		return apelido;
	}


	public void setApelido(String apelido) {
		this.apelido = apelido;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
		
}//end class
