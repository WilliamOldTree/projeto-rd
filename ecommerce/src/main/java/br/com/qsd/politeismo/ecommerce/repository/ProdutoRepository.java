 package br.com.qsd.politeismo.ecommerce.repository;

 import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.data.repository.CrudRepository;

import br.com.qsd.politeismo.ecommerce.entities.Produto;
 
 
public interface ProdutoRepository extends JpaRepository<Produto, Long>, CrudRepository<Produto,Long> {

}
