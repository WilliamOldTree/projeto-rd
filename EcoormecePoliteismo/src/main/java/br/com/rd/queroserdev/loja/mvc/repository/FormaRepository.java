package br.com.rd.queroserdev.loja.mvc.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.loja.mvc.model.Forma;

@Repository
public interface FormaRepository extends JpaRepository<Forma, Long>, CrudRepository<Forma, Long> {

	public List<Forma> findAll();

}