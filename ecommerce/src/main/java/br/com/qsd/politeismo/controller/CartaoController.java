package br.com.qsd.politeismo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.qsd.politeismo.ecommerce.entities.Cartao;
import br.com.qsd.politeismo.repository.CartaoRepository;

@RestController
@RequestMapping("/cartoes")

public class CartaoController {

	
	@Autowired
	private CartaoRepository repo;	
	
	
	@GetMapping
	public List<Cartao> listar() {
		return repo.findAll();
	}
	

	

}
