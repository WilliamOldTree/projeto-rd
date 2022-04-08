package br.com.rd.politeismo.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.politeismo.ecommerce.orm.Juridica;

@Repository
public interface JuridicaRepository  extends JpaRepository<Juridica, Long>, CrudRepository<Juridica, Long>{
	

}
