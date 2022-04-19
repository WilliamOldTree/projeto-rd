package br.com.rd.politeismo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.rd.politeismo.ecommerce.orm.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>, CrudRepository<Cliente,Long>{

}
