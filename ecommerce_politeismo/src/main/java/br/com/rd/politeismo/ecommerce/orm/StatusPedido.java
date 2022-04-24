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
@Table(name = "status_pedido")
public class StatusPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_STATUS")
	private Long idStatus;
	
	@Column(nullable = false, name = "DESCRICAO")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="pedido_id_pedido", nullable = false)
	private Pedido pedido;

	public StatusPedido() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(Long idStatus) {
		this.idStatus = idStatus;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
