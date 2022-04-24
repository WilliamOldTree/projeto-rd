package br.com.rd.politeismo.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.politeismo.ecommerce.orm.Entrega;


@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long>, CrudRepository<Entrega, Long>{

	public List<Entrega> findAll();
}
