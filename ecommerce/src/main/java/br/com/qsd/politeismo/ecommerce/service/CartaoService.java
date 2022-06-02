package br.com.qsd.politeismo.ecommerce.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import br.com.qsd.politeismo.ecommerce.controller.dto.CartaoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormCartao;
import br.com.qsd.politeismo.ecommerce.entities.Cartao;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.repository.CartaoRepository;
import br.com.qsd.politeismo.ecommerce.repository.ClienteRepository;

@Service
public class CartaoService {

	@Autowired
	private CartaoRepository repository;

	@Autowired
	private ClienteRepository crepository;

	// listar
	public List<CartaoDTO> findAll() {
		List<Cartao> list = repository.findAll();
		return list.stream().map(x -> new CartaoDTO(x)).collect(Collectors.toList());
	}

	// busca por ID
	@Transactional(readOnly = true)
	public CartaoDTO findById(Long id) {
		Cartao entity = repository.findById(id).get();
		CartaoDTO dto = new CartaoDTO(entity);
		return dto;
	}

	// inclusao
	public CartaoDTO insert(FormCartao form) {
		Cartao entity = new Cartao();
		entity.setTitular_cartao(form.getTitular_cartao());
		entity.setNumero_cartao(form.getNumero_cartao());
		entity.setCvv_cartao(form.getCvv_cartao());
		entity.setValidade_cartao(form.getValidade_cartao());

		Optional<Cliente> cliente = crepository.findById(form.getCliente());
		entity.setCliente(cliente.get());

		entity = repository.save(entity);

		return new CartaoDTO(entity);

	}

	// buscar objeto pelo id para atualizar
	public CartaoDTO update(Long id, FormCartao dto) {
		try {
			Cartao entity = repository.getById(id);
			copy(entity, dto);
			entity = repository.save(entity);
			return new CartaoDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("ID não existe");
		}
	}

	private void copy(Cartao entity, FormCartao form) {
		entity.setTitular_cartao(form.getTitular_cartao());
		entity.setNumero_cartao(form.getNumero_cartao());
		entity.setCvv_cartao(form.getCvv_cartao());
		entity.setValidade_cartao(form.getValidade_cartao());

	}

	// deletar por id
	public void deletar(Long id) {
		repository.deleteById(id);
	}

}
