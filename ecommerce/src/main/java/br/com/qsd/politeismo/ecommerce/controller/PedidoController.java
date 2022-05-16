package br.com.qsd.politeismo.ecommerce.controller;

import java.net.URI;
import java.util.List;
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
import br.com.qsd.politeismo.ecommerce.controller.dto.PedidoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormPedido;
import br.com.qsd.politeismo.ecommerce.service.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
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
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<PedidoDTO> update(@Valid @PathVariable Long id, @RequestBody FormPedido dto){
		PedidoDTO obj = pedidoService.update(id, dto);
		return ResponseEntity.ok().body(obj);
	}
}
