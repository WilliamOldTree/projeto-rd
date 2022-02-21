package br.com.rd.model;

import java.util.Date;

public class ClienteFisica extends Cliente {
	
	private String cpf;
	private Date nascimento;
	private String sexo;
	public ClienteFisica(Integer id, String nome, String email, String cpf, Date nascimento, String sexo) {
		super(id, nome, email);
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}//end class
