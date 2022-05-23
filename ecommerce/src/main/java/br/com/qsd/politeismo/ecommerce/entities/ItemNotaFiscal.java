package br.com.qsd.politeismo.ecommerce.entities;

<<<<<<< HEAD
<<<<<<< HEAD
import javax.persistence.Column;
=======
>>>>>>> 29b5b77eea07f6485c978e0cab6c6e22791a6025
=======
>>>>>>> 421972d200574f03f92aadedc3dc360b4ac2d26c
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="item_nota_fiscal")
public class ItemNotaFiscal {


	@EmbeddedId
	private ProdutoNotaFiscalID produtoNotaFiscalID;
	
	
	@ManyToOne @JoinColumn(name = "id_produto", insertable = false, updatable = false) 
	private Produto idProduto;
	
	@ManyToOne @JoinColumn(name = "id_nota_fiscal", insertable = false, updatable = false) 
	private NotaFiscal idNotaFiscal;
	
	private Long quantidade;
<<<<<<< HEAD
<<<<<<< HEAD
	
	@Column(name = "percentual_icms")
	private Long percentulamIMC;
	
	@Column(name = "valor_imc")
=======
	private Long percentuamIMC;
>>>>>>> 29b5b77eea07f6485c978e0cab6c6e22791a6025
=======
	private Long percentuamIMC;
>>>>>>> 421972d200574f03f92aadedc3dc360b4ac2d26c
	private Long valorIMC;
	
	public ProdutoNotaFiscalID getProdutoNotaFiscalID() {
		return produtoNotaFiscalID;
	}
	public void setProdutoNotaFiscalID(ProdutoNotaFiscalID produtoNotaFiscalID) {
		this.produtoNotaFiscalID = produtoNotaFiscalID;
	}
	public Produto getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Produto idProduto) {
		this.idProduto = idProduto;
	}
	
	public NotaFiscal getIdNotaFiscal() {
		return idNotaFiscal;
	}
	public void setIdNotaFiscal(NotaFiscal idNotaFiscal) {
		this.idNotaFiscal = idNotaFiscal;
	}
	public Long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
<<<<<<< HEAD
<<<<<<< HEAD

	public Long getPercentulamIMC() {
		return percentulamIMC;
	}
	public void setPercentulamIMC(Long percentulamIMC) {
		this.percentulamIMC = percentulamIMC;
=======
=======
>>>>>>> 421972d200574f03f92aadedc3dc360b4ac2d26c
	public Long getPercentuamIMC() {
		return percentuamIMC;
	}
	public void setPercentuamIMC(Long percentuamIMC) {
		this.percentuamIMC = percentuamIMC;
<<<<<<< HEAD
>>>>>>> 29b5b77eea07f6485c978e0cab6c6e22791a6025
=======
>>>>>>> 421972d200574f03f92aadedc3dc360b4ac2d26c
	}
	public Long getValorIMC() {
		return valorIMC;
	}
	public void setValorIMC(Long valorIMC) {
		this.valorIMC = valorIMC;
	}
	
	
<<<<<<< HEAD
}
=======
}
<<<<<<< HEAD
>>>>>>> 29b5b77eea07f6485c978e0cab6c6e22791a6025
=======
>>>>>>> 4c080c22c4c7cdd9603e7a8907c133b2dea15553
>>>>>>> 421972d200574f03f92aadedc3dc360b4ac2d26c
