package br.com.qsd.politeismo.ecommerce.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.qsd.politeismo.ecommerce.controller.dto.EntregaDTO;
import br.com.qsd.politeismo.ecommerce.entities.Entrega;
import br.com.qsd.politeismo.ecommerce.repository.EntregaRepository;

@RestController
@RequestMapping(value = "/entregas")
public class EntregaController {
	
	@Autowired
	private EntregaRepository entregaRepository;
	
	@GetMapping	
	public List<EntregaDTO> listaProdutos(){
		
			List<Entrega> entregas = entregaRepository.findAll();
			return EntregaDTO.converter(entregas);
	}

}
