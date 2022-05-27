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

public class Cliente {
	
	private Long id;
	private String cpf;
	private String nome;
	private String email;
	private String senha;
	private String nascimento;
	private String fixo;
	private String genero;
	private String celular;
	private String apelido;
	private String logradouro;
	private String tipo;
	private String numero;
	private String cep;
	private String cidade;
	private String bairro;
	private String estado;
	

	public Cliente(Long id, String cpf, String nome, String email, String senha, String nascimento, String fixo,
			String celular, String apelido, String nomeLogradouro, String tipoLogradouro, String numero, String cep,
			String cidade, String bairro, String estado,String genero) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.nascimento = nascimento;
		this.fixo = fixo;
		this.celular = celular;
		this.apelido = apelido;
		this.logradouro = nomeLogradouro;
		this.tipo = tipoLogradouro;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.bairro = bairro;
		this.estado = estado;	
		this.genero = genero;
	
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

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getFixo() {
		return fixo;
	}

	public void setFixo(String fixo) {
		this.fixo = fixo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
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




