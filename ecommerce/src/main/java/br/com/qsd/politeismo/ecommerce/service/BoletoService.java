package br.com.qsd.politeismo.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.qsd.politeismo.ecommerce.controller.dto.BoletoDTO;
import br.com.qsd.politeismo.ecommerce.entities.Boleto;
import br.com.qsd.politeismo.ecommerce.repository.BoletoRepository;

@Service
public class BoletoService {

	@Autowired
	private BoletoRepository repository;
	
	public BoletoDTO findById(Long id) {
		
		Boleto entity = repository.findById(id).get();
		BoletoDTO dto = new BoletoDTO(entity);
		return dto;
	}
	
}
