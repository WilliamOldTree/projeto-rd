package br.com.qsd.politeismo.ecommerce.entities;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="nota_fiscal")
public class NotaFiscal {
	
	
	@Id @Column(name = "id_nota_fiscal") 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	private Long codigoAcessoChave;
	private Date dataNotaFiscal;
	private Long numeroSerie;
	private BigDecimal valor;
	private String operacao;

	@JsonIgnore @OneToMany(mappedBy="idNotaFiscal") 
	private List<ItemNotaFiscal> itemNotaFiscal; 
	
	@OneToOne(cascade = { CascadeType.DETACH })
	@JoinColumn(name="id_pedido")
	private Pedido pedido;
	
	public NotaFiscal() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCodigoAcessoChave() {
		return codigoAcessoChave;
	}
	public void setCodigoAcessoChave(Long codigoAcessoChave) {
		this.codigoAcessoChave = codigoAcessoChave;
	}
	public Date getDataNotaFiscal() {
		return dataNotaFiscal;
	}
	public void setDataNotaFiscal(Date dataNotaFiscal) {
		this.dataNotaFiscal = dataNotaFiscal;
	}
	public Long getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(Long numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public List<ItemNotaFiscal> getItemNotaFiscal() {
		return itemNotaFiscal;
	}

	public void setItemNotaFiscal(List<ItemNotaFiscal> itemNotaFiscal) {
		this.itemNotaFiscal = itemNotaFiscal;
	}
	
	
<<<<<<< HEAD
}
=======
}
>>>>>>> 4c080c22c4c7cdd9603e7a8907c133b2dea15553
