package br.com.rd.politeismo.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.rd.politeismo.ecommerce.orm.ItemNotaFiscal;

public interface ItemNotaFiscalRepository extends JpaRepository<ItemNotaFiscal, Long> , CrudRepository<ItemNotaFiscal, Long>{

}
