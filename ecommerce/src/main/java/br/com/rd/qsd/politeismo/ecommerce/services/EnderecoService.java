package br.com.rd.qsd.politeismo.ecommerce.services;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rd.qsd.politeismo.ecommerce.controllers.dto.EnderecoDTO;
import br.com.rd.qsd.politeismo.ecommerce.entities.Endereco;
import br.com.rd.qsd.politeismo.ecommerce.repositories.EnderecoRepository;

@Service
public class EnderecoService {
	@Autowired
	private EnderecoRepository enderecoRepository;

	@Transactional(readOnly = true)
	public EnderecoDTO findById(Long id) {
		Endereco entity = enderecoRepository.findById(id).get();
		EnderecoDTO dto = new EnderecoDTO(entity);
		return dto;
	}
}
