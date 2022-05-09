package br.com.qsd.politeismo.ecommerce.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fornecedor")
public class Fornecedor {

	@Id
	@Column(name = "id_fornecedor")
	private Long id;

	@Column(name="razao_social", nullable = false)
	private String razaoSocial;

	@Column(unique = true, nullable = false)
	private String cnpj;

	@Column(nullable = false)
	private String email;

	@Column(name = "fl_inativo")
	private boolean flInativo = true; // flag inativo
    
	@OneToMany(mappedBy="fornecedor")
    private List<Endereco> enderecos;
	
	@OneToMany(mappedBy = "fornecedor")
	private  List<Produto> produtos;
	  
	
	public Fornecedor() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isFlInativo() {
		return flInativo;
	}

	public void setFlInativo(boolean flInativo) {
		this.flInativo = flInativo;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	
	
}