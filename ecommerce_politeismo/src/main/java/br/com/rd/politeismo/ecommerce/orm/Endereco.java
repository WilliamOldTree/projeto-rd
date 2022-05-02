//package br.com.rd.politeismo.ecommerce.orm;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//
//@Entity
//@Table(name = "ENDERECO")
//public class Endereco {
//
//	public Endereco() {
//		
//	}
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="ID_ENDERECO")
//	private Long id_endereco;
//
//	@Column(nullable = false, name = "APELIDO")
//	private String apelido;
//
//	@Column(nullable = true, name = "NOME_LOGRADOURO")
//	private String nome_lougradouro;
//
//	@Column(nullable = true, name = "TIPO_LOGRADO")
//	private String lougradouro;
//
//	@Column(nullable = true, name = "NUMERO")
//	private String numero;
//
//	@Column(nullable = true, name = "CEP")
//	private String cep;
//
//	@Column(nullable = true, name = "CIDADE")
//	private String cidade;
//	
//	@ManyToOne
//	@JoinColumn(name="estado_id_estado", nullable = false)
//	private Estado estado;
//
//
//	public Long getId_endereco() {
//		return id_endereco;
//	}
//
//	public void setId_endereco(Long id_endereco) {
//		this.id_endereco = id_endereco;
//	}
//
//	public String getApelido() {
//		return apelido;
//	}
//
//	public void setApelido(String apelido) {
//		this.apelido = apelido;
//	}
//
//	public String getNome_lougradouro() {
//		return nome_lougradouro;
//	}
//
//	public void setNome_lougradouro(String nome_lougradouro) {
//		this.nome_lougradouro = nome_lougradouro;
//	}
//
//	public String getLougradouro() {
//		return lougradouro;
//	}
//
//	public void setLougradouro(String lougradouro) {
//		this.lougradouro = lougradouro;
//	}
//
//	public String getNumero() {
//		return numero;
//	}
//
//	public void setNumero(String numero) {
//		this.numero = numero;
//	}
//
//	public String getCep() {
//		return cep;
//	}
//
//	public void setCep(String cep) {
//		this.cep = cep;
//	}
//
//	public String getCidade() {
//		return cidade;
//	}
//
//	public void setCidade(String cidade) {
//		this.cidade = cidade;
//	}
//
//
//
//
//
//}