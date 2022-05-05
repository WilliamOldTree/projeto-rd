
package br.com.rd.model;

public class DetalhesFisica {
	
	private Integer id;
	private String nome;
	private String cpf;
	private String ddd;
	private String celular;
	private String logradouro;
	private String tipo_logradouro;
	private String numeracao;
	private String cep;
	private String cidade;
	private String estado;
	
	
	public DetalhesFisica( Integer id, String nome, String cpf, String ddd, String celular, String logradouro,
			String tipo_logradouro, String numeracao, String cep, String cidade, String estado) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.ddd = ddd;
		this.celular = celular;
		this.logradouro = logradouro;
		this.tipo_logradouro = tipo_logradouro;
		this.numeracao = numeracao;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getDdd() {
		return ddd;
	}


	public void setDdd(String ddd) {
		this.ddd = ddd;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getTipo_logradouro() {
		return tipo_logradouro;
	}


	public void setTipo_logradouro(String tipo_logradouro) {
		this.tipo_logradouro = tipo_logradouro;
	}


	public String getNumeracao() {
		return numeracao;
	}


	public void setNumeracao(String numeracao) {
		this.numeracao = numeracao;
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


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
}//end class


