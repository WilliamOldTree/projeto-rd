package br.com.qsd.politeismo.ecommerce.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="nota_fiscal")
public class NotaFiscal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_nota_fiscal")
	private Long idNotaFiscal;
	
	@Column(name ="codgo_acesso_chave")
	private Long codigoAcessoChave;
	
	@Column(name ="data_nota_fiscal")
	private Date dataNotaFiscal;
	
	@Column(name ="numero_serie")
	private Long numeroSerie;
	
	@Column(name ="valor")
	private BigDecimal valor;
	
	@Column(name ="operacao")
	private String operacao;
	
	@OneToOne
    @JoinColumn(name = "id_pedido", insertable = false, updatable = false)
	private  Pedido pedido;
	
	
	public NotaFiscal() {
		
	}

	public Long getIdNotaFiscal() {
		return idNotaFiscal;
	}

	public void setIdNotaFiscal(Long idNotaFiscal) {
		this.idNotaFiscal = idNotaFiscal;
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

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
	
}
