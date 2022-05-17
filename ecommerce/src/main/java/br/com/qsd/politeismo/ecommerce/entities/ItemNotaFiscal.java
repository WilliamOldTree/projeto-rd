package br.com.qsd.politeismo.ecommerce.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="item_nota_fiscal")
public class ItemNotaFiscal {
	
	@EmbeddedId
	private NotaProdutoID notaProdutoID;	
	
	@ManyToOne
    @JoinColumn(name = "id_produto", insertable = false, updatable = false)
	private Long Produto;
	
	@ManyToOne
    @JoinColumn(name = "id_nota_fiscal", insertable = false, updatable = false)
	private Long NotaFiscal;
	
	private Long quantidade;
	private Long percentualIcms;
	private Long valorIcms;
	
	public NotaProdutoID getNotaProdutoID() {
		return notaProdutoID;
	}
	public void setNotaProdutoID(NotaProdutoID notaProdutoID) {
		this.notaProdutoID = notaProdutoID;
	}
	public Long getProduto() {
		return Produto;
	}
	public void setProduto(Long produto) {
		Produto = produto;
	}
	public Long getNotaFiscal() {
		return NotaFiscal;
	}
	public void setNotaFiscal(Long notaFiscal) {
		NotaFiscal = notaFiscal;
	}
	public Long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	public Long getPercentualIcms() {
		return percentualIcms;
	}
	public void setPercentualIcms(Long percentualIcms) {
		this.percentualIcms = percentualIcms;
	}
	public Long getValorIcms() {
		return valorIcms;
	}
	public void setValorIcms(Long valorIcms) {
		this.valorIcms = valorIcms;
	}
		
		
}
