package br.com.qsd.politeismo.ecommerce.service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import br.com.qsd.politeismo.ecommerce.controller.dto.BoletoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormBoleto;
import br.com.qsd.politeismo.ecommerce.entities.Boleto;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.repository.BoletoRepository;
import br.com.qsd.politeismo.ecommerce.repository.ClienteRepository;

@Service
public class BoletoService {

	@Autowired
	private BoletoRepository repository;

	@Autowired
	private ClienteRepository crepository;

	@Transactional(readOnly = true)
	public BoletoDTO findById(Long id) {

		Boleto entity = repository.findById(id).get();
		BoletoDTO dto = new BoletoDTO(entity);
		return dto;
	}

	public List<BoletoDTO> findAll() {
		List<Boleto> list = repository.findAll();
		return list.stream().map(x -> new BoletoDTO(x)).collect(Collectors.toList());
	}

	public BoletoDTO insert(FormBoleto form) {
		Boleto entity = new Boleto();
		entity.setNome(form.getNome());
		entity.setCpf(form.getCpf());
		entity.setCodigoBarra(form.getCodigoBarra());
		entity.setValor(form.getValor());

		Optional<Cliente> cliente = crepository.findById(form.getCliente());
		entity.setCliente(cliente.get());
		entity = repository.save(entity);
		return new BoletoDTO(entity);
	}

	public BoletoDTO update(@Valid Long id, FormBoleto dto) {
		try {
			Boleto entity = repository.getById(id);
			copy(entity, dto);
			entity = repository.save(entity);
			return new BoletoDTO(entity);
			
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("ID não existe");
		}
	}

	private void copy(Boleto entity, FormBoleto form) {
		entity.setNome(form.getNome());
		entity.setCpf(form.getCpf());
		entity.setCodigoBarra(form.getCodigoBarra());
		entity.setValor(form.getValor());

	}
}//End Class
