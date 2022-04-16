package br.com.rd.politeismo.ecommerce.orm;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import br.com.rd.politeismo.ecommerce.orm.Produto;

@Entity
@Table(name = "ESTOQUE")
public class Estoque {

	public Estoque() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_ESTOQUE")
	private Long idEstoque;
	
	@Column(nullable = true, name = "QUANTIDADE")
	private Long quantidade;

	@OneToMany
	private Produto idProduto;
	
	
	public Long getIdEstoque() {
		return idEstoque;
	}

	public void setIdEstoque(Long idEstoque) {
		this.idEstoque = idEstoque;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Estoque [idEstoque=" + idEstoque + ", quantidade=" + quantidade + "]";
	}
	
}
