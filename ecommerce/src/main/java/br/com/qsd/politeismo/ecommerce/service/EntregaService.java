package br.com.qsd.politeismo.ecommerce.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import br.com.qsd.politeismo.ecommerce.controller.dto.EntregaDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.EntregaForm;
import br.com.qsd.politeismo.ecommerce.entities.Entrega;
import br.com.qsd.politeismo.ecommerce.repository.EntregaRepository;

@Service
public class EntregaService {
	
	private EntregaRepository repository;
	
	
	//listar
	public List <EntregaDTO> findAll (){
		List<Entrega> list = repository.findAll();
		return list.stream().map(x -> new EntregaDTO(x)).collect(Collectors.toList());
		
	}
	
	//buscar por id
	public EntregaDTO findById (Long id) {
		Entrega entity = repository.findById(id).get();
		EntregaDTO dto = new EntregaDTO(entity);
		return dto;
	}
	
	//deletar
	public void deletarEntrega (Long id) {
		repository.deleteById(id);
	}
	
	//inserir
	public EntregaDTO insertEntrega(EntregaForm form) {
		Entrega entity = new Entrega();
		entity.setData(LocalDate.parse(form.getData()));
		entity.setValor(new BigDecimal(form.getValor()));
		entity.setStatusEntrega(form.getStatusEntrega());
		entity.setFormaEntrega(form.getFormaEntrega());
		
		repository.save(entity);
		
		return new EntregaDTO(entity);
	}
	
	
	//update
	public EntregaDTO update(Long id, EntregaForm dto) {
		try {
			Entrega entity = repository.getById(id);
			copy(entity, dto);
			entity = repository.save(entity);
			return new EntregaDTO(entity);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("ID não existe");
		}
	}
	
	
	//novo objeto ja atualizado
	private void copy(Entrega entity, EntregaForm form) {
		entity.setData(LocalDate.parse(form.getData()));
		entity.setValor(new BigDecimal(form.getValor()));
		entity.setStatusEntrega(form.getStatusEntrega());
		entity.setFormaEntrega(form.getFormaEntrega());
		
	}
	
	
}//end class
