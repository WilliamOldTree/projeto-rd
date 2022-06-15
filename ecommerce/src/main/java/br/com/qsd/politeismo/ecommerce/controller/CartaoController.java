package br.com.qsd.politeismo.ecommerce.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

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
import br.com.qsd.politeismo.ecommerce.controller.dto.CartaoDTO;
import br.com.qsd.politeismo.ecommerce.controller.dto.PedidoDTO;
import br.com.qsd.politeismo.ecommerce.controller.form.FormCartao;
import br.com.qsd.politeismo.ecommerce.entities.Cartao;
import br.com.qsd.politeismo.ecommerce.entities.Cliente;
import br.com.qsd.politeismo.ecommerce.entities.Pedido;
import br.com.qsd.politeismo.ecommerce.repository.ClienteRepository;
import br.com.qsd.politeismo.ecommerce.service.CartaoService;


@RestController
@RequestMapping(value = "/cartoes")
public class CartaoController {

	
@Autowired
private CartaoService fc;
	
@Autowired
private ClienteRepository clienteRepository;

	
	@GetMapping
    public ResponseEntity<List<CartaoDTO>> findAll(){
    	List<CartaoDTO> list = fc.findAll();
    	return ResponseEntity.ok(list);
    }
	
	@GetMapping(value = "/{id}")
	public CartaoDTO findById(@PathVariable Long id) {
		return fc.findById(id);
    }
	
	@PostMapping
	public ResponseEntity<CartaoDTO> insert (@RequestBody FormCartao dto){
	    try { 
	    	CartaoDTO entity = fc.insert(dto);
	        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(entity.getId_cartao()).toUri();
	        return ResponseEntity.created(uri).body(entity);
	     } catch (ServiceException e) {
	           return ResponseEntity.unprocessableEntity().build();
	     }
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity< CartaoDTO> update(@Valid @PathVariable Long id, @RequestBody FormCartao dto){
        CartaoDTO obj = fc.update(id, dto);
		return ResponseEntity.ok().body(obj);
	}
	
	
	
	@DeleteMapping(value= "/{id}")
	public ResponseEntity<Void> deletar(@PathVariable Long id){
		fc.deletar(id);
		return ResponseEntity.noContent().build();
	}
	@GetMapping("/{id}/cartoes")
	public List<CartaoDTO> listaPedido(@PathVariable Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		List<Cartao> cartao = cliente.get().getCartao();
		return CartaoDTO.converter(cartao);
    }
	
	
}//End Class
