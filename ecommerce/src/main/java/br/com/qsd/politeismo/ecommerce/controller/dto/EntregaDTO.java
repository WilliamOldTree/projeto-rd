package br.com.qsd.politeismo.ecommerce.controller.dto;

import br.com.qsd.politeismo.ecommerce.entities.Entrega;
import br.com.qsd.politeismo.ecommerce.enums.FormaEntrega;
import br.com.qsd.politeismo.ecommerce.enums.StatusEntrega;

public class EntregaDTO {
	
	private Long id;
	private StatusEntrega statusEntrega;
	private FormaEntrega formaEntrega;
	
	public EntregaDTO() {
		
	}

	public EntregaDTO(Long id, StatusEntrega statusEntrega, FormaEntrega formaEntrega) {
		this.id = id;
		this.statusEntrega = statusEntrega;
		this.formaEntrega = formaEntrega;
	}
	
	public EntregaDTO(Entrega entrega) {
		id = entrega.getId();
		statusEntrega = entrega.getStatusEntrega();
		formaEntrega = entrega.getFormaEntrega();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StatusEntrega getStatusEntrega() {
		return statusEntrega;
	}

	public void setStatusEntrega(StatusEntrega statusEntrega) {
		this.statusEntrega = statusEntrega;
	}

	public FormaEntrega getFormaEntrega() {
		return formaEntrega;
	}

	public void setFormaEntrega(FormaEntrega formaEntrega) {
		this.formaEntrega = formaEntrega;
	}	

}//end class
