 package br.com.qsd.politeismo.ecommerce.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

import br.com.qsd.politeismo.ecommerce.enums.Estado;

@Entity
@Table(name = "ENDERECO")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_ENDERECO")
	private Long idEndereco;

	@Column(nullable = false, name = "APELIDO")
	private String apelido;

	@Column(nullable = false, name = "NOME_LOGRADOURO")
	private String nomeLougradouro;

	@Column(nullable = false, name = "TIPO_LOGRADOURO")
	private String tipoLougradouro;

	@Column(nullable = false, name = "NUMERO")
	private String numero;

	@Column(nullable = false, name = "CEP")
	private String cep;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false, name = "ESTADO")
    private Estado estado;

	@Column(nullable = false, name = "CIDADE")
	private String cidade;
	
	@Column(nullable = false, name = "BAIRRO")
	private String bairro;
	
	@JsonIgnore
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "cliente_endereco", joinColumns = {
    @JoinColumn(name = "fk_endereco") }, inverseJoinColumns = { @JoinColumn(name = "fk_cliente") })
	private List<Cliente> clientes;	
	
	@ManyToOne(fetch =FetchType.LAZY) 
	@JoinColumn(name = "fk_id_fornecedor", nullable = true)
	private Fornecedor fornecedor;
	
	@OneToMany(mappedBy="endereco")
	private List<Pedido> pedidos;
	
	public Endereco() {
		
	}
	
	public Long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}


	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getNomeLougradouro() {
		return nomeLougradouro;
	}

	public void setNomeLougradouro(String nomeLougradouro) {
		this.nomeLougradouro = nomeLougradouro;
	}

	public String getTipoLougradouro() {
		return tipoLougradouro;
	}

	public void setTipoLougradouro(String tipoLougradouro) {
		this.tipoLougradouro = tipoLougradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}


	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	

}
