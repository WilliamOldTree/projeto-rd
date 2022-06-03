package br.com.qsd.politeismo.ecommerce.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.qsd.politeismo.ecommerce.controller.dto.PedidoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormPedido;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Pedido;
import br.com.qsd.politeismo.ecommerce.enums.StatusPedido;
import br.com.qsd.politeismo.ecommerce.repository.ClienteRepository;
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
	
	@GetMapping
    public ResponseEntity<List<PedidoDTO>> findAll(){
    	List<PedidoDTO> list = pedidoService.findAll();
    	return ResponseEntity.ok(list);
    }
	
	@GetMapping(value = "/{id}")
	public PedidoDTO findById(@PathVariable ("id") Long id) {
		return pedidoService.findById(id);
    }
	
	@PostMapping(value="/novo")
	public ResponseEntity <PedidoDTO> insert (@RequestBody FormPedido dto){
	    try { 
	    	PedidoDTO obj = pedidoService.insert(dto);
	        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/pedidos/{id}").buildAndExpand(obj.getIdPedido()).toUri();
	        return ResponseEntity.created(uri).body(obj);
	     } catch (ServiceException e) {
	           return ResponseEntity.unprocessableEntity().build();
	     }
	}
	
	@PostMapping(value="/{idCliente}/{idPedido}")
	@Transactional
	public ResponseEntity<?> cancelar (@PathVariable ("idCliente") Long idCliente, @PathVariable("idPedido")Long idPedido ){
		Optional<Cliente> cliente = clienteRepository.findById(idCliente);
		Optional<Pedido> pedido= pedidoRepository.findById(idPedido);
		
		if (pedido.isPresent() && cliente.isPresent()) {
			List <Pedido> pedidos = new ArrayList<Pedido>();
			pedidos = cliente.get().getPedido();
			pedido.get().setStatusPedido(StatusPedido.CANCELADO);
			pedidos.add(pedido.get());
			cliente.get().setPedido(pedidos);
			clienteRepository.save(cliente.get());
			pedidoRepository.save(pedido.get());
			
			return ResponseEntity.ok().build(); 
		}
		
			
			return ResponseEntity.notFound().build();
	}
	
			
}//end class
