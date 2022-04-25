package br.com.rd.politeismo.ecommerce.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "ENDERECO")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_ENDERECO")
	private Long id_endereco;

	@Column(nullable = false, name = "APELIDO")
	private String apelido;

	@Column(nullable = true, name = "NOME_LOGRADOURO")
	private String nomeLougradouro;

	@Column(nullable = true, name = "TIPO_LOGRADO")
	private String tipoLougradouro;

	@Column(nullable = true, name = "NUMERO")
	private String numero;

	@Column(nullable = true, name = "CEP")
	private String cep;

	@Column(nullable = true, name = "CIDADE")
	private String cidade;
	
	@ManyToOne
	@JoinColumn(name="fk_id_estado", nullable = false)
	private Estado estado;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_fornecedor", nullable = true)
	private Fornecedor fornecedor;
	
	@Fetch(FetchMode.SELECT)
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "clienteFisica_endereco", joinColumns = {
    @JoinColumn(name = "clienteFisica_id_endereco") }, inverseJoinColumns = { @JoinColumn(name = "endereco_id_clienteFisica") })
	private List<Fisica> clientesFisica;
	
	@Fetch(FetchMode.SELECT)
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "clienteJuridica_endereco", joinColumns = {
    @JoinColumn(name = "clienteJuridica_id_endereco") }, inverseJoinColumns = { @JoinColumn(name = "endereco_id_clienteJuridica") })
	private List<Juridica> clientesJuridica;


	public Endereco() {
		
	}

	public Long getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(Long id_endereco) {
		this.id_endereco = id_endereco;
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}


	public List<Fisica> getClientesFisica() {
		return clientesFisica;
	}

	public void setClientesFisica(List<Fisica> clientesFisica) {
		this.clientesFisica = clientesFisica;
	}

	public List<Juridica> getClienteJuridica() {
		return clientesJuridica;
	}

	public void setClienteJuridica(List<Juridica> clienteJuridica) {
		this.clientesJuridica = clienteJuridica;
	}

	@Override
	public String toString() {
		return "Endereco [id_endereco=" + id_endereco + ", apelido=" + apelido + ", nomeLougradouro=" + nomeLougradouro
				+ ", tipoLougradouro=" + tipoLougradouro + ", numero=" + numero + ", cep=" + cep + ", cidade=" + cidade
				+ ", estado=" + estado + "]";
	}

}