package br.com.qsd.politeismo.ecommerce.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.qsd.politeismo.ecommerce.controller.dto.EnderecoDTO;
import br.com.qsd.politeismo.ecommerce.controller.dto.PedidoDTO;
import br.com.qsd.politeismo.ecommerce.controller.dto.PedidoDetalheDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormPedido;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Endereco;
import br.com.qsd.politeismo.ecommerce.entities.Entrega;
import br.com.qsd.politeismo.ecommerce.entities.Pedido;
import br.com.qsd.politeismo.ecommerce.repository.ClienteRepository;
import br.com.qsd.politeismo.ecommerce.repository.EnderecoRepository;
import br.com.qsd.politeismo.ecommerce.repository.EntregaRepository;
import br.com.qsd.politeismo.ecommerce.repository.ItemPedidoRepository;
import br.com.qsd.politeismo.ecommerce.repository.PedidoRepository;
import br.com.qsd.politeismo.ecommerce.service.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private PedidoRepository pedidoRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private EntregaRepository entregaRepository;

	@Autowired
	private ItemPedidoRepository itemPedidoRepository;

	@GetMapping
	public List<PedidoDetalheDTO> listar() {
		List<Pedido> pedidos = pedidoRepository.findAll();
		return PedidoDetalheDTO.converter(pedidos);
	}

	@GetMapping("/{id}")
	public PedidoDetalheDTO listarId(@PathVariable("id") Long id) {
		Optional<Pedido> pedido = pedidoRepository.findById(id);
		return new PedidoDetalheDTO(pedido.get());
	}
	
	@GetMapping("/{id}/pedidos")
	public List<PedidoDTO> listaPedido(@PathVariable Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		List<Pedido> pedido = cliente.get().getPedido();
		return PedidoDTO.converter(pedido);
    }
	@GetMapping("/{id}/enderecos")
	public List<PedidoDTO> listaPedid(@PathVariable Long id) {
		Optional<Endereco> endereco = enderecoRepository.findById(id);
		List<Pedido> enderecos = endereco.get().getPedidos();
		return PedidoDTO.converter(enderecos);
    }

	@GetMapping("/{id}/entrega")
	public List<PedidoDTO>listaPedido1(@PathVariable Long id){
		Optional<Entrega> entrega =  entregaRepository.findById(id);
		List<Pedido> entregas = entrega.get().getPedidos();
				
		return  PedidoDTO.converter(entregas);
	}
	
	@PostMapping("/novo")
	@Transactional
	public ResponseEntity<PedidoDTO> cadastrar(@RequestBody @Valid FormPedido pedidoForm,
			UriComponentsBuilder uriBuilder) {

		Optional<Cliente> cliente = clienteRepository.findById(pedidoForm.getCliente());

		Pedido pedido = pedidoForm.converter(pedidoRepository, clienteRepository, enderecoRepository,
				itemPedidoRepository, entregaRepository);

		pedidoRepository.save(pedido);
		pedidoForm.cadastrarPedido(pedido, cliente.get(), pedidoRepository);
		URI uri = uriBuilder.path("/pedido/{id}").buildAndExpand(pedido.getIdPedido()).toUri();
		return ResponseEntity.created(uri).body(new PedidoDTO(pedido));

	}

}// end class
