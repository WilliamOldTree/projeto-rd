package br.com.qsd.politeismo.ecommerce.entities;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.qsd.politeismo.ecommerce.enums.FormaEntrega;


@Entity
@Table(name = "entrega")
public class Entrega {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_entrega")
	private Long id;
		
	@Column(nullable = false, name = "valor_frete")
	private BigDecimal valor;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private FormaEntrega formaEntrega;
	
	@JsonIgnore
	@OneToMany(mappedBy="idPedido")
	private List<Pedido> Pedidos;
	
	public Entrega() {
		
	}

	public Entrega(Long id, BigDecimal valor, FormaEntrega formaEntrega) {
		
		this.id = id;
		this.valor = valor;
		this.formaEntrega = formaEntrega;
		
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
	
	public List<Pedido> getPedidos() {
		return Pedidos;
	}

	public void setItensPedidos(List<Pedido> Pedidos) {
		this.Pedidos = Pedidos;
	}
	
	
}//end class