package br.com.rd.model;

import java.util.Date;

public class Pedidos {
	
	private Integer codigo;
	private Date dataPedido;
	private String nome;
	private String cpfCnpj;
	private String email;
	private String contato;
	private String produto;
	private Double volume;
	private Double peso;
	private Double preco;
	private Double total;
	private String endereco;
	private String cep;
	private String municipio;
	private String statusPedido;
	private String statusPagamento;
	private String instituicao;
	private Double valorPago;
	private Date dataPagamento;
	private String entregador;
	private String prazoEntrega;
	private Double valorFrete;
	private String statusEntrega;
	private Date dataentrega;
	
	
	
	
	public Pedidos(Integer codigo, Date dataPedido, String nome, String cpfCnpj, String email, String contato) {
		super();
		this.codigo = codigo;
		this.dataPedido = dataPedido;
		this.nome = nome;
		this.cpfCnpj = cpfCnpj;
		this.email = email;
		this.contato = contato;
	}




	public Pedidos(Integer codigo, Date dataPedido, String nome, String cpfCnpj, String email, String contato,
			String produto, Double volume, Double peso, Double preco, Double total, String endereco, String cep,
			String municipio, String statusPedido, String statusPagamento, String instituicao, Double valorPago,
			Date dataPagamento, String entregador, String prazoEntrega, Double valorFrete, String statusEntrega,
			Date dataentrega) {
		super();
		this.codigo = codigo;
		this.dataPedido = dataPedido;
		this.nome = nome;
		this.cpfCnpj = cpfCnpj;
		this.email = email;
		this.contato = contato;
		this.produto = produto;
		this.volume = volume;
		this.peso = peso;
		this.preco = preco;
		this.total = total;
		this.endereco = endereco;
		this.cep = cep;
		this.municipio = municipio;
		this.statusPedido = statusPedido;
		this.statusPagamento = statusPagamento;
		this.instituicao = instituicao;
		this.valorPago = valorPago;
		this.dataPagamento = dataPagamento;
		this.entregador = entregador;
		this.prazoEntrega = prazoEntrega;
		this.valorFrete = valorFrete;
		this.statusEntrega = statusEntrega;
		this.dataentrega = dataentrega;
	}




	public Integer getCodigo() {
		return codigo;
	}




	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}




	public Date getDataPedido() {
		return dataPedido;
	}




	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getCpfCnpj() {
		return cpfCnpj;
	}




	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getContato() {
		return contato;
	}




	public void setContato(String contato) {
		this.contato = contato;
	}




	public String getProduto() {
		return produto;
	}




	public void setProduto(String produto) {
		this.produto = produto;
	}




	public Double getVolume() {
		return volume;
	}




	public void setVolume(Double volume) {
		this.volume = volume;
	}




	public Double getPeso() {
		return peso;
	}




	public void setPeso(Double peso) {
		this.peso = peso;
	}




	public Double getPreco() {
		return preco;
	}




	public void setPreco(Double preco) {
		this.preco = preco;
	}




	public Double getTotal() {
		return total;
	}




	public void setTotal(Double total) {
		this.total = total;
	}




	public String getEndereco() {
		return endereco;
	}




	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}




	public String getCep() {
		return cep;
	}




	public void setCep(String cep) {
		this.cep = cep;
	}




	public String getMunicipio() {
		return municipio;
	}




	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}




	public String getStatusPedido() {
		return statusPedido;
	}




	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}




	public String getStatusPagamento() {
		return statusPagamento;
	}




	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}




	public String getInstituicao() {
		return instituicao;
	}




	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}




	public Double getValorPago() {
		return valorPago;
	}




	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}




	public Date getDataPagamento() {
		return dataPagamento;
	}




	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}




	public String getEntregador() {
		return entregador;
	}




	public void setEntregador(String entregador) {
		this.entregador = entregador;
	}




	public String getPrazoEntrega() {
		return prazoEntrega;
	}




	public void setPrazoEntrega(String prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}




	public Double getValorFrete() {
		return valorFrete;
	}




	public void setValorFrete(Double valorFrete) {
		this.valorFrete = valorFrete;
	}




	public String getStatusEntrega() {
		return statusEntrega;
	}




	public void setStatusEntrega(String statusEntrega) {
		this.statusEntrega = statusEntrega;
	}




	public Date getDataentrega() {
		return dataentrega;
	}




	public void setDataentrega(Date dataentrega) {
		this.dataentrega = dataentrega;
	}
	
	

}//end class
