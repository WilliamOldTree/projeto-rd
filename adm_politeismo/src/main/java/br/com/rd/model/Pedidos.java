package br.com.rd.model;


import java.util.Date;


public class Pedidos {
	
	private Integer codigo;
	private String dataPedido;
	private String nome;
	private String cpfCnpj;
	private String email;
	private String contato;
	private String produto;
	private String volume;
	private String peso;
	private String preco;
	private Double quantidade;
	private Double total;
	private String endereco;
	private String cep;
	private String municipio;
	private String statusPedido;
	private String statusPagamento;
	private String instituicao;
	private Double valorPago;
	private String dataPagamento;
	private String entregador;
	private String prazoEntrega;
	private Double valorFrete;
	private String statusEntrega;
	private String dataEntrega;
	private String entrega;





	public Pedidos(Integer codigo, String dataPedido, String nome, String cpfCnpj, String email, String contato,
			String produto, String volume, String peso, String preco, Double quantidade, Double total, String entrega,
			String endereco, String cep, String municipio, String statusPedido, String statusPagamento,
			String instituicao, Double valorPago, String dataPagamento, String entregador, String prazoEntrega, Double valorfrete, String statusEntrega, String dataEntrega){

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
	public String getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(String dataPedido) {
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
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getPeso() {

		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
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
	public String getDataPagamento() {

		return dataPagamento;
	}
	public void setDataPagamento(String dataPagamento) {
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
	public String getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}		
}//end class
