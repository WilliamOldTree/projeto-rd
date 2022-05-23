<<<<<<< HEAD
<<<<<<< HEAD
=======
//package br.com.qsd.politeismo.ecommerce.service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import br.com.qsd.politeismo.ecommerce.controller.dto.FavoritoDTO;
//import br.com.qsd.politeismo.ecommerce.controller.form.FormFavorito;
//import br.com.qsd.politeismo.ecommerce.controller.form.FormProduto;
//import br.com.qsd.politeismo.ecommerce.entities.Favoritos;
//import br.com.qsd.politeismo.ecommerce.repository.FavoritoRepository;
//
//@Service
//public class FavoritoService {
//	
//	@Autowired
//	private FavoritoRepository repository;
//
//	@Transactional(readOnly = true)
//	public List<FavoritoDTO> findAll() {
//		List<Favoritos> list = repository.findAll();
//		return list.stream().map(x-> new FavoritoDTO(x)).collect(Collectors.toList());
//	}
//	
//	@Transactional(readOnly = true)
//	public FavoritoDTO findById(Long id_favoritos) {
//		Favoritos favorito = repository.findById(id_favoritos).get();
//		FavoritoDTO dto = new FavoritoDTO(favorito);
//		return dto;
//	}
//
//	public FavoritoDTO insert(FormFavorito dto) {
//		Favoritos obj = new Favoritos(null, null, null, null);
//		obj.setLista_favoritos(dto.getLista_favoritos());
//		obj= repository.save(obj);
//		return new FavoritoDTO(obj);
//	}
//
//	public FavoritoDTO update(@Valid Long id, FormProduto dto) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void deletar(Long id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
=======
>>>>>>> 421972d200574f03f92aadedc3dc360b4ac2d26c
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
<<<<<<< HEAD
=======
//package br.com.qsd.politeismo.ecommerce.service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import br.com.qsd.politeismo.ecommerce.controller.dto.FavoritoDTO;
//import br.com.qsd.politeismo.ecommerce.controller.form.FormFavorito;
//import br.com.qsd.politeismo.ecommerce.controller.form.FormProduto;
//import br.com.qsd.politeismo.ecommerce.entities.Favoritos;
//import br.com.qsd.politeismo.ecommerce.repository.FavoritoRepository;
//
//@Service
//public class FavoritoService {
//	
//	@Autowired
//	private FavoritoRepository repository;
//
//	@Transactional(readOnly = true)
//	public List<FavoritoDTO> findAll() {
//		List<Favoritos> list = repository.findAll();
//		return list.stream().map(x-> new FavoritoDTO(x)).collect(Collectors.toList());
//	}
//	
//	@Transactional(readOnly = true)
//	public FavoritoDTO findById(Long id_favoritos) {
//		Favoritos favorito = repository.findById(id_favoritos).get();
//		FavoritoDTO dto = new FavoritoDTO(favorito);
//		return dto;
//	}
//
//	public FavoritoDTO insert(FormFavorito dto) {
//		Favoritos obj = new Favoritos(null, null, null, null);
//		obj.setLista_favoritos(dto.getLista_favoritos());
//		obj= repository.save(obj);
//		return new FavoritoDTO(obj);
//	}
//
//	public FavoritoDTO update(@Valid Long id, FormProduto dto) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void deletar(Long id) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
>>>>>>> 29b5b77eea07f6485c978e0cab6c6e22791a6025
=======
>>>>>>> 4c080c22c4c7cdd9603e7a8907c133b2dea15553
>>>>>>> 421972d200574f03f92aadedc3dc360b4ac2d26c
