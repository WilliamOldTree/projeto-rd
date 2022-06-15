package br.com.qsd.politeismo.ecommerce.service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import br.com.qsd.politeismo.ecommerce.controller.dto.PixDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormPix;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Pix;
import br.com.qsd.politeismo.ecommerce.repository.ClienteRepository;
import br.com.qsd.politeismo.ecommerce.repository.PixRepository;


@Service
public class PixService {
	
	@Autowired
	private PixRepository repository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Transactional(readOnly = true) 
	public PixDTO findById (Long id) {
		Pix entity = repository.findById(id).get();
		PixDTO dto = new PixDTO(entity);
		return dto;
	}
	
	public List<PixDTO> findAll() {
		List<Pix> list = repository.findAll();
		return list.stream().map(x -> new PixDTO (x)).collect(Collectors.toList());
	}

	public PixDTO insert(FormPix form) {
		Pix entity = new Pix ();
		entity.setChave(form.getChave());
		entity.setUrlImagem(form.getUrlImagem());
		
		Optional<Cliente> cliente = clienteRepository.findById(form.getCliente());
		entity.setCliente(cliente.get());
		entity = repository.save(entity);
		return new PixDTO(entity);
	}

	public PixDTO update(@Valid Long id, FormPix dto) {
		try {
			Pix entity = repository.getById(id);
			copy(entity, dto);
			entity = repository.save(entity);
			return new PixDTO(entity);
			
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id não existe."); 
		} 
		
	}
	
	private void copy(Pix entity, FormPix form) {
		entity.setChave(form.getChave());
		entity.setUrlImagem(form.getUrlImagem());
	}	
}//end class