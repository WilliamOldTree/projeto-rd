package br.com.qsd.politeismo.ecommerce.controller;
import java.net.URI;
import java.util.List;
import javax.validation.Valid;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import br.com.qsd.politeismo.ecommerce.controller.dto.ProdutoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormProduto;
import br.com.qsd.politeismo.ecommerce.service.ProdutoService;



@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
	
	
	@Autowired
	private ProdutoService service;
	
	@GetMapping
    public ResponseEntity<List<ProdutoDTO>> findAll(){
    	   List<ProdutoDTO> list = service.findAll();
    	   return ResponseEntity.ok(list);
    	   
	}
	
	@GetMapping(value = "/{id}")
	public ProdutoDTO findById(@PathVariable Long id) {
		   return service.findById(id);
		   
	}
	
	@PostMapping
	public ResponseEntity <ProdutoDTO> insert (@RequestBody FormProduto dto){
	       try { 
	       ProdutoDTO obj = service.insert(dto);
	       URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId_produto()).toUri();
	       return ResponseEntity.created(uri).body(obj);
	     } catch (ServiceException e) {
	       return ResponseEntity.unprocessableEntity().build();
	       
	     }
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<ProdutoDTO> update(@Valid @PathVariable Long id, @RequestBody FormProduto dto){
		   ProdutoDTO obj = service.update(id, dto);
		   return ResponseEntity.ok().body(obj);
		   
	}
	
	@DeleteMapping(value= "/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id){
		   service.deletar(id);
		   return ResponseEntity.noContent().build();
		   
	}

}//end
