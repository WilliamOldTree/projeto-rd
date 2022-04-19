package br.com.rd.queroserdev.loja.mvc.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@OneToMany(mappedBy="pedido")
	List<Pagamento>pagamento;
	
	
	
	


	
	public List<Pagamento> getPagamento() {
		return pagamento;
	}

	
	
	
	
	
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



}
