package br.com.rd.queroserdev.loja.mvc.model;



import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "STATUS_ENTREGA")
public class StatusEntrega {

	@Id
	@Column(name = "id_status_entrega")
	private Long id_status_entrega;
	
	@Column(nullable = false)
	private LocalDate data_status_entrega;
	private Long id_entrega;
	
	
	public Long getId_status_entrega() {
		return id_status_entrega;
	}
	public void setId_status_entrega(Long id_status_entrega) {
		this.id_status_entrega = id_status_entrega;
	}
	public LocalDate getData_status_entrega() {
		return data_status_entrega;
	}
	public void setData_status_entrega(LocalDate data_status_entrega) {
		this.data_status_entrega = data_status_entrega;
	}
	public Long getId_entrega() {
		return id_entrega;
	}
	public void setId_entrega(Long id_entrega) {
		this.id_entrega = id_entrega;
	}

	

}
