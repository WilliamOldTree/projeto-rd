package br.com.qsd.politeismo.ecommerce.entities;

import java.math.BigDecimal;
<<<<<<< HEAD
import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
=======
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
>>>>>>> 29b5b77eea07f6485c978e0cab6c6e22791a6025
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;
import br.com.qsd.politeismo.ecommerce.enums.Operacao;
=======

import com.fasterxml.jackson.annotation.JsonIgnore;
>>>>>>> 29b5b77eea07f6485c978e0cab6c6e22791a6025


@Entity
@Table(name="nota_fiscal")
public class NotaFiscal {
	
	
	@Id @Column(name = "id_nota_fiscal") 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
<<<<<<< HEAD
	
	@Column(name = "codigo_acesso_chave") 
	private Long codigoAcessoChave;
	
	@Column(name = "data_nota_fiscal") 
	private LocalDate dataNotaFiscal;
	
	@Column(name = "numero_serie") 
	private Long numeroSerie;
	
	private BigDecimal valor;
	
	@Enumerated(EnumType.STRING)
	private Operacao operacao;
=======
	private Long codigoAcessoChave;
	private Date dataNotaFiscal;
	private Long numeroSerie;
	private BigDecimal valor;
	private String operacao;
>>>>>>> 29b5b77eea07f6485c978e0cab6c6e22791a6025

	@JsonIgnore @OneToMany(mappedBy="idNotaFiscal") 
	private List<ItemNotaFiscal> itemNotaFiscal; 
	
	@OneToOne(cascade = { CascadeType.DETACH })
	@JoinColumn(name="id_pedido")
	private Pedido pedido;
	
	public NotaFiscal() {
	}
<<<<<<< HEAD

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

	public LocalDate getDataNotaFiscal() {
		return dataNotaFiscal;
	}

	public void setDataNotaFiscal(LocalDate dataNotaFiscal) {
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

	public Operacao getOperacao() {
		return operacao;
	}

	public void setOperacao(Operacao operacao) {
=======
	
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
>>>>>>> 29b5b77eea07f6485c978e0cab6c6e22791a6025
		this.operacao = operacao;
	}

	public List<ItemNotaFiscal> getItemNotaFiscal() {
		return itemNotaFiscal;
	}

	public void setItemNotaFiscal(List<ItemNotaFiscal> itemNotaFiscal) {
		this.itemNotaFiscal = itemNotaFiscal;
	}
<<<<<<< HEAD

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	

}
=======
	
	
}
>>>>>>> 29b5b77eea07f6485c978e0cab6c6e22791a6025
