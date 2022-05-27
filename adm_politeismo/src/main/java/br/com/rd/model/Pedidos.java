package br.com.rd.model;

public class Pedidos {
	
	private Integer codigo;
	private String dataPedido;
	private String formaPagamento;
	private String statusPedido;
	private Double valorTotal;
	private String nomeCliente;
	private String cpf;
	private String email;
	private String fixo;
	private String celular;
	private String apelido;
	private String endereco;
	private String cidade;
	private String bairro;
	private String estado;
	private String cep;
	private String nomeProduto;
	private Double precoUnt;
	private Double volume;
	private Double peso;
	private Integer quantidade;
	
	public Pedidos(Integer codigo, String dataPedido, String formaPagamento, String statusPedido, Double valorTotal,
			String nomeCliente, String cpf, String email, String fixo, String celular, String apelido, String cidade,
			String bairro, String estado, String cep, String nomeProduto, Double precoUnt, Double volume, Double peso,
			Integer quantidade, String endereco) {
		this.codigo = codigo;
		this.dataPedido = dataPedido;
		this.formaPagamento = formaPagamento;
		this.statusPedido = statusPedido;
		this.valorTotal = valorTotal;
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.email = email;
		this.fixo = fixo;
		this.celular = celular;
		this.apelido = apelido;
		this.cidade = cidade;
		this.bairro = bairro;
		this.estado = estado;
		this.cep = cep;
		this.nomeProduto = nomeProduto;
		this.precoUnt = precoUnt;
		this.volume = volume;
		this.peso = peso;
		this.quantidade = quantidade;
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

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFixo() {
		return fixo;
	}

	public void setFixo(String fixo) {
		this.fixo = fixo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPrecoUnt() {
		return precoUnt;
	}

	public void setPrecoUnt(Double precoUnt) {
		this.precoUnt = precoUnt;
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

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	

}//end class
