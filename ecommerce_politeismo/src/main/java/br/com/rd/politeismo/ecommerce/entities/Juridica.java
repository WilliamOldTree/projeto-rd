package br.com.rd.politeismo.ecommerce.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



@Entity
public class Juridica extends Cliente {
	
	@Column(nullable=false)
	private String cnpj;
	
	@Column(nullable=false)
	private LocalDate abertura;
	
	@Column(name="inscricao_estadual", nullable=false)
	private String inscricaoEstadual;
	
	@Column(name="razao_social", nullable=false)
	private String razaoSocial;
	
	@ManyToMany(mappedBy="clientesJuridica",fetch = FetchType.EAGER)
	private List<Endereco> enderecos;
	

	
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
	

	@Override
	public String toString() {
		Cliente cliente = new Cliente ();
		
		return "[Cliente Juridico: ID=" + cliente.getId() + "Nome= " + cliente.getNome() + "Email= " + cliente.getEmail() + "CNPJ= " + cnpj + ", Data de Abertura= " + abertura + ", Inscrição Estadual= " + inscricaoEstadual
				+ ", Razão Social= " + razaoSocial + "]";
	}
	
}// end class