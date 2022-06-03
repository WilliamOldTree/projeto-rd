package br.com.qsd.politeismo.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pix")
public class Pix {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_pix")
	private Long id;
	
	@Column(name="chave")
	private String chave = "88faa317-c217-4c29-8228-38f3d978bb6f";
	
	@Column(name="imagem")
	private String urlImagem;
	
	@ManyToOne
	@JoinColumn(name="fk_id_cliente", nullable=false)
	private Cliente cliente;
	
	public Pix () {
		
	}

	public Pix(Long id, String chave, String urlImagem, Cliente cliente) {
		
		this.id = id;
		this.chave = chave;
		this.urlImagem = urlImagem;
		this.cliente = cliente;
		
	}

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

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
}//end class
