package br.com.qsd.politeismo.ecommerce.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import br.com.qsd.politeismo.ecommerce.controller.dto.EnderecoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormEnderecoDTO;
import br.com.qsd.politeismo.ecommerce.entities.Endereco;
import br.com.qsd.politeismo.ecommerce.repository.EnderecoRepository;

@Service
public class EnderecoService {
	@Autowired
	private EnderecoRepository repository;

	@Transactional(readOnly = true)
	public List<EnderecoDTO> findAll(){
		List <Endereco> list = repository.findAll();
		return list.stream().map(x-> new EnderecoDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public EnderecoDTO findById(Long id) {
		Endereco entity = repository.findById(id).get();
		EnderecoDTO dto = new EnderecoDTO(entity);
		return dto;
	}
	
	
	public EnderecoDTO insert(FormEnderecoDTO dto){
	    Endereco obj = new Endereco ();
	    obj.setApelido(dto.getApelido());
	    obj.setNomeLougradouro(dto.getNomeLougradouro());
	    obj.setTipoLougradouro(dto.getTipoLougradouro());
	    obj.setNumero(dto.getNumero());
	    obj.setCep(dto.getCep());
	    obj.setCidade(dto.getCidade());
	    obj.setBairro(dto.getBairro());
	    obj = repository.save(obj);
	    
	    return new EnderecoDTO(obj);
	}
	
	public EnderecoDTO update(Long id, FormEnderecoDTO dto) {
		try {
			Endereco entity = repository.getById(id);
			copy(entity, dto);
			entity = repository.save(entity);
			return new EnderecoDTO(entity);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("ID não existe");
		}
	}
	
	
	private void copy(Endereco entity, FormEnderecoDTO dto) {
		entity.setApelido(dto.getApelido());
		entity.setNomeLougradouro(dto.getNomeLougradouro());
		entity.setTipoLougradouro(dto.getTipoLougradouro());
		entity.setNumero(dto.getNumero());
		entity.setCep(dto.getCep());
		entity.setCidade(dto.getCidade());
		entity.setBairro(dto.getBairro());
	}	

}
