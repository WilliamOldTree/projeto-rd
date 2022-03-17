
package br.com.rd.model;

public class DetalhesJuridico {

	private Integer id;
	private String razao_social;
	private String cnpj;
	private String inscricao_estadual;
	private String ddd;
	private String celular;
	private String logradouro;
	private String tipo_logradouro;
	private String numeracao;
	private String cep;
	private String cidade;
	private String estado;
	
	public DetalhesJuridico(String razao_social, String cnpj, String inscricao_estadual, String ddd, String celular,
			String logradouro, String tipo_logradouro, String numeracao, String cep, String cidade, String estado) {
		super();
		this.razao_social = razao_social;
		this.cnpj = cnpj;
		this.inscricao_estadual = inscricao_estadual;
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

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricao_estadual() {
		return inscricao_estadual;
	}

	public void setInscricao_estadual(String inscricao_estadual) {
		this.inscricao_estadual = inscricao_estadual;
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

