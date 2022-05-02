package br.com.qsd.politeismo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.qsd.politeismo.ecommerce.entities.Cliente;



@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>, CrudRepository<Cliente,Long>{

}
