package br.com.qsd.politeismo.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import br.com.qsd.politeismo.ecommerce.controller.dto.ProdutoCardDTO;
import br.com.qsd.politeismo.ecommerce.entities.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, Long>{
	
	@Query(value = "select p from Produto p where upper(trim(p.nome)) like %?1%")
	List<ProdutoCardDTO> buscarPorNome (String name);
	
	@Query(value = "select p from Produto p where upper(trim(p.descricao)) like %?1%")
	List<ProdutoCardDTO> buscarPorDescricao (String descricao);
	
//	@Query(value = "select * from produto p inner join categoria c on p.fk_id_categoria = c.id_categoria"
//			+ " where c.nome = :categoria", nativeQuery = true)
//	List<Produto> findProdutosPorCategoria(@Param("categoria")String categoria); 
	
//	@Query(value = "select p from produto p JOIN FETCH p.categoria where p.idProduto = :id")
//	List<Produto> findProdutosPorCategoria(@Param("id")Long id); 

       
}


