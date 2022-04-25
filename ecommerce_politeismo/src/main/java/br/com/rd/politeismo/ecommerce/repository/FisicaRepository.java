package br.com.rd.politeismo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.politeismo.ecommerce.entities.Fisica;


@Repository
public interface FisicaRepository  extends JpaRepository<Fisica, Long>, CrudRepository<Fisica, Long>{
	
}
