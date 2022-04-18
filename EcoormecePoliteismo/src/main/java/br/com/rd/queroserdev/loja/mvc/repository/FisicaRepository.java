package br.com.rd.queroserdev.loja.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.loja.mvc.model.Fisica;


@Repository
public interface FisicaRepository  extends JpaRepository<Fisica, Long>, CrudRepository<Fisica, Long>{
	
}
