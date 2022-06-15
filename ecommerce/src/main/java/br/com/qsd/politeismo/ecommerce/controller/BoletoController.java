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
import br.com.qsd.politeismo.ecommerce.controller.dto.BoletoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormBoleto;
import br.com.qsd.politeismo.ecommerce.service.BoletoService;


@RestController
@RequestMapping(value = "/boleto")
public class BoletoController {

	
	@Autowired
	private BoletoService boleto;
	
	@GetMapping
    public ResponseEntity<List<BoletoDTO>> findAll(){
    	List<BoletoDTO> list = boleto.findAll();
    	return ResponseEntity.ok(list);
    }
	
	@GetMapping(value = "/{id}")
	public BoletoDTO findById(@PathVariable Long id) {
		return boleto.findById(id);
    }
	
	
	@PostMapping (value = "/novo")
	public ResponseEntity<BoletoDTO> insert (@RequestBody FormBoleto dto){
	    try { 
	    	BoletoDTO entity = boleto.insert(dto);
	        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(entity.getId()).toUri();
	        return ResponseEntity.created(uri).body(entity);
	     } catch (ServiceException e) {
	           return ResponseEntity.unprocessableEntity().build();
	     }
	}
	
	@PutMapping(value = "/novo")
	public ResponseEntity< BoletoDTO> update(@Valid @PathVariable Long id, @RequestBody FormBoleto dto){
        BoletoDTO obj = boleto.update(id, dto);
		return ResponseEntity.ok().body(obj);
	}
	
}//End Class
