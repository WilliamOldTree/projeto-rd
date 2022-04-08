package br.com.rd.politeismo.ecommerce.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PIX")

public class Pix {

	@Id
	@Column(name = "id_pix")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String chave;

	private Long id_forma;
	private Long id_cliente;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public Long getId_forma() {
		return id_forma;
	}
	public void setId_forma(Long id_forma) {
		this.id_forma = id_forma;
	}
	public Long getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}
	@Override
	public String toString() {
		return "Pix [id=" + id + ", chave=" + chave + ", id_forma=" + id_forma + ", id_cliente=" + id_cliente + "]";
	}
	
	

}// end class
