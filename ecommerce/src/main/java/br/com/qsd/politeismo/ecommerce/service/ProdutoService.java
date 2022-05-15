package br.com.qsd.politeismo.ecommerce.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.qsd.politeismo.ecommerce.controller.dto.ProdutoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormProduto;
import br.com.qsd.politeismo.ecommerce.entities.Produto;
import br.com.qsd.politeismo.ecommerce.repository.ProdutoRepository;


@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;
	
	@Transactional(readOnly = true)
	public List<ProdutoDTO> findAll(){
		List<Produto> list = repository.findAll();
		return list.stream().map(x-> new ProdutoDTO(x)).collect(Collectors.toList());	
	}
	
	@Transactional(readOnly = true)
	public ProdutoDTO findById(Long id_produto) {
		Produto produto = repository.findById(id_produto).get();
		ProdutoDTO dto = new ProdutoDTO(produto);
		return dto;
	}
	
	
	
	public ProdutoDTO insert(FormProduto dto) {
		Produto obj = new Produto();
		obj.setDescricao(dto.getDescricao());
		obj.setVolume(dto.getVolume());
		obj.setPeso(dto.getPeso());
		obj.setStatus(dto.getStatus());
		obj.setPreco(obj.getPreco());
		obj= repository.save(obj);
		return new ProdutoDTO(obj);
	}
	
	public ProdutoDTO update(Long id_produto, FormProduto dto) {
		try {
			Produto produto = repository.getById(id_produto);
			copy(produto, dto);
			produto = repository.save(produto);
			return new ProdutoDTO(produto);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("ID não existe");
		}
		

	}
	
	private void copy(Produto produto, FormProduto dto) {
       produto.setDescricao(dto.getDescricao());
       produto.setVolume(dto.getVolume());
       produto.setPeso(dto.getPeso());
       produto.setStatus(dto.getStatus());
       produto.setPreco(dto.getPreco());
	}

	public void deletar(Long id) {
		repository.deleteById(id);
	}
	
	}
	