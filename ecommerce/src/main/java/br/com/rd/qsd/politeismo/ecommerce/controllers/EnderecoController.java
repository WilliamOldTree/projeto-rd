package br.com.rd.qsd.politeismo.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.rd.qsd.politeismo.ecommerce.controllers.dto.EnderecoDTO;
import br.com.rd.qsd.politeismo.ecommerce.services.EnderecoService;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoController {
	
	@Autowired
	private EnderecoService enderecoService;

	@GetMapping(value = "/{id}")
	public EnderecoDTO findById(@PathVariable Long id) {
		return enderecoService.findById(id);
	}
}
