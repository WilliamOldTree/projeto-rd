 package br.com.qsd.politeismo.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ENDERECO")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_ENDERECO")
	private Long id_endereco;

	@Column(nullable = false, name = "APELIDO")
	private String apelido;

	@Column(nullable = false, name = "NOME_LOGRADOURO")
	private String nomeLougradouro;

	@Column(nullable = false, name = "TIPO_LOGRADO")
	private String tipoLougradouro;

	@Column(nullable = false, name = "NUMERO")
	private String numero;

	@Column(nullable = false, name = "CEP")
	private String cep;

	@Column(nullable = false, name = "CIDADE")
	private String cidade;
	
	@Column(nullable = false, name = "BAIRRO")
	private String bairro;
	
//	@ManyToOne
//	@JoinColumn(name="fk_id_estado", nullable = false)
//	private Estado estado;
	
	@ManyToOne
	@JoinColumn(nullable = true, name = "fk_id_cliente")
	private Cliente cliente;
	
//	
//	@ManyToOne
//	@JoinColumn(name = "fk_id_fornecedor", nullable = true)
//	private Fornecedor fornecedor;
	
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

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
}
