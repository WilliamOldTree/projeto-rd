package br.com.qsd.politeismo.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class NotaProdutoID {
	
	@Column(name = "id_nota_fiscal")
	private Long idNotaFiscal;
    
    @Column(name = "id_produto")
	private Long idProduto;

	public NotaProdutoID() {
		
	}

	public Long getIdNotaFiscal() {
		return idNotaFiscal;
	}

	public void setIdNotaFiscal(Long idNotaFiscal) {
		this.idNotaFiscal = idNotaFiscal;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}
	
}
