package br.com.rd.politeismo.ecommerce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.rd.politeismo.ecommerce.orm.ProdutosDestaque;

public interface ProdutosDestaqueRepository extends JpaRepository<ProdutosDestaque, Long>, CrudRepository<ProdutosDestaque, Long> {

	public List<ProdutosDestaque> findAll();

}
