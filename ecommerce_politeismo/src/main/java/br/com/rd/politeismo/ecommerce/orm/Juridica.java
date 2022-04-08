package br.com.rd.politeismo.ecommerce.orm;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "juridica")
public class Juridica extends Cliente {

	@Id
	@Column(name = "id_cnpj")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private LocalDate abertura;
	@Column(nullable=false)
	private String inscricaoEstadual;
	@Column(nullable=false)
	private String razaoSocial;
	
	private Long idCliente;

	public Juridica() {

	}

	public Juridica(Long id, LocalDate abertura, String inscricaoEstadual, String razaoSocial, Long idCliente) {
		super();
		this.id = id;
		this.abertura = abertura;
		this.inscricaoEstadual = inscricaoEstadual;
		this.razaoSocial = razaoSocial;
		this.idCliente = idCliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "Juridica [id=" + id + ", abertura=" + abertura + ", inscricaoEstadual=" + inscricaoEstadual
				+ ", razaoSocial=" + razaoSocial + ", idCliente=" + idCliente + "]";
	}

}// end class
