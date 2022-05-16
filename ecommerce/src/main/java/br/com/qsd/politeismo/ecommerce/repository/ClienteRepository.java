package br.com.qsd.politeismo.ecommerce.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.qsd.politeismo.ecommerce.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	Optional<Cliente> findById(String cliente);

	//Optional<Cliente> findByNome(String string);

}
