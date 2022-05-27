package br.com.qsd.politeismo.ecommerce.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="boleto")
public class Boleto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String banco;
	private LocalDate dataProcessamento;
	private LocalDate dataVencimento;
	private String beneficiario;
	private String numeroDocumento;
	private Double valor;
	
	@ManyToOne
	@JoinColumn(name="fk_id_cliente", nullable = false)
	private Cliente cliente;

	public Boleto () {
		
	}
	
	public Boleto(Long id, String banco, LocalDate dataProcessamento, LocalDate dataVencimento, String beneficiario,
			String numeroDocumento, Double valor, Cliente cliente) {
		
		this.id = id;
		this.banco = banco;
		this.dataProcessamento = dataProcessamento;
		this.dataVencimento = dataVencimento;
		this.beneficiario = beneficiario;
		this.numeroDocumento = numeroDocumento;
		this.valor = valor;
		this.cliente = cliente;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public LocalDate getDataProcessamento() {
		return dataProcessamento;
	}

	public void setDataProcessamento(LocalDate dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
		
}
