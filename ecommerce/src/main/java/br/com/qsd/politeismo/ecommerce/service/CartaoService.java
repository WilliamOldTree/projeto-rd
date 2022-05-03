package br.com.qsd.politeismo.ecommerce.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.qsd.politeismo.ecommerce.controller.dto.CartaoDTO;
import br.com.qsd.politeismo.ecommerce.controller.dto.EnderecoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormCartaoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormEnderecoDTO;
import br.com.qsd.politeismo.ecommerce.entities.Cartao;
import br.com.qsd.politeismo.ecommerce.entities.Endereco;
import br.com.qsd.politeismo.ecommerce.repository.CartaoRepository;

@Service
public class CartaoService {
	@Autowired
	private CartaoRepository repository;
	
	@Transactional(readOnly = true)
	public List<CartaoDTO> findAll(){
		List<Cartao> list = repository.findAll();
		return list.stream().map(x-> new CartaoDTO(x)).collect(Collectors.toList());	
	}
	
	@Transactional(readOnly = true)
	public CartaoDTO findById(Long id) {
		Cartao cartao = repository.findById(id).get();
		CartaoDTO dto = new CartaoDTO(cartao);
		return dto;
	}
	
	public CartaoDTO insert(FormCartaoDTO dto) {
		Cartao obj = new Cartao();
		obj.setTitular_cartao(dto.getTitular_cartao());
		obj.setValidade_cartao(dto.getCvv_cartao());
		obj.setCliente(dto.getCliente());
		obj.setFormaPagamento(obj.getFormaPagamento());
		obj= repository.save(obj);
		return new CartaoDTO(obj);
	}
	
	
	public CartaoDTO update(Long id, FormCartaoDTO dto) {
		try {
			Cartao cartao = repository.getById(id);
			copy(cartao, dto);
			cartao = repository.save(cartao);
			return new CartaoDTO(cartao);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("ID não existe");
		}
	}
	
	private void copy(Cartao cartao, FormCartaoDTO dto) {
       cartao.setTitular_cartao(dto.getTitular_cartao());
       cartao.setValidade_cartao(dto.getValidade_cartao());
       cartao.setFormaPagamento(dto.getForma());
	}

	public void deletar(Long id) {
		repository.deleteById(id);
	}
	
}//end class
