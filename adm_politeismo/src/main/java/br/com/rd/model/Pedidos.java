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
	private Double total;
=======
	private String volume;
	private String peso;
	private String preco;
	private Double quantidade;
	private Double total;
	private String entrega;
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
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
	private Date dataentrega;
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
			String produto, Double volume, Double peso, Double preco, Double total, String endereco, String cep,
			String municipio, String statusPedido, String statusPagamento, String instituicao, Double valorPago,
			Date dataPagamento, String entregador, String prazoEntrega, Double valorFrete, String statusEntrega,
			Date dataentrega) {
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
<<<<<<< HEAD
		this.total = total;
=======
		this.quantidade = quantidade;
		this.total = total;
		this.entrega = entrega;
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
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
<<<<<<< HEAD
		this.dataentrega = dataentrega;
	}




=======
		this.dataEntrega = dataEntrega;
	}


>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public Integer getCodigo() {
		return codigo;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
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


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public String getNome() {
		return nome;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public void setNome(String nome) {
		this.nome = nome;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public String getCpfCnpj() {
		return cpfCnpj;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public String getEmail() {
		return email;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public void setEmail(String email) {
		this.email = email;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public String getContato() {
		return contato;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public void setContato(String contato) {
		this.contato = contato;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public String getProduto() {
		return produto;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
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
		this.preco = preco;
	}


=======
	public void setPreco(String preco) {
		this.preco = preco;
	}


	public Double getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750


	public Double getTotal() {
		return total;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public void setTotal(Double total) {
		this.total = total;
	}


<<<<<<< HEAD


	public String getEndereco() {
		return endereco;
	}


=======
	public String getEntrega() {
		return entrega;
	}


	public void setEntrega(String entrega) {
		this.entrega = entrega;
	}


	public String getEndereco() {
		return endereco;
	}
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public String getCep() {
		return cep;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public void setCep(String cep) {
		this.cep = cep;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public String getMunicipio() {
		return municipio;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public String getStatusPedido() {
		return statusPedido;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public String getStatusPagamento() {
		return statusPagamento;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public String getInstituicao() {
		return instituicao;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public Double getValorPago() {
		return valorPago;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
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


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public String getEntregador() {
		return entregador;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public void setEntregador(String entregador) {
		this.entregador = entregador;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public String getPrazoEntrega() {
		return prazoEntrega;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public void setPrazoEntrega(String prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public Double getValorFrete() {
		return valorFrete;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public void setValorFrete(Double valorFrete) {
		this.valorFrete = valorFrete;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public String getStatusEntrega() {
		return statusEntrega;
	}


<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public void setStatusEntrega(String statusEntrega) {
		this.statusEntrega = statusEntrega;
	}


<<<<<<< HEAD


	public Date getDataentrega() {
		return dataentrega;
	}




	public void setDataentrega(Date dataentrega) {
		this.dataentrega = dataentrega;
	}
	
	
=======
	public String getDataEntrega() {
		return dataEntrega;
	}


	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
		
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750

}//end class
