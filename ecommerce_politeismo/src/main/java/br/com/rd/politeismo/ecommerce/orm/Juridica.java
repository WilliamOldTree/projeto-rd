package br.com.rd.politeismo.ecommerce.orm;

import java.time.LocalDate;

import javax.persistence.Entity;



@Entity
public class Juridica extends Cliente {

	private String cnpj;
	private LocalDate abertura;
	private String inscricaoEstadual;
	private String razaoSocial;
	
	public Juridica() {
		
	}
	
	public Juridica(String cnpj, LocalDate abertura, String inscricaoEstadual, String razaoSocial) {
		super();
		this.cnpj = cnpj;
		this.abertura = abertura;
		this.inscricaoEstadual = inscricaoEstadual;
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public LocalDate getAbertura() {
		return abertura;
	}

	public void setAbertura(LocalDate abertura) {
		this.abertura = abertura;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	
}// end class
