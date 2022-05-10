package br.com.rd.qsd.politeismo.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rd.qsd.politeismo.ecommerce.entities.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long>{
}
