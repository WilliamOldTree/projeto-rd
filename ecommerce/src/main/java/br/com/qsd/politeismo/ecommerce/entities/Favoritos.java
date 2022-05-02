package br.com.rd.qsd.politeismo.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity	
@Table(name = "FAVORITOS")


public class Favoritos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="ID_FAVORITOS")
	private Long id_favoritos;
	
	@Column(nullable = false, name = "LISTA")
	private String lista_favoritos;
	
	@Column(name="ID_CLIENTE")
	private Long id_cliente;

	@ManyToOne
	@JoinColumn(nullable = true, name = "fk_id_cliente")
	private Cliente cliente;
	
	
	public Favoritos(Long id_favoritos, String lista_favoritos, Long id_cliente, Cliente cliente) {
		super();
		this.id_favoritos = id_favoritos;
		this.lista_favoritos = lista_favoritos;
		this.id_cliente = id_cliente;
		this.cliente = cliente;
	}

	
	public Long getId_favoritos() {
		return id_favoritos;
	}

	public void setId_favoritos(Long id_favoritos) {
		this.id_favoritos = id_favoritos;
	}

	public String getLista_favoritos() {
		return lista_favoritos;
	}

	public void setLista_favoritos(String lista_favoritos) {
		this.lista_favoritos = lista_favoritos;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	@Override
	public String toString() {
		return "Favoritos [id_favoritos=" + id_favoritos + ", lista_favoritos=" + lista_favoritos + ", id_cliente="
				+ id_cliente + ", cliente=" + cliente + "]";
	}
	
	
	
}
