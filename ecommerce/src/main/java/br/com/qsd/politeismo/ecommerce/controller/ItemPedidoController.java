package br.com.qsd.politeismo.ecommerce.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.qsd.politeismo.ecommerce.controller.dto.ItemPedidoDTO;
import br.com.qsd.politeismo.ecommerce.controller.dto.ItemPedidoDetalheDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormItemPedido;
import br.com.qsd.politeismo.ecommerce.entities.ItemPedido;
import br.com.qsd.politeismo.ecommerce.entities.Pedido;
import br.com.qsd.politeismo.ecommerce.repository.PedidoRepository;
import br.com.qsd.politeismo.ecommerce.service.ItemPedidoService;

@RestController
@RequestMapping(value = "/itensPedido")
public class ItemPedidoController {
	
	@Autowired
	private ItemPedidoService itemService;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping
    public ResponseEntity<List<ItemPedidoDetalheDTO>> findAll(){
    	List<ItemPedidoDetalheDTO> list = itemService.findAll();
    	return ResponseEntity.ok(list);
    }
	
	@PostMapping("/novo")
	public ResponseEntity <ItemPedidoDTO> insert (@RequestBody List<FormItemPedido> dto){
		
		for(int i = 0; i < dto.size(); i++) {	
			ItemPedidoDTO entity = itemService.insert(dto.get(i));	
		}
		
		return null;
	}
	
	@GetMapping("/pedido={id}/items")
	public ResponseEntity<List<ItemPedidoDetalheDTO>> visualizar(@PathVariable("id") Long id) {

		Optional<Pedido> pedido = pedidoRepository.findById(id);

		if (pedido.isPresent()) {
			List<ItemPedido> itemPedido;
			itemPedido = pedido.get().getItensPedido();
			return ResponseEntity.ok().body(ItemPedidoDetalheDTO.converter(itemPedido));
		}
		return ResponseEntity.notFound().build();
	}


}//end class
