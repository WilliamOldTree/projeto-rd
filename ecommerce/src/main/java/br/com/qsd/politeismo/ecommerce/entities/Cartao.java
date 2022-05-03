package br.com.qsd.politeismo.ecommerce.entities;
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
	private Long id;
	
	
	@Column(nullable = false)
	private String titular_cartao;
	private String cvv_cartao;
	private String validade_cartao;
	

	@ManyToOne
	@JoinColumn(name = "cliente_id_cliente", nullable = true)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="forma_id_forma", nullable = true)
	private Forma formaPagamento;

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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Forma getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(Forma formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	

	@Override
	public String toString() {
		return "Cartao [id=" + id + ", titular_cartao=" + titular_cartao + ", cvv_cartao=" + cvv_cartao
				+ ", validade_cartao=" + validade_cartao + ", cliente=" + cliente + ", formaPagamento=" + formaPagamento
				+ "]";
	}
	
	
	
}
