package br.com.qsd.politeismo.ecommerce.service;

import java.util.List;
import java.util.stream.Collectors;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.qsd.politeismo.ecommerce.controller.dto.TelefoneDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormTelefoneDTO;
import br.com.qsd.politeismo.ecommerce.entities.Telefone;
import br.com.qsd.politeismo.ecommerce.repository.TelefoneRepository;

@Service
public class TelefoneService {

	@Autowired
	private TelefoneRepository repository;
	
	public List<TelefoneDTO> findAll(){
		List <Telefone> list = repository.findAll();
		return list.stream().map(x-> new TelefoneDTO()).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public TelefoneDTO findById(Long id) {
		Telefone entity = repository.findById(id).get();
		TelefoneDTO dto = new TelefoneDTO();
		return dto;
	}

	public TelefoneDTO insert(FormTelefoneDTO dto){
	    Telefone obj = new Telefone ();
	    obj.setDdd(dto.getDdd);
	    obj.setCelular(dto.getCelular);
	    obj.setFixo(dto.getFixo);
	    obj = repository.save(obj);
	    
	    return new TelefoneDTO();
	 
	}


}
