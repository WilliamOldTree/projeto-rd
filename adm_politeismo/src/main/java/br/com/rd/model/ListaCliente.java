package br.com.rd.model;

public class ListaCliente {
	
	
	private String nome;
	private String email;
	private String cpfCnpj;
	private String ddd;
	private String contato;
	
	public ListaCliente(String nome, String email, String cpfCnpj, String ddd, String contato) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpfCnpj = cpfCnpj;
		this.ddd = ddd;
		this.contato = contato;
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
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	@Override
	public String toString() {
		return "ListaCliente [nome=" + nome + ", email=" + email + ", cpfCnpj=" + cpfCnpj + ", ddd=" + ddd
				+ ", contato=" + contato + "]";
	}
	
}//end class
