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
<<<<<<< HEAD
	private Double quantidade;
	private Double total;
<<<<<<< HEAD
=======
>>>>>>> e49951b8871632bcfcfcad3dc0b75dd4bd27ed4a
=======
	private String volume;
	private String peso;
	private String preco;
<<<<<<< HEAD
=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
>>>>>>> e49951b8871632bcfcfcad3dc0b75dd4bd27ed4a
	private Double quantidade;
	private Double total;
	private String entrega;
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
	private String entrega;
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
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
<<<<<<< HEAD
<<<<<<< HEAD
	private Date dataentrega;
=======
	private String dataEntrega;
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
	private Date dataEntrega;
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
=======
	private Date dataEntrega;
=======
	private String dataEntrega;
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
>>>>>>> e49951b8871632bcfcfcad3dc0b75dd4bd27ed4a
	
	
	
	
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
<<<<<<< HEAD
<<<<<<< HEAD


	public Pedidos(Integer codigo, Date dataPedido, String nome, String cpfCnpj, String email, String contato,
			String produto, Double volume, Double peso, Double preco, Double total, String endereco, String cep,
			String municipio, String statusPedido, String statusPagamento, String instituicao, Double valorPago,
			Date dataPagamento, String entregador, String prazoEntrega, Double valorFrete, String statusEntrega,
			Date dataentrega) {
=======
	public Pedidos(Integer codigo, Date dataPedido, String nome, String cpfCnpj, String email, String contato,
			String produto, Double volume, Double peso, Double preco, Double quantidade, Double total, String entrega,
			String endereco, String cep, String municipio, String statusPedido, String statusPagamento,
			String instituicao, Double valorPago, Date dataPagamento, String entregador, String prazoEntrega,
			Double valorFrete, String statusEntrega, Date dataEntrega) {
>>>>>>> e49951b8871632bcfcfcad3dc0b75dd4bd27ed4a
=======
	public Pedidos(Integer codigo, String dataPedido, String nome, String cpfCnpj, String email, String contato,
			String produto, String volume, String peso, String preco, Double quantidade, Double total, String entrega,
			String endereco, String cep, String municipio, String statusPedido, String statusPagamento,
			String instituicao, Double valorPago, String dataPagamento, String entregador, String prazoEntrega,
			Double valorFrete, String statusEntrega, String dataEntrega) {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
<<<<<<< HEAD
=======
	public Pedidos(Integer codigo, Date dataPedido, String nome, String cpfCnpj, String email, String contato,
			String produto, Double volume, Double peso, Double preco, Double quantidade, Double total, String entrega,
			String endereco, String cep, String municipio, String statusPedido, String statusPagamento,
			String instituicao, Double valorPago, Date dataPagamento, String entregador, String prazoEntrega,
			Double valorFrete, String statusEntrega, Date dataEntrega) {
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
=======
>>>>>>> e49951b8871632bcfcfcad3dc0b75dd4bd27ed4a
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
<<<<<<< HEAD
		this.total = total;
=======
		this.quantidade = quantidade;
		this.total = total;
		this.entrega = entrega;
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
		this.quantidade = quantidade;
		this.total = total;
		this.entrega = entrega;
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
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
<<<<<<< HEAD
		this.dataentrega = dataentrega;
	}




=======
		this.dataEntrega = dataEntrega;
	}


>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
		this.dataEntrega = dataEntrega;
	}


>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public Integer getCodigo() {
		return codigo;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
=======
>>>>>>> e49951b8871632bcfcfcad3dc0b75dd4bd27ed4a
	public Date getDataPedido() {
=======
	public String getDataPedido() {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		return dataPedido;
	}


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
=======
>>>>>>> e49951b8871632bcfcfcad3dc0b75dd4bd27ed4a
	public void setDataPedido(Date dataPedido) {
=======
	public void setDataPedido(String dataPedido) {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		this.dataPedido = dataPedido;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public String getNome() {
		return nome;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public void setNome(String nome) {
		this.nome = nome;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public String getCpfCnpj() {
		return cpfCnpj;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public String getEmail() {
		return email;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public void setEmail(String email) {
		this.email = email;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public String getContato() {
		return contato;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public void setContato(String contato) {
		this.contato = contato;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public String getProduto() {
		return produto;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public void setProduto(String produto) {
		this.produto = produto;
	}


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
=======
>>>>>>> e49951b8871632bcfcfcad3dc0b75dd4bd27ed4a
	public Double getVolume() {
=======
	public String getVolume() {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		return volume;
	}


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
=======
>>>>>>> e49951b8871632bcfcfcad3dc0b75dd4bd27ed4a
	public void setVolume(Double volume) {
=======
	public void setVolume(String volume) {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		this.volume = volume;
	}


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
=======
>>>>>>> e49951b8871632bcfcfcad3dc0b75dd4bd27ed4a
	public Double getPeso() {
=======
	public String getPeso() {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		return peso;
	}


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
=======
>>>>>>> e49951b8871632bcfcfcad3dc0b75dd4bd27ed4a
	public void setPeso(Double peso) {
=======
	public void setPeso(String peso) {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		this.peso = peso;
	}


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
=======
>>>>>>> e49951b8871632bcfcfcad3dc0b75dd4bd27ed4a
	public Double getPreco() {
=======
	public String getPreco() {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		return preco;
	}


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public void setPreco(Double preco) {
		this.preco = preco;
	}


<<<<<<< HEAD
=======
	public void setPreco(String preco) {
=======
	public void setPreco(Double preco) {
=======
	public void setPreco(String preco) {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
>>>>>>> e49951b8871632bcfcfcad3dc0b75dd4bd27ed4a
		this.preco = preco;
	}


	public Double getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
	public Double getQuantidade() {
		return quantidade;
	}
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4


	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}


<<<<<<< HEAD
<<<<<<< HEAD
=======
	public Double getTotal() {
		return total;
	}
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
	public void setTotal(Double total) {
		this.total = total;
	}


<<<<<<< HEAD
<<<<<<< HEAD
=======
	public String getEntrega() {
		return entrega;
	}
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4


	public void setEntrega(String entrega) {
		this.entrega = entrega;
	}


<<<<<<< HEAD
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
=======
	public String getEndereco() {
		return endereco;
	}
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public String getCep() {
		return cep;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public void setCep(String cep) {
		this.cep = cep;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public String getMunicipio() {
		return municipio;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public String getStatusPedido() {
		return statusPedido;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public String getStatusPagamento() {
		return statusPagamento;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public String getInstituicao() {
		return instituicao;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public Double getValorPago() {
		return valorPago;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
=======
>>>>>>> e49951b8871632bcfcfcad3dc0b75dd4bd27ed4a
	public Date getDataPagamento() {
=======
	public String getDataPagamento() {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		return dataPagamento;
	}


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
=======
>>>>>>> e49951b8871632bcfcfcad3dc0b75dd4bd27ed4a
	public void setDataPagamento(Date dataPagamento) {
=======
	public void setDataPagamento(String dataPagamento) {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
		this.dataPagamento = dataPagamento;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public String getEntregador() {
		return entregador;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public void setEntregador(String entregador) {
		this.entregador = entregador;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public String getPrazoEntrega() {
		return prazoEntrega;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public void setPrazoEntrega(String prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public Double getValorFrete() {
		return valorFrete;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public void setValorFrete(Double valorFrete) {
		this.valorFrete = valorFrete;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public String getStatusEntrega() {
		return statusEntrega;
	}


<<<<<<< HEAD
<<<<<<< HEAD


=======
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	public void setStatusEntrega(String statusEntrega) {
		this.statusEntrega = statusEntrega;
	}


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD


	public Date getDataentrega() {
		return dataentrega;
=======
	public Date getDataEntrega() {
=======
	public Date getDataEntrega() {
=======
	public String getDataEntrega() {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
>>>>>>> e49951b8871632bcfcfcad3dc0b75dd4bd27ed4a
		return dataEntrega;
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4
	}


<<<<<<< HEAD
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
<<<<<<< HEAD
	
	
=======
	public String getDataEntrega() {
		return dataEntrega;
	}


	public void setDataEntrega(String dataEntrega) {
=======
<<<<<<< HEAD
	public void setDataEntrega(Date dataEntrega) {
=======
	public void setDataEntrega(String dataEntrega) {
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
>>>>>>> e49951b8871632bcfcfcad3dc0b75dd4bd27ed4a
		this.dataEntrega = dataEntrega;
	}
		
>>>>>>> 7102b74fe3215cc10b4c399b23bd593e0e7a7750
=======
		
>>>>>>> 56dd0a2b798ccddc7abf43a6341a2a0dcd14e8d4

}//end class
