package br.com.qsd.politeismo.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.qsd.politeismo.ecommerce.controller.dto.ProdutoCardDTO;
import br.com.qsd.politeismo.ecommerce.controller.dto.ProdutoDTO;
import br.com.qsd.politeismo.ecommerce.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	@Query(value = "select p from Produto p where upper(trim(p.nome)) like %?1%")
	List<ProdutoDTO> buscarPorNome (String nome);
	
	@Query(value = "select p from Produto p where upper(trim(p.descricao)) like %?1%")
	List<ProdutoDTO> buscarPorDescricao (String descricao);
	
//	@Query(value = "select * from produto p inner join categoria c on p.fk_id_categoria = c.id_categoria"
//			+ " where c.nome = :categoria", nativeQuery = true)
//	List<Produto> findProdutosPorCategoria(@Param("categoria")String categoria); 
	
	//@Query(value = "select p from produto p JOIN FETCH p.categoria where p.idProduto = :id")
	List<ProdutoDTO> findByCategoriaNome(String nome); 
	
	List<ProdutoDTO> findByDescricao(String nome); 
    
	List<ProdutoDTO> findByProdutoDestaqueId(Long id); 

	List<ProdutoDTO> findByCategoriaIdCategoria(Long id); 

	List<ProdutoDTO> findByDepartamentoIdDepartamento(Long id); 


}
