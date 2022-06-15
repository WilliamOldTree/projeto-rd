package br.com.qsd.politeismo.ecommerce.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.qsd.politeismo.ecommerce.controller.dto.ClienteDTO;
import br.com.qsd.politeismo.ecommerce.controller.dto.PedidoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormCliente;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Pedido;
import br.com.qsd.politeismo.ecommerce.repository.ClienteRepository;
import br.com.qsd.politeismo.ecommerce.service.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	

	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
    public ResponseEntity<List<ClienteDTO>> findAll(){
    	List<ClienteDTO> list = service.findAll();
    	return ResponseEntity.ok(list);
    }
	
	@GetMapping(value = "/{id}")
	public ClienteDTO findById(@PathVariable Long id) {
		return service.findById(id);
    }
	
	
	@PostMapping
	public ResponseEntity <ClienteDTO> insert (@RequestBody FormCliente dto){
	    try { 
	       ClienteDTO entity = service.insert(dto);
	        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(entity.getId_cliente()).toUri();
	        return ResponseEntity.created(uri).body(entity);
	     } catch (ServiceException e) {
	           return ResponseEntity.unprocessableEntity().build();
	     }
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<ClienteDTO> update(@Valid @PathVariable Long id, @RequestBody FormCliente dto){
        ClienteDTO entity = service.update(id, dto);
		return ResponseEntity.ok().body(entity);
	}
	
	@DeleteMapping(value= "/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id){
		service.deletar(id);
		return ResponseEntity.noContent().build();
	}
	
}//end class
