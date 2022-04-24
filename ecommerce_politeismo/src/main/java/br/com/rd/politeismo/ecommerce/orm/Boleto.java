package br.com.rd.politeismo.ecommerce.orm;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Column;
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
	@Column(name= "id_boleto")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String banco;
	
	@Column(nullable = false)
	private LocalDate vencimento;
	
	@Column(nullable = false)
	private String beneficiario;
	
	@Column(name ="numero_documento", nullable = false)
	private String numeroDocumento;
	
	@Column(name ="data_processamento", nullable = false)
	private LocalDate dataProcessamento;
	
	@Column(name ="valor_cobrado", nullable = false)
	private BigDecimal valorCobrado;
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	@ManyToOne
	@JoinColumn(name = "cliente_id_cliente", nullable = false)
	private Cliente cliente;

	
	
	
	
    public Boleto() {
    	
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

	public LocalDate getVencimento() {
		return vencimento;
	}

	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
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

	public LocalDate getDataProcessamento() {
		return dataProcessamento;
	}

	public void setDataProcessamento(LocalDate dataProcessamento) {
		this.dataProcessamento = dataProcessamento;
	}

	public BigDecimal getValorCobrado() {
		return valorCobrado;
	}

	public void setValorCobrado(BigDecimal valorCobrado) {
		this.valorCobrado = valorCobrado;
	}

	
	
	@Override
	public String toString() {
		return "Boleto [ID: " + id + ", Banco: " + banco + ", Vencimento: " + vencimento + ", Beneficiario: " + beneficiario
				+ ", Numero Documento: " + numeroDocumento + ", Data Processamento: " + dataProcessamento
				+ ", Valor Cobrado: " + valorCobrado + "]";
	}

}
