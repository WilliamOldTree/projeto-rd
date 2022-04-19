package br.com.rd.politeismo.ecommerce.orm;
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
@Table(name = "ENTREGA")
public class Entrega {

	
	@Id
	@Column(name = "id_entrega")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEntrega;
	
	@Column(name="id_forma_entrega",nullable = false)
	private Long idFormaEntrega;
	
	@Column(name="prazo_estimado_entrega",nullable = false)
	private String prazoEstimadoEntrega;
	
	@Column(name="valor_entrega",nullable = false)
	private Double valorEntrega;
	
	@ManyToOne
	@JoinColumn(name="forma_entrega_id_forma_entrega", nullable = false)
	private FormaEntrega formaEntrega;
	
	@OneToMany(mappedBy = "entrega")
	private List<Pedido> pedido;

	
	
	public Long getIdEntrega() {
		return idEntrega;
	}


	public void setIdEntrega(Long idEntrega) {
		this.idEntrega = idEntrega;
	}

	public Long getIdFormaEntrega() {
		return idFormaEntrega;
	}

	public void setIdFormaEntrega(Long idFormaEntrega) {
		this.idFormaEntrega = idFormaEntrega;
	}

	public String getPrazoEstimadoEntrega() {
		return prazoEstimadoEntrega;
	}

	public void setPrazoEstimadoEntrega(String prazoEstimadoEntrega) {
		this.prazoEstimadoEntrega = prazoEstimadoEntrega;
	}

	public Double getValorEntrega() {
		return valorEntrega;
	}

	public void setValorEntrega(Double valorEntrega) {
		this.valorEntrega = valorEntrega;
	}	

	public List<Pedido> getPedido() {
		return pedido;
	}

}// end class
