package br.com.qsd.politeismo.ecommerce.controller;

import java.net.URI;
import java.text.ParseException;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.qsd.politeismo.ecommerce.controller.dto.PedidoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormPedido;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Pedido;
import br.com.qsd.politeismo.ecommerce.repository.ClienteRepository;
import br.com.qsd.politeismo.ecommerce.repository.PedidoRepository;
import br.com.qsd.politeismo.ecommerce.service.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	@Autowired
    ClienteRepository clienteRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping
    public ResponseEntity<List<PedidoDTO>> findAll(){
    	List<PedidoDTO> list = pedidoService.findAll();
    	return ResponseEntity.ok(list);
    }
	
	@GetMapping(value = "/{id}")
	public PedidoDTO findById(@PathVariable Long id) {
		return pedidoService.findById(id);
    }
	
	@PostMapping
	public ResponseEntity <PedidoDTO> insert (@RequestBody FormPedido dto){
	    try { 
	    	PedidoDTO obj = pedidoService.insert(dto);
	        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdPedido()).toUri();
	        return ResponseEntity.created(uri).body(obj);
	     } catch (ServiceException e) {
	           return ResponseEntity.unprocessableEntity().build();
	     }
	}
	
//	@PostMapping("{id}/cadastrar")
//	@Transactional
//	public ResponseEntity<PedidoDTO> cadastrar(@PathVariable("id") Long id , @RequestBody @Valid FormPedido pedidoForm , 
//			UriComponentsBuilder uriBuilder) throws ParseException{
//	Optional<Cliente> cliente = clienteRepository.findById(id);
//	Optional<Cliente> endereço = clienteRepository.findById(id);
//	Pedido pedido = pedidoForm.converter(clienteRepository , freteRepository, enderecoRepository);
//	pedidoRepository.save(pedido);
//	pedidoForm.cadastrar(pedido, cliente.get() , pedidoRepository );
//	
//	URI uri = uriBuilder.path("/pedido/{id}").buildAndExpand(pedido.getCodPedido()).toUri();
//	return ResponseEntity.created(uri).body(new PedidoDTO(pedido));
//
//}

	
	@PutMapping(value = "/{id}")
	public ResponseEntity<PedidoDTO> update(@Valid @PathVariable Long id, @RequestBody FormPedido dto){
		PedidoDTO obj = pedidoService.update(id, dto);
		return ResponseEntity.ok().body(obj);
	}
}
