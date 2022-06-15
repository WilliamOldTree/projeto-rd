package br.com.qsd.politeismo.ecommerce.controller.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import br.com.qsd.politeismo.ecommerce.entities.Entrega;
import br.com.qsd.politeismo.ecommerce.entities.Pedido;
import br.com.qsd.politeismo.ecommerce.enums.FormaEntrega;

public class EntregaDTO {

	private Long id;
		
	private BigDecimal valor;
	
	private FormaEntrega formaEntrega;
	
	public EntregaDTO(Entrega entrega) {
        this.id = entrega.getId();
        this.valor = entrega.getValor();
        this.formaEntrega = entrega.getFormaEntrega();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public FormaEntrega getFormaEntrega() {
		return formaEntrega;
	}

	public void setFormaEntrega(FormaEntrega formaEntrega) {
		this.formaEntrega = formaEntrega;
	}
	
	public static List<EntregaDTO> converter(List<Entrega> entregas) {
		return entregas.stream().map(EntregaDTO::new).collect(Collectors.toList());
		} 
}
