package br.com.qsd.politeismo.ecommerce.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.qsd.politeismo.ecommerce.controller.dto.FavoritoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormFavorito;
import br.com.qsd.politeismo.ecommerce.controller.form.FormProduto;
import br.com.qsd.politeismo.ecommerce.entities.Favoritos;
import br.com.qsd.politeismo.ecommerce.repository.FavoritoRepository;

@Service
public class FavoritoService {
	
	@Autowired
	private FavoritoRepository repository;

	@Transactional(readOnly = true)
	public List<FavoritoDTO> findAll() {
		List<Favoritos> list = repository.findAll();
		return list.stream().map(x-> new FavoritoDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public FavoritoDTO findById(Long id_favoritos) {
		Favoritos favorito = repository.findById(id_favoritos).get();
		FavoritoDTO dto = new FavoritoDTO(favorito);
		return dto;
	}

	public FavoritoDTO insert(FormFavorito dto) {
		Favoritos obj = new Favoritos(null, null, null, null);
		obj.setLista_favoritos(dto.getLista_favoritos());
		obj= repository.save(obj);
		return new FavoritoDTO(obj);
	}

	public FavoritoDTO update(@Valid Long id, FormProduto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletar(Long id) {
		// TODO Auto-generated method stub
		
	}

}
