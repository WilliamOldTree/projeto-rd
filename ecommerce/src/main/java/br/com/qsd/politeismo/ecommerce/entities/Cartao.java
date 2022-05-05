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
	private String cvv_cartao;
	private String validade_cartao;
	

	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name = "cliente_id_cliente", nullable = true)
	private Cliente cliente;
	
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="forma_id_forma", nullable = true)
	private Forma formaPagamento;
	
	
    


	public Cartao( String titular_cartao, String numero_cartao, String cvv_cartao, String validade_cartao) {
		super();
		this.titular_cartao = titular_cartao;
		this.numero_cartao = numero_cartao;
		this.cvv_cartao = cvv_cartao;
		this.validade_cartao = validade_cartao;
	}

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

	public String getNumero_cartao() {
		return numero_cartao;
	}

	public void setNumero_cartao(String numero_cartao) {
		this.numero_cartao = numero_cartao;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cartao other = (Cartao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
	
}
