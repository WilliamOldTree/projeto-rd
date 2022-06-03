package br.com.qsd.politeismo.ecommerce.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.com.qsd.politeismo.ecommerce.controller.dto.ProdutoCardDTO;
import br.com.qsd.politeismo.ecommerce.controller.dto.ProdutoDTO;
import br.com.qsd.politeismo.ecommerce.entities.Produto;
import br.com.qsd.politeismo.ecommerce.repository.ProdutoRepository;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
  
	/* LISTAR TODOS */
	
	@GetMapping	
	public List<ProdutoDTO> listaProdutos(){
		
			List<Produto> produtos = produtoRepository.findAll();
			return ProdutoDTO.converter(produtos);
	}
	
	@GetMapping("cards")
	public List<ProdutoCardDTO> listaCards(){
		
			List<Produto> produtos = produtoRepository.findAll();
			return ProdutoCardDTO.converter(produtos);
	}
	
	
	/* BUSCAR POR ID */
	
	@GetMapping("/{id}")
	public ResponseEntity<ProdutoDTO> listarProdutoPorID(@PathVariable("id") Long id) {
		Optional<Produto> produto = produtoRepository.findById(id);

		if (produto.isPresent()) {
			return ResponseEntity.ok(new ProdutoDTO(produto.get()));
		}

		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("cards/{id}")
	public ResponseEntity<ProdutoDTO> listarCardPorID(@PathVariable("id") Long id) {
		Optional<Produto> produto = produtoRepository.findById(id);

		if (produto.isPresent()) {
			return ResponseEntity.ok(new ProdutoDTO(produto.get()));
		}

		return ResponseEntity.notFound().build();
	}

	
	/* BUSCAR POR NOME */
	
	@GetMapping(value = "buscarpornome") /* Mapeia a URL */
	public ResponseEntity<List<ProdutoDTO>> buscarpornome(@RequestParam(name = "nome") String nome) {

		List<ProdutoDTO> produto = produtoRepository.buscarPorNome(nome.trim().toUpperCase());
		return new ResponseEntity<List<ProdutoDTO>>(produto, HttpStatus.OK);
	}
	
	@GetMapping(value = "buscarpordescricao") /* Mapeia a URL */
	public ResponseEntity<List<ProdutoDTO>> findByDescricao(@RequestParam(name = "descricao") String descricao) {

		List<ProdutoDTO> produto = produtoRepository.buscarPorDescricao(descricao.trim().toUpperCase());
		return new ResponseEntity<List<ProdutoDTO>>(produto, HttpStatus.OK);
	}
	
	
	/* BUSCAR CATEGORIA POR NOME */
	
	@GetMapping("/buscarpornomecategoria") /* Mapeia a URL */
	public ResponseEntity<List<ProdutoDTO>> findByCategoriaNome (String nome) {

		List<ProdutoDTO> produto = produtoRepository.findByCategoriaNome(nome.trim().toUpperCase());
		return new ResponseEntity<List<ProdutoDTO>>(produto, HttpStatus.OK);
	}
	
	/* BUSCAR DESCONTO POR ID (PRODUTOS DESTAQUE) */

	@GetMapping(value = "destaque") /* Mapeia a URL */
	public ResponseEntity<List<ProdutoDTO>> findByProdutoDestaqueId(@RequestParam(name = "id") Long id) {

		List<ProdutoDTO> produto = produtoRepository.findByProdutoDestaqueId(id);
		return new ResponseEntity<List<ProdutoDTO>>(produto, HttpStatus.OK);
	}
	
	/* BUSCAR CATEGORIA POR ID */

	@GetMapping(value = "categoria") /* Mapeia a URL */
	public ResponseEntity<List<ProdutoDTO>> findByCategoriaIdCategoria(@RequestParam(name = "id") Long id) {

		List<ProdutoDTO> produto = produtoRepository.findByCategoriaIdCategoria(id);
		return new ResponseEntity<List<ProdutoDTO>>(produto, HttpStatus.OK);
	}
	
	/* BUSCAR DEPARTAMENTO POR ID */
	
	@GetMapping(value = "departamento") /* Mapeia a URL */
	public ResponseEntity<List<ProdutoDTO>> findByDepartamentoIdDepartamento(@RequestParam(name = "id") Long id) {

		List<ProdutoDTO> produto = produtoRepository.findByDepartamentoIdDepartamento(id);
		return new ResponseEntity<List<ProdutoDTO>>(produto, HttpStatus.OK);
	}
	
	
	
}
