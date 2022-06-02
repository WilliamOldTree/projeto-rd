package br.com.qsd.politeismo.ecommerce.controller.form;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import br.com.qsd.politeismo.ecommerce.controller.dto.PedidoDTO;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Endereco;
import br.com.qsd.politeismo.ecommerce.entities.ItemPedido;
import br.com.qsd.politeismo.ecommerce.entities.Pedido;
import br.com.qsd.politeismo.ecommerce.enums.FormaPagamento;
import br.com.qsd.politeismo.ecommerce.enums.StatusPedido;
import br.com.qsd.politeismo.ecommerce.repository.ClienteRepository;
import br.com.qsd.politeismo.ecommerce.repository.EnderecoRepository;
import br.com.qsd.politeismo.ecommerce.repository.PedidoRepository;

public class FormPedido {

	private Date data;
	private SimpleDateFormat dataAtual = new SimpleDateFormat("dd/MM/yyyy");
	private BigDecimal valor;
	private StatusPedido statusPedido;
	private Long cliente;
	private FormaPagamento formaPagamento;
	private Long endereco;
	private List<ItemPedido> itensPedido;

	

	public FormPedido(String data, String valor, String statusPedido, String cliente, String formaPagamento,
			String endereco) throws ParseException {

			this.data = dataAtual.parse(data);
			this.valor = new BigDecimal(valor);
			StatusPedido statusPedidoEnum = StatusPedido.valueOf(statusPedido);
			this.statusPedido = statusPedidoEnum;
			this.cliente = Long.parseLong(cliente);
			FormaPagamento formaPagamentoEnum = FormaPagamento.valueOf(formaPagamento);
			this.formaPagamento = formaPagamentoEnum;
			this.endereco = Long.parseLong(endereco);
			
			

	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public SimpleDateFormat getDataAtual() {
		return dataAtual;
	}

	public void setDataAtual(SimpleDateFormat dataAtual) {
		this.dataAtual = dataAtual;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public StatusPedido getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}

	public Long getCliente() {
		return cliente;
	}

	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Long getEndereco() {
		return endereco;
	}

	public void setEndereco(Long endereco) {
		this.endereco = endereco;
	}

	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(List<ItemPedido> itensPedido) {
		this.itensPedido = itensPedido;
	}
	
	
//	public Pedido converter (ClienteRepository clienteRepository, EnderecoRepository enderecoRepository) {
//		
//		Optional<Cliente> cliente = clienteRepository.findById(this.cliente);
//		Optional<Endereco> endereco =  enderecoRepository.findById(this.endereco);
//		
//		List <ItemPedido> itensPedido = new ArrayList<ItemPedido>();
//		
//		Pedido pedido = new Pedido (data, valor, statusPedido, cliente.get(),formaPagamento, endereco.get());
//		
//		return pedido;
//	}
	
//	public List<PedidoDTO> cadastrar(Pedido pedido, Cliente cliente, PedidoRepository pedidoRepository){
//		
//		List<Pedido> pedidos;
//		pedidos = cliente.getPedido();
//		pedidos.add(pedido);
//		cliente.setPedido(pedidos);
//		pedidoRepository.save(cliente);
//				
//		return PedidoDTO.converter(pedidos);
//	
//	}
	
	
}// end class
