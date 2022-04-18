package br.com.rd.queroserdev.loja.mvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.loja.mvc.model.TipoStatusEntrega;


@Repository
public interface TipoStatusEntregaRepository extends JpaRepository<TipoStatusEntrega, Long>, CrudRepository<TipoStatusEntrega, Long> {

	public List<TipoStatusEntrega> findAll();


}
