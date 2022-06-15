package br.com.qsd.politeismo.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "cartao")


public class Cartao {

	@Id
	@Column(name = "id_cartao_numero")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(nullable = false)
	private String titular_cartao;
	private String numero_cartao;
	private String validade_cartao;
	
	@Transient
	private String cvv_cartao;
	
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name = "fk_id_cliente", nullable = true)
	private Cliente cliente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitular_cartao() {
		return titular_cartao;
	}

	public void setTitular_cartao(String titular_cartao) {
		this.titular_cartao = titular_cartao;
	}

	public String getNumero_cartao() {
		return numero_cartao;
	}

	public void setNumero_cartao(String numero_cartao) {
		this.numero_cartao = numero_cartao;
	}

	public String getValidade_cartao() {
		return validade_cartao;
	}

	public void setValidade_cartao(String validade_cartao) {
		this.validade_cartao = validade_cartao;
	}

	public String getCvv_cartao() {
		return cvv_cartao;
	}

	public void setCvv_cartao(String cvv_cartao) {
		this.cvv_cartao = cvv_cartao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	

	
}//end class