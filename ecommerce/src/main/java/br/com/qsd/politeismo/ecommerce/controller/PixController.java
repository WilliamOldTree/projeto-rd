package br.com.qsd.politeismo.ecommerce.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.qsd.politeismo.ecommerce.controller.dto.PixDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormPix;
import br.com.qsd.politeismo.ecommerce.service.PixService;

@RestController
@RequestMapping(value="/pix")
public class PixController {
	
	@Autowired
	private PixService pix;
	
	@GetMapping
	public ResponseEntity<List<PixDTO>> findAll() {
		List<PixDTO> list = pix.findAll();
		return ResponseEntity.ok(list);
		
	}
	
	@GetMapping(value="/{id}")
	public PixDTO findById(@PathVariable Long id) {
		return pix.findById(id);
	}
	
	@PostMapping(value="/novo")
	public ResponseEntity<PixDTO> insert(@RequestBody FormPix dto) {
		try{
			PixDTO entity = pix.insert(dto);
			URI uri= ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(entity.getId()).toUri();
			return ResponseEntity.created(uri).body(entity);
		
		} catch(ServiceException e) {
			return ResponseEntity.unprocessableEntity().build();
		
	}
		
	}
		@PutMapping(value="/{id}")
		public ResponseEntity<PixDTO>update(@Valid @PathVariable Long id, @RequestBody FormPix dto){
			PixDTO obj = pix.update(id, dto);
			return ResponseEntity.ok().body(obj);
			
		}
		
	}//End Class
	
