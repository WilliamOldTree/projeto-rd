package br.com.qsd.politeismo.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.qsd.politeismo.ecommerce.controller.dto.FavoritoDTO;
import br.com.qsd.politeismo.ecommerce.controller.dto.ItemPedidoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormFavorito;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Favoritos;
import br.com.qsd.politeismo.ecommerce.entities.ItemPedido;
import br.com.qsd.politeismo.ecommerce.entities.PedidoProdutoID;
import br.com.qsd.politeismo.ecommerce.entities.Produto;
import br.com.qsd.politeismo.ecommerce.repository.ClienteRepository;
import br.com.qsd.politeismo.ecommerce.repository.FavoritoRepository;
import br.com.qsd.politeismo.ecommerce.repository.ProdutoRepository;

@Service
public class FavoritoService {
	
	@Autowired
	private FavoritoRepository favoritoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@Transactional(readOnly = true)
	public List<FavoritoDTO> findAll() {
		List<Favoritos> list = favoritoRepository.findAll();
		return list.stream().map(x-> new FavoritoDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public FavoritoDTO findById(Long id_favoritos) {
		Favoritos entity = favoritoRepository.findById(id_favoritos).get();
		FavoritoDTO dto = new FavoritoDTO(entity);
		return dto;
	}

	@Transactional
	public FavoritoDTO insert(FormFavorito form) {
		Favoritos entity = new Favoritos();
		List <Produto> produtos = new ArrayList<> ();
		Optional <Cliente> clientes = clienteRepository.findById(Long.parseLong(form.getCliente()));
		Optional <Produto> produto = produtoRepository.findById(Long.parseLong(form.getProduto()));
		
		if(clientes.isPresent() && produto.isPresent()) {
			
			entity.setCliente(clientes.get());
			produtos.add(produto.get());
			entity.setProdutos(produtos);
			entity = favoritoRepository.save(entity);
	
		}else {
			clientes.orElseThrow();
			produto.orElseThrow();	
			
		}

		return new FavoritoDTO(entity);
		
	    }

	
	public void deletar(Long id) {
		favoritoRepository.deleteById(id);
	}
	


}