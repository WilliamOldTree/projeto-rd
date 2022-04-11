package br.com.rd.politeismo.ecommerce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.rd.politeismo.ecommerce.orm.StatusEntrega;

public interface StatusEntregaRepository extends JpaRepository<StatusEntrega, Long>, CrudRepository<StatusEntrega, Long> {

	public List<StatusEntrega> findAll();

}
