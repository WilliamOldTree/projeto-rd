package br.com.rd.politeismo.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.politeismo.ecommerce.orm.Fisica;

@Repository
public interface FisicaRepository  extends JpaRepository<Fisica, Long>, CrudRepository<Fisica, Long>{
	
}
