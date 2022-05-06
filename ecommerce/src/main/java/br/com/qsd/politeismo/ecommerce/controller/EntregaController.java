package br.com.qsd.politeismo.ecommerce.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

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
import br.com.qsd.politeismo.ecommerce.controller.dto.EntregaDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.EntregaForm;
import br.com.qsd.politeismo.ecommerce.service.EntregaService;

@RestController
@RequestMapping(value="entregas")
public class EntregaController {

	@Autowired
	private EntregaService service;
	
	//listar
	@GetMapping
	public ResponseEntity<List<EntregaDTO>>findAll(){
		List<EntregaDTO>list=service.findAll();
		return ResponseEntity.ok(list);
	}
	
	
	//buscar por ID
	@GetMapping(value = "/{id}")
	public EntregaDTO findById(@PathVariable Long id) {
		return service.findById(id);
    }
	
	
	//inserir
	@PostMapping
	public ResponseEntity <EntregaDTO> insert (@RequestBody EntregaForm form){
		try {
			EntregaDTO dto = service.insertEntrega(form);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
	        return ResponseEntity.created(uri).body(dto);
			
		} catch (Exception e) {
			 return ResponseEntity.unprocessableEntity().build();
		}
			
	}
	
	
	//atualizar
	@PutMapping(value = "/{id}")
	public ResponseEntity<EntregaDTO> update(@Valid @PathVariable Long id, @RequestBody EntregaForm form){
        EntregaDTO dto = service.update(id, form);
		return ResponseEntity.ok().body(dto);
	}
	
	
	//deletar
	@DeleteMapping(value= "/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id){
		service.deletarEntrega(id);
		return ResponseEntity.noContent().build();
	}
	
}//end class
