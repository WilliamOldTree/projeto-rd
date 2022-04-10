package br.com.rd.politeismo.ecommerce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.politeismo.ecommerce.orm.Estoque;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long>, CrudRepository<Estoque, Long> {

	public List<Estoque> findAll();

}
