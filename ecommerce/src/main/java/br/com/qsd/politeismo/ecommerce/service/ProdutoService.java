package br.com.qsd.politeismo.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.qsd.politeismo.ecommerce.entities.Produto;
import br.com.qsd.politeismo.ecommerce.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Page<Produto> visualizar(Pageable pageable ) {
		return produtoRepository.findAll(pageable);
	}
	
	public Optional<Produto> visualizarPorId(Long id){
		return produtoRepository.findById(id);
	}
	
}
