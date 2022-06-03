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

import br.com.qsd.politeismo.ecommerce.controller.dto.EnderecoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormEndereco;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Endereco;
import br.com.qsd.politeismo.ecommerce.repository.ClienteRepository;
import br.com.qsd.politeismo.ecommerce.service.EnderecoService;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoController {

	@Autowired
	private EnderecoService service;
	
	@Autowired
	private ClienteRepository cr;

	@GetMapping
    public ResponseEntity<List<EnderecoDTO>> findAll(){
    	List<EnderecoDTO> list = service.findAll();
    	return ResponseEntity.ok(list);
    }
	
	@GetMapping(value = "/{id}")
	public EnderecoDTO findById(@PathVariable Long id) {
		return service.findById(id);
    }
	
	@GetMapping("/{id}/enderecos")
	public List<EnderecoDTO> listaEndereco(@PathVariable Long id) {
		Optional<Cliente> cliente = cr.findById(id);
		
		List<Endereco> endereco = cliente.get().getEnderecos();
		
		return EnderecoDTO.converter(endereco);
    }
	
	
	@PostMapping
	public ResponseEntity <Endereco> insert (@RequestBody FormEndereco dto){
	    try { 
	    	Endereco obj = service.insert(dto);
	        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdEndereco()).toUri();
	        return ResponseEntity.created(uri).body(obj);
	     } catch (ServiceException e) {
	           return ResponseEntity.unprocessableEntity().build();
	     }
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<EnderecoDTO> update(@Valid @PathVariable Long id, @RequestBody FormEndereco dto){
        EnderecoDTO obj = service.update(id, dto);
		return ResponseEntity.ok().body(obj);
	}
	
	@DeleteMapping(value= "/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id){
		service.deletar(id);
		return ResponseEntity.noContent().build();
	}

}
