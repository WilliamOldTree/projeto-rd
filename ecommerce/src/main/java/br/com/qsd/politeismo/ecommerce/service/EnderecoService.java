package br.com.qsd.politeismo.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import br.com.qsd.politeismo.ecommerce.controller.dto.EnderecoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormEndereco;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Endereco;
import br.com.qsd.politeismo.ecommerce.repository.ClienteRepository;
import br.com.qsd.politeismo.ecommerce.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository repository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
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

	@Transactional
	public Endereco insert(FormEndereco dto){
	    Endereco obj = new Endereco ();
		List<Cliente> clientes = new ArrayList<>();

	    obj.setApelido(dto.getApelido());
	    obj.setNomeLougradouro(dto.getNomeLougradouro());
	    obj.setTipoLougradouro(dto.getTipoLougradouro());
	    obj.setNumero(dto.getNumero());
	    obj.setCep(dto.getCep());
	    obj.setEstado(dto.getEstado());
	    obj.setCidade(dto.getCidade());
	    obj.setBairro(dto.getBairro());
	    
		Optional<Cliente> cliente = clienteRepository.findById(Long.parseLong(dto.getCliente()));
		
		if (cliente.isPresent()) {
			clientes.add(cliente.get());
			obj.setClientes(clientes);
		    obj = repository.save(obj);
		}else {
			//cliente = Optional.empty();
			cliente.orElseThrow();
		}
		
	    return obj;
	}
	
	
	public EnderecoDTO update(Long id, FormEndereco dto) {
		try {
			Endereco entity = repository.getById(id);
			copy(entity, dto);
			entity = repository.save(entity);
			return new EnderecoDTO(entity);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("ID não existe");
		}
	}
	
	
	private void copy(Endereco entity, FormEndereco dto) {
		entity.setApelido(dto.getApelido());
		entity.setNomeLougradouro(dto.getNomeLougradouro());
		entity.setTipoLougradouro(dto.getTipoLougradouro());
		entity.setNumero(dto.getNumero());
		entity.setCep(dto.getCep());
		entity.setEstado(dto.getEstado());
		entity.setCidade(dto.getCidade());
		entity.setBairro(dto.getBairro());
	}	
	
	public void deletar(Long id) {
		repository.deleteById(id);
	}
	
}
