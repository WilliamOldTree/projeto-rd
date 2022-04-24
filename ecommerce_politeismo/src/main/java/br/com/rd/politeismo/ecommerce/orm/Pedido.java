package br.com.rd.politeismo.ecommerce.orm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
	
	
	@Id
	@Column(name="id_pedido")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="data_pedido", nullable = false)
	private LocalDate dataPedido;
	
	@Column(name="valor_total", nullable = false)
	private BigDecimal valorTotal;
	
	@OneToMany(mappedBy = "pedido")
	private List<NotaFiscal> notaFiscal;
	
	@ManyToOne
	@JoinColumn(name="cliente_id_cliente", nullable = false)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="entrega_id_entrega", nullable = false)
	private Entrega entrega;
	
	@OneToMany(mappedBy="pedido")
	List<Pagamento> pagamento;
	
	@OneToMany(mappedBy="pedido")
	List<StatusPedido> statusPedido;
	
//	@OneToMany(mappedBy="pedido")
//	List<ItemPedido> itemPedido;
	

	
	

	
	public Pedido() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public List<Pagamento> getPagamento() {
		return pagamento;
	}

	public List<StatusPedido> getStatusPedido() {
		return statusPedido;
	}

	public List<NotaFiscal> getNotaFiscal() {
		return notaFiscal;
	}


//	public List<ItemPedido> getItempedido() {
//		return itemPedido;
//	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", dataPedido=" + dataPedido + ", valorTotal=" + valorTotal + ", notaFiscal="
				+ notaFiscal + ", cliente=" + cliente + ", entrega=" + entrega + "]";
	}

}
