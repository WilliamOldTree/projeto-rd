package br.com.rd.queroserdev.loja.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.queroserdev.loja.mvc.model.ItemNotaFiscal;


@Repository
public interface ItemNotaFiscalRepository extends JpaRepository<ItemNotaFiscal, Long> , CrudRepository<ItemNotaFiscal, Long>{

}
