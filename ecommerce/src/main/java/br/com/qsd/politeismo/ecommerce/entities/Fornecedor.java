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
	private Long idFornecedor;

	@Column(name="razao_social", nullable = false)
	private String razaoSocial;

	@Column(unique = true, nullable = false, name="cnpj")
	private String cnpj;

	@Column(nullable = false, name="email")
	private String email;

	@Column(name = "fl_inativo")
	private boolean flInativo = true; // flag inativo
	
	@Column(name="telefone")
	private String telefone;
    
	@OneToMany(mappedBy="fornecedor")
    private List<Endereco> enderecos;
	
	@OneToMany(mappedBy = "fornecedor")
	private  List<Produto> produtos;
	  
	
	public Fornecedor() {

	}

	public Long getIdFornecedor() {
		return idFornecedor;
	}


	public void setIdFornecedor(Long idFornecedor) {
		this.idFornecedor = idFornecedor;
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
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
}// end