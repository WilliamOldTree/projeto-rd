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
import br.com.qsd.politeismo.ecommerce.entities.Entrega;
import br.com.qsd.politeismo.ecommerce.entities.ItemPedido;
import br.com.qsd.politeismo.ecommerce.entities.Pedido;
import br.com.qsd.politeismo.ecommerce.repository.ClienteRepository;
import br.com.qsd.politeismo.ecommerce.repository.EnderecoRepository;
import br.com.qsd.politeismo.ecommerce.repository.EntregaRepository;
import br.com.qsd.politeismo.ecommerce.repository.ItemPedidoRepository;
import br.com.qsd.politeismo.ecommerce.repository.PedidoRepository;

public class FormPedido {

	private Date data;
	private SimpleDateFormat dataAtual = new SimpleDateFormat("dd/MM/yyyy");
	private BigDecimal valor;
	private String statusPedido;
	private Long cliente;
	private String formaPagamento;
	private Long endereco;
	private Long entrega;
	private List<ItemPedido> itensPedido;

	public FormPedido(String data, String valor, String statusPedido, String cliente, String formaPagamento,
			String endereco, String entrega) throws ParseException {
		this.data = dataAtual.parse(data);
		this.valor = new BigDecimal(valor);
		this.statusPedido = statusPedido;
		this.cliente = Long.parseLong(cliente);
		this.formaPagamento = formaPagamento;
		this.endereco = Long.parseLong(endereco);
		this.entrega =Long.parseLong(entrega);

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

	public String getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}

	public Long getCliente() {
		return cliente;
	}

	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Long getEndereco() {
		return endereco;
	}

	public void setEndereco(Long endereco) {
		this.endereco = endereco;
	}

	public Long getEntrega() {
		return entrega;
	}

	public void setEntrega(Long entrega) {
		this.entrega = entrega;
	}

	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(List<ItemPedido> itensPedido) {
		this.itensPedido = itensPedido;
	}

	public Pedido converter(PedidoRepository pedidoRepository, ClienteRepository clienteRepository,
			EnderecoRepository enderecoRepository, ItemPedidoRepository itemPedidoRepository, EntregaRepository entregaRepository) {

		Optional<Cliente> cliente = clienteRepository.findById(this.cliente);
		Optional<Endereco> endereco = enderecoRepository.findById(this.endereco);
		Optional<Entrega> entrega = entregaRepository.findById(this.entrega);
		List<ItemPedido> items = new ArrayList<ItemPedido>();
		items.add((ItemPedido) this.itensPedido);

		Pedido pedido = new Pedido(data,valor, statusPedido,cliente.get(),formaPagamento, endereco.get(), entrega.get());
		System.out.println(pedido);
		return pedido;
		

	}

	public List<PedidoDTO> cadastrarPedido(Pedido pedido, Cliente cliente, PedidoRepository pedidoRepository) {
		List<Pedido> pedidos;

		pedidos = cliente.getPedido();
		pedidos.add(pedido);
		cliente.setPedido(pedidos);
		pedidoRepository.save(cliente);
		return PedidoDTO.converter(pedidos);

	}

}// end class
