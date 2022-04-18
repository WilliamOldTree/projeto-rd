package br.com.rd.queroserdev.loja.mvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.loja.mvc.model.FormaEntrega;


@Repository
public interface FormaEntregaRepository  extends JpaRepository<FormaEntrega, Long>, CrudRepository<FormaEntrega, Long> {
	
	public List<FormaEntrega> findAll();

}
