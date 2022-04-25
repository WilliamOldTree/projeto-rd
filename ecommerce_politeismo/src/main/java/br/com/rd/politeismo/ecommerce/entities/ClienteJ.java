package br.com.rd.politeismo.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class ClienteJ {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_clienteJ")
	private Long idJ;
	private String nomeJ;
	private String emailJ;
	private String senhaJ;
	

	public ClienteJ () {
		
	}
	
	
	public ClienteJ(Long idJ, String nomeJ, String emailJ, String senhaJ) {
		super();
		this.idJ = idJ;
		this.nomeJ = nomeJ;
		this.emailJ = emailJ;
		this.senhaJ = senhaJ;
	}
	
	public Long getIdJ() {
		return idJ;
	}
	public void setIdJ(Long idJ) {
		this.idJ = idJ;
	}
	public String getNomeJ() {
		return nomeJ;
	}
	public void setNomeJ(String nomeJ) {
		this.nomeJ = nomeJ;
	}
	public String getEmailJ() {
		return emailJ;
	}
	public void setEmailJ(String emailJ) {
		this.emailJ = emailJ;
	}
	public String getSenhaJ() {
		return senhaJ;
	}
	public void setSenhaJ(String senhaJ) {
		this.senhaJ = senhaJ;
	}

	@Override
	public String toString() {
		return "ClienteJ [idJ=" + idJ + ", nomeJ=" + nomeJ + ", emailJ=" + emailJ + ", senhaJ=" + senhaJ + "]";
	}
	
	
}
