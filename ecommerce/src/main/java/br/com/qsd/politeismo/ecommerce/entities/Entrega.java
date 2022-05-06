package br.com.qsd.politeismo.ecommerce.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.qsd.politeismo.ecommerce.enums.FormaEntrega;
import br.com.qsd.politeismo.ecommerce.enums.StatusEntrega;

@Entity
@Table(name = "entrega")
public class Entrega {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_entrega")
	private Long id;
	private LocalDate data;
	private BigDecimal valor;
	private StatusEntrega statusEntrega;
	private FormaEntrega formaEntrega;
	
	public Entrega() {
		
	}

	public Entrega(Long id, LocalDate data, BigDecimal valor, StatusEntrega statusEntrega, FormaEntrega formaEntrega) {
		this.id = id;
		this.data = data;
		this.valor = valor;
		this.statusEntrega = statusEntrega;
		this.formaEntrega = formaEntrega;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
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
