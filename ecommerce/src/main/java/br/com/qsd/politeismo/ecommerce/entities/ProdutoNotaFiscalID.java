package br.com.qsd.politeismo.ecommerce.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProdutoNotaFiscalID implements Serializable {
	
	private static final long serialVersionUID = 1L; 
	
	@Column(name="id_produto")
	private Long idProduto;
	
	@Column(name="id_nota_fiscal")
	private Long idNotaFiscal;

	
	public ProdutoNotaFiscalID(Long idProduto, Long idNotaFiscal) {
		super();
		this.idProduto = idProduto;
		this.idNotaFiscal = idNotaFiscal;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

	public Long getIdNotaFiscal() {
		return idNotaFiscal;
	}

	public void setIdNotaFiscal(Long idNotaFiscal) {
		this.idNotaFiscal = idNotaFiscal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}