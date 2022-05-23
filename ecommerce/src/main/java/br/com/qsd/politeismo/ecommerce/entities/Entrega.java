<<<<<<< HEAD
<<<<<<< HEAD
package br.com.qsd.politeismo.ecommerce.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
//import java.util.List;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.qsd.politeismo.ecommerce.enums.FormaEntrega;
import br.com.qsd.politeismo.ecommerce.enums.StatusEntrega;

@Entity
@Table(name = "entrega")
public class Entrega {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_entrega")
	private Long id;
	
	@Column(nullable = false)
	private LocalDate data;
	
	@Column(nullable = false, name = "valor_frete")
	private BigDecimal valor;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private StatusEntrega statusEntrega;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private FormaEntrega formaEntrega;
	
	@JsonIgnore
	@Enumerated(EnumType.STRING)
	@OneToMany(mappedBy = "entrega")
	private List<Pedido>pedidos;
	
	public Entrega() {
		
	}

	public Entrega(Long id, LocalDate data, BigDecimal valor, StatusEntrega statusEntrega, FormaEntrega formaEntrega,
			List<Pedido> pedidos) {
		this.id = id;
		this.data = data;
		this.valor = valor;
		this.statusEntrega = statusEntrega;
		this.formaEntrega = formaEntrega;
		this.pedidos = pedidos;
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

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	

=======
=======
>>>>>>> 421972d200574f03f92aadedc3dc360b4ac2d26c
package br.com.qsd.politeismo.ecommerce.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
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
import br.com.qsd.politeismo.ecommerce.enums.StatusEntrega;

@Entity
@Table(name = "entrega")
public class Entrega {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_entrega")
	private Long id;
	
	@Column(nullable = false)
	private LocalDate data;
	
	@Column(nullable = false, name = "valor_frete")
	private BigDecimal valor;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private StatusEntrega statusEntrega;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private FormaEntrega formaEntrega;
	
	@JsonIgnore
	@Enumerated(EnumType.STRING)
	@OneToMany(mappedBy = "entrega")
	private List<Pedido>pedidos;
	
	public Entrega() {
		
	}

	public Entrega(Long id, LocalDate data, BigDecimal valor, StatusEntrega statusEntrega, FormaEntrega formaEntrega,
			List<Pedido> pedidos) {
		this.id = id;
		this.data = data;
		this.valor = valor;
		this.statusEntrega = statusEntrega;
		this.formaEntrega = formaEntrega;
		this.pedidos = pedidos;
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

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	

<<<<<<< HEAD
>>>>>>> 29b5b77eea07f6485c978e0cab6c6e22791a6025
=======
=======
package br.com.qsd.politeismo.ecommerce.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
//import java.util.List;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.qsd.politeismo.ecommerce.enums.FormaEntrega;
import br.com.qsd.politeismo.ecommerce.enums.StatusEntrega;

@Entity
@Table(name = "entrega")
public class Entrega {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_entrega")
	private Long id;
	
	@Column(nullable = false, name="prazo")
	private LocalDate prazo;
	
	@Column(nullable = false, name = "valor_frete")
	private BigDecimal valor;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private StatusEntrega statusEntrega;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private FormaEntrega formaEntrega;
	
	@JsonIgnore
	@Enumerated(EnumType.STRING)
	@OneToMany(mappedBy = "entrega")
	private List<Pedido>pedidos;
	
	public Entrega() {
		
	}

	public Entrega(Long id, LocalDate prazo, BigDecimal valor, StatusEntrega statusEntrega, FormaEntrega formaEntrega,
			List<Pedido> pedidos) {
		this.id = id;
		this.prazo = prazo;
		this.valor = valor;
		this.statusEntrega = statusEntrega;
		this.formaEntrega = formaEntrega;
		this.pedidos = pedidos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return prazo;
	}

	public void setData(LocalDate prazo) {
		this.prazo = prazo;
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

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	

>>>>>>> 4c080c22c4c7cdd9603e7a8907c133b2dea15553
>>>>>>> 421972d200574f03f92aadedc3dc360b4ac2d26c
}//end class