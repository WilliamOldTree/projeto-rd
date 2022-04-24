package br.com.rd.politeismo.ecommerce.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cartao")

public class Cartao {

	@Id
	@Column(name = "id_cartao_numero")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cartao_numero;

	@Column(nullable = false)
	private String titular_cartao;
	private String cvv_cartao;
	private String validade_cartao;
	private Long id_cliente;
	private Long id_formas;

	@ManyToOne
	@JoinColumn(name = "cliente_id_cliente", nullable = false)
	private Cliente cliente;

	public Long getId_cartao_numero() {
		return id_cartao_numero;
	}

	public void setId_cartao_numero(Long id_cartao_numero) {
		this.id_cartao_numero = id_cartao_numero;
	}

	public String getTitular_cartao() {
		return titular_cartao;
	}

	public void setTitular_cartao(String titular_cartao) {
		this.titular_cartao = titular_cartao;
	}

	public String getCvv_cartao() {
		return cvv_cartao;
	}

	public void setCvv_cartao(String cvv_cartao) {
		this.cvv_cartao = cvv_cartao;
	}

	public String getValidade_cartao() {
		return validade_cartao;
	}

	public void setValidade_cartao(String validade_cartao) {
		this.validade_cartao = validade_cartao;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Long getId_formas() {
		return id_formas;
	}

	public void setId_formas(Long id_formas) {
		this.id_formas = id_formas;
	}

	@Override
	public String toString() {
		return "Cartao [id_cartao_numero=" + id_cartao_numero + ", titular_cartao=" + titular_cartao + ", cvv_cartao="
				+ cvv_cartao + ", validade_cartao=" + validade_cartao + ", id_cliente=" + id_cliente + ", id_formas="
				+ id_formas + "]";
	}

}