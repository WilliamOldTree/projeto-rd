package br.com.rd.queroserdev.loja.mvc.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ENTREGA")


public class Entrega {

	
	@Id
	@Column(name = "id_entrega")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_entrega;
	private Long id_forma_entrega;
	
	@Column(nullable = false)
	private String prazo_estimado_entrega;
	private Double valor_entrega;
	public Long getId_entrega() {
		return id_entrega;
	}
	public void setId_entrega(Long id_entrega) {
		this.id_entrega = id_entrega;
	}
	public Long getId_forma_entrega() {
		return id_forma_entrega;
	}
	public void setId_forma_entrega(Long id_forma_entrega) {
		this.id_forma_entrega = id_forma_entrega;
	}
	public String getPrazo_estimado_entrega() {
		return prazo_estimado_entrega;
	}
	public void setPrazo_estimado_entrega(String prazo_estimado_entrega) {
		this.prazo_estimado_entrega = prazo_estimado_entrega;
	}
	public Double getValor_entrega() {
		return valor_entrega;
	}
	public void setValor_entrega(Double valor_entrega) {
		this.valor_entrega = valor_entrega;
	}


	
	

}// end class
