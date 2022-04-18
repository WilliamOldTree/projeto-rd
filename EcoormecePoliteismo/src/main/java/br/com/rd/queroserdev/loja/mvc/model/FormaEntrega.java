package br.com.rd.queroserdev.loja.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FORMA_ENTREGA")
public class FormaEntrega {

	public FormaEntrega() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_FORMA_ENTREGA")
	private Long idFormaEntrega;
	
	@Column(nullable = true, name = "EMPRESA")
	private String empresa;

	public Long getIdFormaEntrega() {
		return idFormaEntrega;
	}

	public void setIdFormaEntrega(Long idFormaEntrega) {
		this.idFormaEntrega = idFormaEntrega;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	
}
