package br.com.qsd.politeismo.ecommerce.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.qsd.politeismo.ecommerce.controller.dto.ClienteDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormCliente;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	// listar
	public List<ClienteDTO> findAll() {
		List<Cliente> list = repository.findAll();
		return list.stream().map(x -> new ClienteDTO(x)).collect(Collectors.toList());
	}

	// busca por ID
	@Transactional(readOnly = true)
	public ClienteDTO findById(Long id) {
		Cliente entity = repository.findById(id).get();
		ClienteDTO dto = new ClienteDTO(entity);
		return dto;
	}

	// inclusao
	public ClienteDTO insert(FormCliente form) {
		Cliente entity = new Cliente();
		entity.setCpf(form.getCpf());
		entity.setNome(form.getNome());
		entity.setEmail(form.getEmail());
		entity.setPassword(form.getPassword());
		entity.setNascimento(form.getNascimento());
		entity.setGenero(form.getGenero());

		entity = repository.save(entity);

		return new ClienteDTO(entity);

	}
	
	//buscar objeto pelo id para atualizar
	public ClienteDTO update(Long id, FormCliente dto) {
		try {
			Cliente entity = repository.getById(id);
			copy(entity, dto);
			entity = repository.save(entity);
			return new ClienteDTO(entity);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("ID não existe");
		}
	}
	
	// novos dados do objeto a ser atualizado
	private void copy(Cliente entity, FormCliente dto) {
		entity.setCpf(dto.getCpf());
		entity.setNome(dto.getNome());
		entity.setEmail(dto.getEmail());
		entity.setPassword(dto.getPassword());
		entity.setNascimento(dto.getNascimento());
		entity.setGenero(dto.getGenero());
		
	}
	
	//deletar po id
	public void deletar(Long id) {
		repository.deleteById(id);
	}
	

}// end class
