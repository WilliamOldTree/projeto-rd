package br.com.rd.politeismo.ecommerce.orm;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item_nota_fiscal")
public class ItemNotaFiscal {
	
	
	@Id
	@Column(name="produtoIdProduto")
	private Long produtoIdProduto;
	private Long notaFiscalIdNotaFiscal;
	@Column(nullable = false)
	private Integer quantidade;
	@Column(nullable=false)
	private Double percentual;
	@Column(nullable=false)
	private BigDecimal valorIcms;
	
	
	public ItemNotaFiscal() {
		
	}


	public ItemNotaFiscal(Long produtoIdProduto, Long notaFiscalIdNotaFiscal, Integer quantidade, Double percentual,
			BigDecimal valorIcms) {
		this.produtoIdProduto = produtoIdProduto;
		this.notaFiscalIdNotaFiscal = notaFiscalIdNotaFiscal;
		this.quantidade = quantidade;
		this.percentual = percentual;
		this.valorIcms = valorIcms;
	}


	public Long getProdutoIdProduto() {
		return produtoIdProduto;
	}


	public void setProdutoIdProduto(Long produtoIdProduto) {
		this.produtoIdProduto = produtoIdProduto;
	}


	public Long getNotaFiscalIdNotaFiscal() {
		return notaFiscalIdNotaFiscal;
	}


	public void setNotaFiscalIdNotaFiscal(Long notaFiscalIdNotaFiscal) {
		this.notaFiscalIdNotaFiscal = notaFiscalIdNotaFiscal;
	}


	public Integer getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public Double getPercentual() {
		return percentual;
	}


	public void setPercentual(Double percentual) {
		this.percentual = percentual;
	}


	public BigDecimal getValorIcms() {
		return valorIcms;
	}


	public void setValorIcms(BigDecimal valorIcms) {
		this.valorIcms = valorIcms;
	}


	@Override
	public String toString() {
		return "ItemNotaFiscal [produtoIdProduto=" + produtoIdProduto + ", notaFiscalIdNotaFiscal="
				+ notaFiscalIdNotaFiscal + ", quantidade=" + quantidade + ", percentual=" + percentual + ", valorIcms="
				+ valorIcms + "]";
	}
	
	
	
	

}//end class
