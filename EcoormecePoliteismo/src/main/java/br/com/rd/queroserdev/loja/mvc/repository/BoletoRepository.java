package br.com.rd.queroserdev.loja.mvc.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.loja.mvc.model.Boleto;

@Repository
public interface BoletoRepository extends JpaRepository<Boleto, Long>, CrudRepository<Boleto, Long>{
	
	public List<Boleto> findAll();

}
