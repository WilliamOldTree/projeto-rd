package br.com.qsd.politeismo.ecommerce.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.qsd.politeismo.ecommerce.controller.dto.ItemPedidoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormItemPedido;
import br.com.qsd.politeismo.ecommerce.service.ItemPedidoService;

@RestController
@RequestMapping(value = "/itensPedido")
public class ItemPedidoController {
	
	@Autowired
	private ItemPedidoService itemService;
	
	@GetMapping
    public ResponseEntity<List<ItemPedidoDTO>> findAll(){
    	List<ItemPedidoDTO> list = itemService.findAll();
    	return ResponseEntity.ok(list);
    }
	
	
	
	@PostMapping
	public ResponseEntity <ItemPedidoDTO> insert (@RequestBody List<FormItemPedido> dto){
		
		for(int i = 0; i < dto.size(); i++) {	
			ItemPedidoDTO entity = itemService.insert(dto.get(i));	
		}
		
		return null;
	}

//	@PostMapping
//	public ResponseEntity <ItemPedidoDTO> insert (@RequestBody FormItemPedido dto){
//	    try { 
//	    	ItemPedidoDTO entity = itemService.insert(dto);
//	        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(entity.getPedidoProdutoID()).toUri();
//	        
//	        return ResponseEntity.created(uri).body(entity);
//	     } catch (ServiceException e) {
//	           return ResponseEntity.unprocessableEntity().build();
//	     }
//	}
}
