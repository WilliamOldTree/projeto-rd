package br.com.rd.model;

import java.util.Date;

public class ClienteJuridica extends Cliente {
	
	private String cnpj;
	private Date abertura;
	private String inscricao_estadual;
	private String razao_social;
	public ClienteJuridica(Integer id, String nome, String email, String cnpj, Date abertura, String inscricao_estadual,
			String razao_social) {
		super(id, nome, email);
		this.cnpj = cnpj;
		this.abertura = abertura;
		this.inscricao_estadual = inscricao_estadual;
		this.razao_social = razao_social;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Date getAbertura() {
		return abertura;
	}
	public void setAbertura(Date abertura) {
		this.abertura = abertura;
	}
	public String getInscricao_estadual() {
		return inscricao_estadual;
	}
	public void setInscricao_estadual(String inscricao_estadual) {
		this.inscricao_estadual = inscricao_estadual;
	}
	public String getRazao_social() {
		return razao_social;
	}
	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}
	
	
	
	

}
