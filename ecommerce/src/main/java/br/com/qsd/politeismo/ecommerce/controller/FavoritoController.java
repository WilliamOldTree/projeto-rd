package br.com.qsd.politeismo.ecommerce.controller;

import java.net.URI;
import java.util.List;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.qsd.politeismo.ecommerce.controller.dto.FavoritoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormFavorito;
import br.com.qsd.politeismo.ecommerce.service.FavoritoService;

@RestController
@RequestMapping(value = "/favoritos")
public class FavoritoController {

	@Autowired
	private FavoritoService favoritoService;

	@GetMapping
	public ResponseEntity<List<FavoritoDTO>> findAll() {
		List<FavoritoDTO> list = favoritoService.findAll();
		return ResponseEntity.ok(list);

	}

	@GetMapping(value = "/{id}")
	public FavoritoDTO findById(@PathVariable Long id) {
		return favoritoService.findById(id);

	}

	@PostMapping
	public ResponseEntity<FavoritoDTO> insert(@RequestBody FormFavorito dto) {
		try {
			FavoritoDTO obj = favoritoService.insert(dto);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId_favoritos())
					.toUri();
			return ResponseEntity.created(uri).body(obj);
		} catch (ServiceException e) {
			return ResponseEntity.unprocessableEntity().build();

		}
	}


	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id) {
		favoritoService.deletar(id);
		return ResponseEntity.noContent().build();

	}

}// end