package br.com.qsd.politeismo.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.qsd.politeismo.ecommerce.controller.dto.TelefoneDTO;
import br.com.qsd.politeismo.ecommerce.entities.Telefone;
import br.com.qsd.politeismo.ecommerce.repository.TelefoneRepository;
import br.com.qsd.politeismo.ecommerce.service.TelefoneService;

@RestController
@RequestMapping(value = "/telefone")
public class TelefoneController {
	
	@Autowired
	private TelefoneRepository repository;
	
	@Autowired
	private TelefoneService service;
	
	@GetMapping
	public List<Telefone> findAll(){
		List<Telefone> result = repository.findAll();
		return result;
	}

	@GetMapping(value = "/{id}")
	public TelefoneDTO findById(@PathVariable Long id){
		return service.findById(id);
	}
	
	@PostMapping
	public Telefone insert (@RequestBody Telefone telefone){
		Telefone result = repository.save(telefone);
		return result;
	}

}