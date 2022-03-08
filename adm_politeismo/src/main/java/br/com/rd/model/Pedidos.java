package br.com.rd.model;

<<<<<<< HEAD
import java.util.Date;
=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750

public class Pedidos {
	
	private Integer codigo;
<<<<<<< HEAD
	private Date dataPedido;
=======
	private String dataPedido;
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	private String nome;
	private String cpfCnpj;
	private String email;
	private String contato;
	private String produto;
<<<<<<< HEAD
	private Double volume;
	private Double peso;
	private Double preco;
=======
	private String volume;
	private String peso;
	private String preco;
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	private Double quantidade;
	private Double total;
	private String entrega;
	private String endereco;
	private String cep;
	private String municipio;
	private String statusPedido;
	private String statusPagamento;
	private String instituicao;
	private Double valorPago;
<<<<<<< HEAD
	private Date dataPagamento;
=======
	private String dataPagamento;
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	private String entregador;
	private String prazoEntrega;
	private Double valorFrete;
	private String statusEntrega;
<<<<<<< HEAD
	private Date dataEntrega;
=======
	private String dataEntrega;
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	
	
	
	
<<<<<<< HEAD
	public Pedidos(Integer codigo, Date dataPedido, String nome, String cpfCnpj, String email, String contato) {
=======
	public Pedidos(Integer codigo, String dataPedido, String nome, String cpfCnpj, String email, String contato) {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		super();
		this.codigo = codigo;
		this.dataPedido = dataPedido;
		this.nome = nome;
		this.cpfCnpj = cpfCnpj;
		this.email = email;
		this.contato = contato;
	}


<<<<<<< HEAD
	public Pedidos(Integer codigo, Date dataPedido, String nome, String cpfCnpj, String email, String contato,
			String produto, Double volume, Double peso, Double preco, Double quantidade, Double total, String entrega,
			String endereco, String cep, String municipio, String statusPedido, String statusPagamento,
			String instituicao, Double valorPago, Date dataPagamento, String entregador, String prazoEntrega,
			Double valorFrete, String statusEntrega, Date dataEntrega) {
=======
	public Pedidos(Integer codigo, String dataPedido, String nome, String cpfCnpj, String email, String contato,
			String produto, String volume, String peso, String preco, Double quantidade, Double total, String entrega,
			String endereco, String cep, String municipio, String statusPedido, String statusPagamento,
			String instituicao, Double valorPago, String dataPagamento, String entregador, String prazoEntrega,
			Double valorFrete, String statusEntrega, String dataEntrega) {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
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
		this.quantidade = quantidade;
		this.total = total;
		this.entrega = entrega;
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
		this.dataEntrega = dataEntrega;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


<<<<<<< HEAD
	public Date getDataPedido() {
=======
	public String getDataPedido() {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		return dataPedido;
	}


<<<<<<< HEAD
	public void setDataPedido(Date dataPedido) {
=======
	public void setDataPedido(String dataPedido) {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
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


<<<<<<< HEAD
	public Double getVolume() {
=======
	public String getVolume() {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		return volume;
	}


<<<<<<< HEAD
	public void setVolume(Double volume) {
=======
	public void setVolume(String volume) {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		this.volume = volume;
	}


<<<<<<< HEAD
	public Double getPeso() {
=======
	public String getPeso() {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		return peso;
	}


<<<<<<< HEAD
	public void setPeso(Double peso) {
=======
	public void setPeso(String peso) {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		this.peso = peso;
	}


<<<<<<< HEAD
	public Double getPreco() {
=======
	public String getPreco() {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		return preco;
	}


<<<<<<< HEAD
	public void setPreco(Double preco) {
=======
	public void setPreco(String preco) {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		this.preco = preco;
	}


	public Double getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}


	public Double getTotal() {
		return total;
	}


	public void setTotal(Double total) {
		this.total = total;
	}


	public String getEntrega() {
		return entrega;
	}


	public void setEntrega(String entrega) {
		this.entrega = entrega;
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


<<<<<<< HEAD
	public Date getDataPagamento() {
=======
	public String getDataPagamento() {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		return dataPagamento;
	}


<<<<<<< HEAD
	public void setDataPagamento(Date dataPagamento) {
=======
	public void setDataPagamento(String dataPagamento) {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
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


<<<<<<< HEAD
	public Date getDataEntrega() {
=======
	public String getDataEntrega() {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		return dataEntrega;
	}


<<<<<<< HEAD
	public void setDataEntrega(Date dataEntrega) {
=======
	public void setDataEntrega(String dataEntrega) {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		this.dataEntrega = dataEntrega;
	}
		

}//end class
