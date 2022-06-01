package br.com.qsd.politeismo.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.qsd.politeismo.ecommerce.controller.dto.PixDTO;
import br.com.qsd.politeismo.ecommerce.entities.Pix;
import br.com.qsd.politeismo.ecommerce.repository.PixRepository;

@Service
public class PixService {
	
	@Autowired
	private PixRepository repository;
	
	public PixDTO findById (Long id) {
		Pix entity = repository.findById(id).get();
		PixDTO dto = new PixDTO(entity);
		return dto;
	}
	
}//end class
