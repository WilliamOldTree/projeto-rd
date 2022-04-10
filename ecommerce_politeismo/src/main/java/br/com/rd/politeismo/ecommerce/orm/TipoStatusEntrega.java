package br.com.rd.politeismo.ecommerce.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_STATUS_ENTREGA")
public class TipoStatusEntrega {

	@Id
	@Column(name = "id_tipo_status_entrega")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tipo_status_entrega;
	
	@Column(nullable = false)
	private String descrição_tipo_status_entrega;
	private Long status_entrega;
	public Long getId_tipo_status_entrega() {
		return id_tipo_status_entrega;
	}
	public void setId_tipo_status_entrega(Long id_tipo_status_entrega) {
		this.id_tipo_status_entrega = id_tipo_status_entrega;
	}
	public String getDescrição_tipo_status_entrega() {
		return descrição_tipo_status_entrega;
	}
	public void setDescrição_tipo_status_entrega(String descrição_tipo_status_entrega) {
		this.descrição_tipo_status_entrega = descrição_tipo_status_entrega;
	}
	public Long getStatus_entrega() {
		return status_entrega;
	}
	public void setStatus_entrega(Long status_entrega) {
		this.status_entrega = status_entrega;
	}
	@Override
	public String toString() {
		return "Tipo_Status_Entrega [id_tipo_status_entrega=" + id_tipo_status_entrega
				+ ", descrição_tipo_status_entrega=" + descrição_tipo_status_entrega + ", status_entrega="
				+ status_entrega + "]";
	}
	
}
